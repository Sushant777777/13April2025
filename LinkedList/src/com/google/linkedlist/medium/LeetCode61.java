package com.google.linkedlist.medium;

public class LeetCode61 {
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		int k = 2;

		rotateRight(listNode, k);

	}

	public static ListNode rotateRight(ListNode head, int k) {

		if (head == null || head.next == null)
			return head;

		ListNode temp = head;
		int length = 0;

		while (temp != null) {
			temp = temp.next;
			length++;
		}

		int rotation = k % length;

		ListNode last = head;
		ListNode pre = null;

		for (int i = 0; i < rotation; i++) {

			while (last.next != null) {
				pre = last;
				last = last.next;
			}
			last.next = head;
			pre.next = null;
			head = last;

		}
		return head;
	}
}
