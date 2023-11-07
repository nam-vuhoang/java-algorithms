package org.vunam.codility.lesson08_Leader;

import java.util.Arrays;

/**
 *
 * https://app.codility.com/programmers/lessons/8-leader/dominator/
 *
 * An array A consisting of N integers is given. The dominator of array A is the
 * value that occurs in more than half of the elements of A.
 *
 * For example, consider array A such that
 *
 * A[0] = 3 A[1] = 4 A[2] = 3 A[3] = 2 A[4] = 3 A[5] = -1 A[6] = 3 A[7] = 3 The
 * dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in
 * those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 *
 * Write a function
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns index of any element
 * of array A in which the dominator of A occurs. The function should return −1
 * if array A does not have a dominator.
 *
 * For example, given array A such that
 *
 * A[0] = 3 A[1] = 4 A[2] = 3 A[3] = 2 A[4] = 3 A[5] = -1 A[6] = 3 A[7] = 3 the
 * function may return 0, 2, 4, 6 or 7, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000]; each element of array A is an
 * integer within the range [−2,147,483,648..2,147,483,647].
 *
 * @see https://app.codility.com/programmers/lessons/8-leader/dominator/
 *
 */
class L08_01_Dominator {

	/**
	 * Test score: 100%
	 *
	 * Detected time complexity: O(N*log(N)) or O(N)
	 *
	 * This solution is based on preliminary sorting.
	 *
	 * @see {@link L08_01_Dominator2} for a faster solution!
	 */
	public int solution(int[] A) {
		if (A.length == 0) {
			return -1;
		}

		int[] sorted = Arrays.copyOf(A, A.length);
		Arrays.sort(sorted);

		int dominatorCount = -1;
		int dominatorValue = 0;
		int currentValue = sorted[0];
		int currentCount = 1;

		for (int i = 1; i < sorted.length; i++) {
			if (currentValue == sorted[i]) {
				currentCount++;
			} else {
				if (dominatorCount < currentCount) {
					dominatorValue = currentValue;
					dominatorCount = currentCount;
				}

				currentValue = sorted[i];
				currentCount = 1;
			}
		}

		if (dominatorCount < currentCount) {
			dominatorValue = currentValue;
			dominatorCount = currentCount;
		}

		if (dominatorCount > A.length / 2) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] == dominatorValue) {
					return i;
				}
			}
		}

		return -1;
	}

}
