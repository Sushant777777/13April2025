package com.google.linkedlist.medium;

public class LeetCode86 {
	public static void main(String[] args) {

		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(4);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(2);
		listNode.next.next.next.next = new ListNode(5);
		listNode.next.next.next.next.next = new ListNode(2);

		int x = 3;

		ListNode partition = partition(listNode, x);
	}

	public static ListNode partition(ListNode head, int x) {
		ListNode before = new ListNode(0);
		ListNode after = new ListNode(0);

		ListNode before_curr = before;
		ListNode after_curr = after;

		while (head != null) {

			if (head.val < x) {
				before_curr.next = head;
				before_curr = before_curr.next;
			} else {
				after_curr.next = head;
				after_curr = after_curr.next;
			}
			head = head.next;
		}

		after_curr.next = null;
		before_curr.next = after.next;

		return before.next;
	}
}
