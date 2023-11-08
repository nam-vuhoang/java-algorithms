package org.namvu.codility.lesson15_CatepillarMethod;

/**
 * [EASY] AbsDistinct
 *
 * Compute number of distinct absolute values of sorted array elements.
 *
 * A non-empty array A consisting of N numbers is given. The array is sorted in
 * non-decreasing order. The absolute distinct count of this array is the number
 * of distinct absolute values among the elements of the array.
 *
 * For example, consider array A such that:
 *
 * A[0] = -5 A[1] = -3 A[2] = -1 A[3] = 0 A[4] = 3 A[5] = 6 The absolute
 * distinct count of this array is 5, because there are 5 distinct absolute
 * values among the elements of this array, namely 0, 1, 3, 5 and 6.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A consisting of N numbers, returns absolute
 * distinct count of array A.
 *
 * For example, given array A such that:
 *
 * A[0] = -5 A[1] = -3 A[2] = -1 A[3] = 0 A[4] = 3 A[5] = 6 the function should
 * return 5, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [−2,147,483,648..2,147,483,647]; array A is sorted
 * in non-decreasing order.
 *
 * @see https://app.codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/
 */
class Task15_01_AbsDistinct {

	/**
	 * Detected time complexity: O(N) or O(N*log(N))
	 *
	 * @see https://app.codility.com/demo/results/trainingP7CTF4-AJD/
	 *
	 */
	public int solution(int[] A) {
		int count = 0;

		int leftIndex = 0;
		int rightIndex = A.length - 1;

		// skip all Integer.MIN_VALUE because
		// Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE < 0
		if (A[0] == Integer.MIN_VALUE) {
			count++;
			for (; leftIndex <= rightIndex; leftIndex++) {
				if (A[leftIndex] != Integer.MIN_VALUE) {
					break;
				}
			}
		}

		// convert all negative values to positive
		for (int i = leftIndex; i <= rightIndex && A[i] < 0; i++) {
			A[i] = -A[i];
		}

		// for every distinct currentAbs, skip all number from left and from right that
		// have the value==currentAbs
		int currentAbs;
		int nextLeft = A[leftIndex];
		int nextRight = A[rightIndex];
		while ((currentAbs = Math.max(nextLeft, nextRight)) >= 0) {
			count++;

			nextLeft = -1;
			while (leftIndex <= rightIndex) {
				if (A[leftIndex] == currentAbs) {
					leftIndex++;
				} else {
					nextLeft = A[leftIndex];
					break;
				}
			}

			nextRight = -1;
			while (rightIndex > leftIndex) {
				if (A[rightIndex] == currentAbs) {
					rightIndex--;
				} else {
					nextRight = A[rightIndex];
					break;
				}
			}
		}

		return count;
	}

}
