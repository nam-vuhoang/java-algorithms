package org.vunam.codility.lesson06_Sorting;

import java.util.Arrays;

/**
 * [EASY] [100%] Distinct
 *
 * Compute number of distinct values in an array.
 *
 * Write a function
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns the number of
 * distinct values in array A.
 *
 * For example, given array A consisting of six elements such that:
 *
 * A[0] = 2 A[1] = 1 A[2] = 1 A[3] = 2 A[4] = 3 A[5] = 1 the function should
 * return 3, because there are 3 distinct values appearing in array A, namely 1,
 * 2 and 3.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000]; each element of array A is an
 * integer within the range [−1,000,000..1,000,000].
 *
 * @see https://app.codility.com/programmers/lessons/6-sorting/distinct/
 */
class L06_01_Distinct {
	/**
	 * Detected time complexity: O(N*log(N)) or O(N)
	 *
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		if (A.length <= 1) {
			return A.length;
		}

		Arrays.sort(A);
		int count = 1;
		for (int i = 1; i < A.length; i++) {
			if (A[i] != A[i - 1]) {
				count++;
			}
		}
		return count;
	}

	/**
	 *
	 * O(N*log(N)) or O(N)
	 *
	 * @param A
	 * @return
	 */
	public int solution2(int[] A) {
		return (int) Arrays.stream(A).distinct().count();
	}
}
