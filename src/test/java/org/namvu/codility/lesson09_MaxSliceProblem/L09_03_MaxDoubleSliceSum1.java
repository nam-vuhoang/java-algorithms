package org.namvu.codility.lesson09_MaxSliceProblem;

/**
 * [MEDIUM] MaxDoubleSliceSum
 *
 * Find the maximal sum of any double slice.
 *
 * A non-empty array A consisting of N integers is given.
 *
 * A triplet (X, Y, Z), such that 0 ≤ X < Y < Z < N, is called a double slice.
 *
 * The sum of double slice (X, Y, Z) is the total of A[X + 1] + A[X + 2] + ... +
 * A[Y − 1] + A[Y + 1] + A[Y + 2] + ... + A[Z − 1].
 *
 * For example, array A such that:
 *
 * A[0] = 3 A[1] = 2 A[2] = 6 A[3] = -1 A[4] = 4 A[5] = 5 A[6] = -1 A[7] = 2
 * contains the following example double slices:
 *
 * double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17, double slice (0, 3, 7),
 * sum is 2 + 6 + 4 + 5 − 1 = 16, double slice (3, 4, 5), sum is 0. The goal is
 * to find the maximal sum of any double slice.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A consisting of N integers, returns the maximal
 * sum of any double slice.
 *
 * For example, given:
 *
 * A[0] = 3 A[1] = 2 A[2] = 6 A[3] = -1 A[4] = 4 A[5] = 5 A[6] = -1 A[7] = 2 the
 * function should return 17, because no double slice of array A has a sum of
 * greater than 17.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [3..100,000]; each element of array A is an
 * integer within the range [−10,000..10,000].
 *
 * @see https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_double_slice_sum/
 */
class L09_03_MaxDoubleSliceSum1 {

	/**
	 * Test score: 46% (correctntess: 100%, performance: 0%)
	 *
	 * Time complexity: O(n*n)
	 */
	public int solution(int[] A) {
		if (A.length < 3) {
			return 0;
		}

		int maxEndingAtY = 0;
		int maxSliceBetweenXY = Integer.MIN_VALUE;

		int maxDoubleSlice = Integer.MIN_VALUE;

		for (int y = 1; y < A.length - 1; y++) {
			maxSliceBetweenXY = Math.max(maxSliceBetweenXY, maxEndingAtY);
			maxEndingAtY = Math.max(maxEndingAtY + A[y], A[y]);

			int maxSliceBetweenYZ = Integer.MIN_VALUE;
			int maxEndingAtZ = 0;

			for (int z = y + 1; z < A.length; z++) {
				maxSliceBetweenYZ = Math.max(maxSliceBetweenYZ, maxEndingAtZ);
				maxEndingAtZ += A[z];
			}

			maxDoubleSlice = Math.max(maxDoubleSlice, maxSliceBetweenXY + maxSliceBetweenYZ);
		}

		return maxDoubleSlice;
	}

}
