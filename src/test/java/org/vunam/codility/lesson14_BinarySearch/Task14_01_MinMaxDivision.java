package org.vunam.codility.lesson14_BinarySearch;

/**
 * [MEDIUM] MinMaxDivision
 *
 * Divide array A into K blocks and minimize the largest sum of any block.
 *
 * https://app.codility.com/programmers/lessons/14-binary_search_algorithm/min_max_division/
 *
 * You are given integers K, M and a non-empty array A consisting of N integers.
 * Every element of the array is not greater than M.
 *
 * You should divide this array into K blocks of consecutive elements. The size
 * of the block is any integer between 0 and N. Every element of the array
 * should belong to some block.
 *
 * The sum of the block from X to Y equals A[X] + A[X + 1] + ... + A[Y]. The sum
 * of empty block equals 0.
 *
 * The large sum is the maximal sum of any block.
 *
 * For example, you are given integers K = 3, M = 5 and array A such that:
 *
 * A[0] = 2 A[1] = 1 A[2] = 5 A[3] = 1 A[4] = 2 A[5] = 2 A[6] = 2 The array can
 * be divided, for example, into the following blocks:
 *
 * [2, 1, 5, 1, 2, 2, 2], [], [] with a large sum of 15; [2], [1, 5, 1, 2], [2,
 * 2] with a large sum of 9; [2, 1, 5], [], [1, 2, 2, 2] with a large sum of 8;
 * [2, 1], [5, 1], [2, 2, 2] with a large sum of 6. The goal is to minimize the
 * large sum. In the above example, 6 is the minimal large sum.
 *
 * Write a function:
 *
 * class Solution { public int solution(int K, int M, int[] A); }
 *
 * that, given integers K, M and a non-empty array A consisting of N integers,
 * returns the minimal large sum.
 *
 * For example, given K = 3, M = 5 and array A such that:
 *
 * A[0] = 2 A[1] = 1 A[2] = 5 A[3] = 1 A[4] = 2 A[5] = 2 A[6] = 2 the function
 * should return 6, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N and K are integers within the range [1..100,000]; M is an integer within
 * the range [0..10,000]; each element of array A is an integer within the range
 * [0..M].
 *
 * @see https://app.codility.com/programmers/lessons/14-binary_search_algorithm/min_max_division/
 */
class Task14_01_MinMaxDivision {

	/**
	 * Detected time complexity: O(N*log(N+M))
	 *
	 * @param K number of blocks to divide array A
	 * @param M max array value
	 * @param A array
	 * @return
	 *
	 */
	public int solution(int K, int M, int[] A) {
		int N = A.length;

		// calculate prefixSum array and the min value
		int min = 0;
		int[] prefixSum = new int[N + 1];
		for (int i = 0; i < N; i++) {
			prefixSum[i + 1] = prefixSum[i] + A[i];
			min = Math.max(min, A[i]);
		}

		// max and min block sum limits
		int max = Math.min(prefixSum[N], (N + K - 1) / K * M);
		min = Math.max(min, (max + K - 1) / K);

		while (max > min) {
			int mid = (min + max) / 2;
			if (validateDivision(mid, K, prefixSum)) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}

		return min;
	}

	/**
	 * Validate whether it is possible to divide to K blocks so that each block has
	 * sum not greater than {@code sumLimitPerBlock}, using prefixSum.
	 *
	 * @param sumLimitPerBlock
	 * @param K
	 * @param prefixSum
	 * @return
	 */
	private boolean validateDivision(int sumLimitPerBlock, int K, int[] prefixSum) {
		int count = 0;
		int prefixSumLimit = 0;

		for (int i = 1; i < prefixSum.length; i++) {
			if (prefixSum[i] > prefixSumLimit) {
				count++;
				if (count > K) {
					return false;
				}

				prefixSumLimit = prefixSum[i - 1] + sumLimitPerBlock;
			}
		}

		return true;
	}

}
