package com.google.linkedlist.easy;

public class LeetCode21 {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode result = new ListNode(Integer.MAX_VALUE);
		ListNode headNode = result;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				result.next = list1;
				list1 = list1.next;
			} else {
				result.next = list2;
				list2 = list2.next;
			}
			result = result.next;
		}

		if (list1 == null) {
			result.next = list2;
		} else if (list2 == null) {
			result.next = list1;
		}

		return headNode.next;
	}
}
