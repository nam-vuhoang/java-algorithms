package org.namvu.codility.lesson15_CatepillarMethod;

import java.util.Arrays;

import org.namvu.utils.BinarySearchAlgorithm;

/**
 * [MEDIUM] MinAbsSumOfTwo: Find the minimal absolute value of a sum of two
 * elements.
 *
 * Let A be a non-empty array consisting of N integers.
 *
 * The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] +
 * A[Q]|, for 0 ≤ P ≤ Q < N.
 *
 * For example, the following array A:
 *
 * A[0] = 1 A[1] = 4 A[2] = -3 has pairs of indices (0, 0), (0, 1), (0, 2), (1,
 * 1), (1, 2), (2, 2). The abs sum of two for the pair (0, 0) is A[0] + A[0] =
 * |1 + 1| = 2. The abs sum of two for the pair (0, 1) is A[0] + A[1] = |1 + 4|
 * = 5. The abs sum of two for the pair (0, 2) is A[0] + A[2] = |1 + (−3)| = 2.
 * The abs sum of two for the pair (1, 1) is A[1] + A[1] = |4 + 4| = 8. The abs
 * sum of two for the pair (1, 2) is A[1] + A[2] = |4 + (−3)| = 1. The abs sum
 * of two for the pair (2, 2) is A[2] + A[2] = |(−3) + (−3)| = 6. Write a
 * function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A consisting of N integers, returns the minimal
 * abs sum of two for any pair of indices in this array.
 *
 * For example, given the following array A:
 *
 * A[0] = 1 A[1] = 4 A[2] = -3 the function should return 1, as explained above.
 *
 * Given array A:
 *
 * A[0] = -8 A[1] = 4 A[2] = 5 A[3] =-10 A[4] = 3 the function should return
 * |(−8) + 5| = 3.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [−1,000,000,000..1,000,000,000].
 *
 * @see https://app.codility.com/programmers/lessons/15-caterpillar_method/min_abs_sum_of_two/
 */
class Task15_04_MinAbsSumOfTwo {

	/**
	 * Test score: 100%
	 *
	 * Detected time complexity: O(N * log(N))
	 *
	 * @see https://app.codility.com/demo/results/trainingQ8ZGDH-GPC/
	 */
	public int solution(int[] A) {
		final int N = A.length;

		Arrays.sort(A);

		int minIndexNonNegative = BinarySearchAlgorithm.findMinIndex(A, 0, 0, N - 1);
		if (minIndexNonNegative == 0) { // all values are non-negative
			return 2 * A[0];
		} else if (minIndexNonNegative == N) { // all values are negative
			return -2 * A[N - 1];
		}

		// there are both negative and positive numbers
		int i = minIndexNonNegative;
		int j = minIndexNonNegative - 1;
		int minAbsSum = Math.min(2 * A[i], -2 * A[j]); // min sum of two values with same sign
		if (minAbsSum == 0) {
			return 0;
		}

		// for each positive number on the right side, try to find a negative number on
		// the left side that the sum of them are minimum
		for (; i < N; i++) {
			int localMinAbs = Integer.MAX_VALUE;
			int newLocalMinAbs;
			while (j >= 0 && (newLocalMinAbs = Math.abs(A[i] + A[j])) < localMinAbs) {
				localMinAbs = newLocalMinAbs;
				j--;
			}
			if (localMinAbs < minAbsSum) {
				minAbsSum = localMinAbs;
				if (minAbsSum == 0) {
					return 0;
				}
			}

			j++; // in the next loop, start from the previous position
		}

		return minAbsSum;
	}

}
