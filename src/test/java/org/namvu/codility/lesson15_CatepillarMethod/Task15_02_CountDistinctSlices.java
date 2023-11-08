package org.namvu.codility.lesson15_CatepillarMethod;

/**
 * CountDistinctSlices: Count the number of distinct slices (containing only
 * unique numbers).
 *
 * An integer M and a non-empty array A consisting of N non-negative integers
 * are given. All integers in array A are less than or equal to M.
 *
 * A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of
 * array A. The slice consists of the elements A[P], A[P + 1], ..., A[Q]. A
 * distinct slice is a slice consisting of only unique numbers. That is, no
 * individual number occurs more than once in the slice.
 *
 * For example, consider integer M = 6 and array A such that:
 *
 * A[0] = 3 A[1] = 4 A[2] = 5 A[3] = 5 A[4] = 2 There are exactly nine distinct
 * slices: (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2), (3, 3), (3, 4) and
 * (4, 4).
 *
 * The goal is to calculate the number of distinct slices.
 *
 * Write a function:
 *
 * class Solution { public int solution(int M, int[] A); }
 *
 * that, given an integer M and a non-empty array A consisting of N integers,
 * returns the number of distinct slices.
 *
 * If the number of distinct slices is greater than 1,000,000,000, the function
 * should return 1,000,000,000.
 *
 * For example, given integer M = 6 and array A such that:
 *
 * A[0] = 3 A[1] = 4 A[2] = 5 A[3] = 5 A[4] = 2 the function should return 9, as
 * explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; M is an integer within the
 * range [0..100,000]; each element of array A is an integer within the range
 * [0..M].
 *
 *
 * https://app.codility.com/programmers/lessons/15-caterpillar_method/count_distinct_slices/
 */
class Task15_02_CountDistinctSlices {

	public static final int MAX = 1000000000;

	/**
	 * Detected time complexity: O(N)
	 *
	 * @see https://app.codility.com/demo/results/training3ADFUG-YDV/
	 */
	public int solution(int M, int[] A) {

		int N = A.length;

		long count = 0L;

		int left = 0;

		// stores the last indicies for each value while iterating through the array
		// "lastIndices[value]-1" is the last index of the value.
		int[] lastIndices = new int[M + 1];

		for (int right = 0; right < N; right++) {

			int value = A[right];

			int previous = lastIndices[value] - 1;
			if (previous != -1) { // the value has already appeared
				// add all pairs between left (inclusive) and right (exclusive)
				// reduce all pairs between "previous + 1" (inclusive) and right (exclusive)
				// because they will be counted later
				count += getNumberOfPairs(left, right) - getNumberOfPairs(previous + 1, right);
				if (count >= MAX) {
					return MAX;
				}

				// reset indices of items from "left" to "previous" (inclusive)
				for (; left <= previous; left++) {
					lastIndices[A[left]] = 0;
				}
			}

			lastIndices[value] = right + 1;
		}

		count += getNumberOfPairs(left, N);

		return (int) Math.min(count, MAX);
	}

	/**
	 * Get the number of pairs between left (inclusive) and right (exclusive). For
	 * example: (left, left), (left, left+1), .., (left, left + right-1), (left + 1,
	 * left + 1)...
	 *
	 * @param n
	 * @return
	 */
	private static long getNumberOfPairs(int left, int right) {
		long n = right - left;
		return (n + 1) * n / 2;
	}

}
