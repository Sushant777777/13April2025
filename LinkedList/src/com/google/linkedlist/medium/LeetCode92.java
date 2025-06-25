package com.google.linkedlist.medium;

public class LeetCode92 {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		int left = 2;
		int right = 4;

		ListNode reverseBetween = reverseBetween(listNode, left, right);
		System.out.println(reverseBetween);
	}

	public static ListNode reverseBetween(ListNode head, int left, int right) {

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode currrentNode = head;
		ListNode leftNode = dummy;

		for (int i = 0; i < left - 1; i++) {
			leftNode = leftNode.next;
			currrentNode = currrentNode.next;
		}

		ListNode pre = null;
		ListNode subListed = currrentNode;
		for (int i = 0; i <= right - left; i++) {
			ListNode nextNode = currrentNode.next;
			currrentNode.next = pre;
			pre = currrentNode;
			currrentNode = nextNode;
		}

		leftNode.next = pre;
		subListed.next = currrentNode.next;

		return dummy.next;
	}
}
