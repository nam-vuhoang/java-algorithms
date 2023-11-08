package org.namvu.codility.lesson05_PrefixSums;

/**
 * [MEDIUM] MinAvgTwoSlice: Find the minimal average of any slice containing at
 * least two elements.
 *
 * A non-empty array A consisting of N integers is given. A pair of integers (P,
 * Q), such that 0 ≤ P < Q < N, is called a slice of array A (notice that the
 * slice contains at least two elements). The average of a slice (P, Q) is the
 * sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be
 * precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
 *
 * For example, array A such that:
 *
 * A[0] = 4 A[1] = 2 A[2] = 2 A[3] = 5 A[4] = 1 A[5] = 5 A[6] = 8 contains the
 * following example slices:
 *
 * slice (1, 2), whose average is (2 + 2) / 2 = 2; slice (3, 4), whose average
 * is (5 + 1) / 2 = 3; slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
 * The goal is to find the starting position of a slice whose average is
 * minimal.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A consisting of N integers, returns the
 * starting position of the slice with the minimal average. If there is more
 * than one slice with a minimal average, you should return the smallest
 * starting position of such a slice.
 *
 * For example, given array A such that:
 *
 * A[0] = 4 A[1] = 2 A[2] = 2 A[3] = 5 A[4] = 1 A[5] = 5 A[6] = 8 the function
 * should return 1, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [2..100,000]; each element of array A is an
 * integer within the range [−10,000..10,000].
 *
 * @see https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
 */
public class Lesson05_04_MaxAvgTwoSlice2 {

	/**
	 * Detected time complexity: O(N)
	 *
	 * The key to solve this task is these two patterns: (1) There must be some
	 * slices, with length of two or three, having the minimal average value among
	 * all the slices. (2) And all the longer slices with minimal average are built
	 * up with these 2-element and/or 3-element small slices.
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/training9DHRZX-DW7/
	 */
	public int solution(int[] A) {
		int N = A.length;

		double minAverage = Double.MAX_VALUE;
		int minAverageIndex = 0;

		for (int i = 0; i < N - 2; i++) {
			double average = Math.min(getAverage(A[i], A[i + 1]), getAverage(A[i], A[i + 1], A[i + 2]));
			if (minAverage > average) {
				minAverage = average;
				minAverageIndex = i;
			}
		}

		double average = getAverage(A[N - 2], A[N - 1]);
		if (minAverage > average) {
			minAverage = average;
			minAverageIndex = N - 2;
		}

		return minAverageIndex;
	}

	private static double getAverage(int a, int b) {
		return (a + b) / 2.0;
	}

	private static double getAverage(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}

}
