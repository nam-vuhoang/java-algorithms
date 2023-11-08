package org.namvu.codility.lesson06_Sorting;

import java.util.Arrays;

/**
 *
 * [EASY, 100%] MaxProductOfThree:
 *
 * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 *
 *
 * A non-empty array A consisting of N integers is given. The product of triplet
 * (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 *
 * For example, array A such that:
 *
 * A[0] = -3 A[1] = 1 A[2] = 2 A[3] = -2 A[4] = 5 A[5] = 6 contains the
 * following example triplets:
 *
 * (0, 1, 2), product is −3 * 1 * 2 = −6 (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60 Your goal is to find the maximal product
 * of any triplet.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A, returns the value of the maximal product of
 * any triplet.
 *
 * For example, given array A suc h that:
 *
 * A[0] = -3 A[1] = 1 A[2] = 2 A[3] = -2 A[4] = 5 A[5] = 6 the function should
 * return 60, as the product of triplet (2, 4, 5) is maximal.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [3..100,000]; each element of array A is an
 * integer within the range [−1,000..1,000].
 *
 * @see https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 */
class L06_02_MaxProductOfThree {

	/**
	 * Detected time complexity: O(N * log(N))
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/trainingSJJAM3-UKT/
	 */
	public int solution(int[] A) {
		int N = A.length;
		Arrays.sort(A);

		// after sorting, we test only the 3 smallest and the 3 greatest numbers
		int maxProduct = Integer.MIN_VALUE;
		for (int i = 0; i < 3; i++) {
			int product = 1;

			// multiply a few smallest numbers
			for (int j = 0; j < i; j++) {
				product *= A[j];
			}

			// ... with a few largest numbers
			for (int j = N - (3 - i); j < N; j++) {
				product *= A[j];
			}

			maxProduct = Math.max(maxProduct, product);
		}

		return maxProduct;
	}
}
