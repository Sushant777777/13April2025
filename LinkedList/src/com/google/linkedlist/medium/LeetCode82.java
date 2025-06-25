package com.google.linkedlist.medium;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class LeetCode82 {
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(3);
		listNode.next.next.next.next = new ListNode(4);
		listNode.next.next.next.next.next = new ListNode(4);
		listNode.next.next.next.next.next.next = new ListNode(5);

		ListNode deleteDuplicates = deleteDuplicates(listNode);
	}

	public static ListNode deleteDuplicates(ListNode head) {

		ListNode listNode = new ListNode(0);
		listNode.next = head;

		ListNode pre = listNode;

		ListNode current = head;

		while (current != null) {
			while (current.next != null && current.val == current.next.val) {
				current = current.next;
			}

			if (pre.next == current) {
				pre = pre.next;
			} else {
				pre.next = current.next;
			}

			current = current.next;
		}

		return listNode.next;
	}
}
