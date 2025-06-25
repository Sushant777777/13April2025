package com.google.linkedlist.medium;

public class LeetCode2 {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(2);
		listNode.next = new ListNode(4);
		listNode.next.next = new ListNode(3);

		ListNode listNode2 = new ListNode(5);
		listNode2.next = new ListNode(6);
		listNode2.next.next = new ListNode(4);

		addTwoNumbers(listNode, listNode2);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode listNode = new ListNode(0);
		ListNode ptr = listNode;

		int carry = 0;
		while (l1 != null || l2 != null) {
			int sum = 0 + carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			sum = sum % 10;

			ptr.next = new ListNode(sum);
			ptr = ptr.next;
		}

		if (carry == 1) {
			ptr.next = new ListNode(1);
		}
		return listNode.next;
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