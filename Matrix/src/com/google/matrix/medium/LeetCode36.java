package com.google.matrix.medium;

import java.util.HashSet;
import java.util.Set;

public class LeetCode36 {
	public static void main(String[] args) {
		String board[][] = { { "8", "3", ".", ".", "7", ".", ".", ".", "." },
				{ "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".", ".", ".", "6", "." },
				{ "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
				{ "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".", ".", "2", "8", "." },
				{ ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };
		boolean validSudoku = isValidSudoku(board);
		System.out.println(validSudoku);
	}

	public static boolean isValidSudoku(String[][] board) {

		HashSet<String>[] rows = new HashSet[9];
		HashSet<String>[] cols = new HashSet[9];
		HashSet<String>[] boxes = new HashSet[9];

		for (int i = 0; i < 9; i++) {
			rows[i] = new HashSet<>();
			cols[i] = new HashSet<>();
			boxes[i] = new HashSet<>();
		}

		for (int r = 0; r < 9; r++) {
			for (int c = 0; c < 9; c++) {
				if (board[r][c] == ".") {
					continue;
				}

				String value = board[r][c];
				int boxIndex = (r / 3) * 3 + (c / 3);

				if (rows[r].contains(value) || cols[c].contains(value) || boxes[boxIndex].contains(value)) {
					return false;
				}

				rows[r].add(value);
				cols[c].add(value);
				boxes[boxIndex].add(value);
			}
		}

		return true;
	}

}
