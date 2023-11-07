package org.vunam.codility.lesson15_CatepillarMethod;

import java.util.Arrays;

class Task15_04_MinAbsSumOfTwo2 {

	/**
	 * Test score: 100%
	 *
	 * Detected time complexity: O(N * log(N))
	 *
	 * @see https://app.codility.com/demo/results/trainingCSSJQM-K75/
	 */
	public int solution(int[] A) {
		final int N = A.length;

		Arrays.sort(A);

		int left = 0;
		int right = N - 1;

		int minAbsSum = Math.abs(A[left] + A[right]);
		while (left <= right) {
			int sum = A[left] + A[right];

			if (sum <= 0) { // if the sum is negative, try to compensate by moving the left item
				left++;
			} else { // if the sum is positive, try to compensate by moving the right item
				right--;
			}
			minAbsSum = Math.min(minAbsSum, Math.abs(sum));
		}

		return minAbsSum;
	}
}