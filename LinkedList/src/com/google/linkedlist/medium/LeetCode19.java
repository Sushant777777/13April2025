package com.google.linkedlist.medium;

public class LeetCode19 {
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);

		removeNthFromEnd(listNode, 2);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode listNode = new ListNode(0);
		listNode.next = head;

		ListNode dummy = listNode;

		for (int i = 0; i < n; i++) {
			head = head.next;
		}

		while (head != null) {
			head = head.next;
			dummy = dummy.next;
		}

		dummy.next = dummy.next.next;

		return listNode.next;
	}
}
