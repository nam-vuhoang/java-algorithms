package org.vunam.codility.lesson14_BinarySearch;

import java.util.Arrays;

/**
 * [MEDIUM] NailingPlanks. Count the minimum number of nails that allow a series
 * of planks to be nailed.
 *
 * You are given two non-empty arrays A and B consisting of N integers. These
 * arrays represent N planks. More precisely, A[K] is the start and B[K] the end
 * of the K−th plank.
 *
 * Next, you are given a non-empty array C consisting of M integers. This array
 * represents M nails. More precisely, C[I] is the position where you can hammer
 * in the I−th nail.
 *
 * We say that a plank (A[K], B[K]) is nailed if there exists a nail C[I] such
 * that A[K] ≤ C[I] ≤ B[K].
 *
 * The goal is to find the minimum number of nails that must be used until all
 * the planks are nailed. In other words, you should find a value J such that
 * all planks will be nailed after using only the first J nails. More precisely,
 * for every plank (A[K], B[K]) such that 0 ≤ K < N, there should exist a nail
 * C[I] such that I < J and A[K] ≤ C[I] ≤ B[K].
 *
 * For example, given arrays A, B such that:
 *
 * A[0] = 1 B[0] = 4 A[1] = 4 B[1] = 5 A[2] = 5 B[2] = 9 A[3] = 8 B[3] = 10 four
 * planks are represented: [1, 4], [4, 5], [5, 9] and [8, 10].
 *
 * Given array C such that:
 *
 * C[0] = 4 C[1] = 6 C[2] = 7 C[3] = 10 C[4] = 2 if we use the following nails:
 *
 * 0, then planks [1, 4] and [4, 5] will both be nailed. 0, 1, then planks [1,
 * 4], [4, 5] and [5, 9] will be nailed. 0, 1, 2, then planks [1, 4], [4, 5] and
 * [5, 9] will be nailed. 0, 1, 2, 3, then all the planks will be nailed. Thus,
 * four is the minimum number of nails that, used sequentially, allow all the
 * planks to be nailed.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A, int[] B, int[] C); }
 *
 * that, given two non-empty arrays A and B consisting of N integers and a
 * non-empty array C consisting of M integers, returns the minimum number of
 * nails that, used sequentially, allow all the planks to be nailed.
 *
 * If it is not possible to nail all the planks, the function should return −1.
 *
 * For example, given arrays A, B, C such that:
 *
 * A[0] = 1 B[0] = 4 A[1] = 4 B[1] = 5 A[2] = 5 B[2] = 9 A[3] = 8 B[3] = 10
 *
 * C[0] = 4 C[1] = 6 C[2] = 7 C[3] = 10 C[4] = 2 the function should return 4,
 * as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N and M are integers within the range [1..30,000]; each element of arrays A,
 * B and C is an integer within the range [1..2*M]; A[K] ≤ B[K].
 *
 * @see https://app.codility.com/programmers/lessons/14-binary_search_algorithm/nailing_planks/
 */
class Task14_02_NailingPlanks2 {

	/**
	 * Test score: 100% (correctness: 100%, performance: 100%)
	 *
	 * Detected time complexity: O((N + M) * log(M))
	 *
	 *
	 * @param A plank starts
	 * @param B plank ends
	 * @param C nail positions
	 * @return
	 * @see https://app.codility.com/demo/results/training7BZJH3-32W/
	 */
	public int solution(int[] A, int[] B, int[] C) {
		int N = A.length;
		int M = C.length;

		// we sort nail positions by using a two dimension dimension array which allows
		// to save the original index of array C
		int[][] sortedNails = new int[M][2];
		for (int i = 0; i < M; i++) {
			sortedNails[i][0] = C[i]; // nail position
			sortedNails[i][1] = i; // nail index
		}

		// sort nails by their positions
		Arrays.sort(sortedNails, (int[] x, int[] y) -> x[0] - y[0]);

		// max index between all min nail indices
		int minNailIndex = -1;

		// for each nail, detect the minNailIndex
		// if it is larger than current one, then update the minNailIndex
		// if it is -1 means that the blank cannot be nailed.
		for (int k = 0; k < N; k++) {
			// find min nail index between A[k] and B[k]
			minNailIndex = findMinNailIndex(sortedNails, A[k], B[k], minNailIndex);
			if (minNailIndex == -1) {
				return -1;
			}
		}

		return minNailIndex + 1;
	}

	/**
	 * Find the min index of nails that are between a and b.
	 *
	 * @param sortedNails
	 * @param a
	 * @param b
	 * @return the min index if found, or -1 otherwise.
	 */
	public int findMinNailIndex(int[][] sortedNails, int a, int b, int currentMinIndex) {
		int left = 0;
		int right = sortedNails.length - 1;
		int minIndex = -1;

		// search for most left nail that is located between a (inclusive) and b
		// (inclusive).
		while (left <= right) {
			int mid = (left + right) / 2;
			int c = sortedNails[mid][0];
			if (c < a) {
				left = mid + 1;
			} else if (c > b) {
				right = mid - 1;
			} else {
				right = mid - 1;
				minIndex = mid;

			}
		}

		if (minIndex == -1) { // not found
			return -1;
		}

		int minIndexOriginal = sortedNails[minIndex][1];

		// testing neighbour nails
		for (int i = minIndex; i < sortedNails.length && sortedNails[i][0] <= b; i++) {
			minIndexOriginal = Math.min(minIndexOriginal, sortedNails[i][1]);
			if (minIndexOriginal <= currentMinIndex) {
				return currentMinIndex;
			}
		}

		return minIndexOriginal;
	}
}