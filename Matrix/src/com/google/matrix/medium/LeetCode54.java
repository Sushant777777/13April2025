package com.google.matrix.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> spiralOrder = spiralOrder(matrix);
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();

		int rowStart = 0;
		int rowEnd = matrix.length - 1;

		int colStart = 0;
		int colEnd = matrix[0].length - 1;

		while (rowStart <= rowEnd && colStart <= colEnd) {

			for (int i = colStart; i <= colEnd; i++) {
				result.add(matrix[rowStart][i]);
			}
			rowStart++;

			for (int i = rowStart; i <= rowEnd; i++) {
				result.add(matrix[i][colEnd]);
			}
			colEnd--;

			if (rowStart <= rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					result.add(matrix[rowEnd][i]);
				}
				rowEnd--;
			}

			if (colStart <= colEnd) {
				for (int i = rowEnd; i >= rowStart; i--) {
					result.add(matrix[i][colStart]);
				}
				colStart++;
			}

		}

		return result;
	}
}
