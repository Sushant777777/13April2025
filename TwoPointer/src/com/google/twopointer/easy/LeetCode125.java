package com.google.twopointer.easy;

public class LeetCode125 {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean result = isPalindrome(s);
		System.out.println(result);
	}

	public static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			char startChar = s.charAt(start);
			char endChar = s.charAt(end);
			
			if(!Character.isLetterOrDigit(startChar))
				start++;
			else if(!Character.isLetterOrDigit(endChar))
				end--;
			else {
				if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar))
					return false;
				else
					start++;end--;
			}
		}

		return true;
	}
}
