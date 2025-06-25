package com.google.linkedlist.easy;

public class LeetCode141 {

	public boolean hasCycle(ListNode head) {

		if (head == null)
			return false;

		ListNode slow = head;
		ListNode fast = head.next;

		while (slow != fast) {

			if (fast == null || fast.next == null)
				return false;

			slow = slow.next;
			fast = fast.next.next;
		}
		return true;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
