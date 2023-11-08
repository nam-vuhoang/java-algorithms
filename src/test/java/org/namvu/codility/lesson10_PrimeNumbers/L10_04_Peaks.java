package org.namvu.codility.lesson10_PrimeNumbers;

/**
 * [MEDIUM] PEAKS
 *
 * Divide an array into the maximum number of same-sized blocks, each of which
 * should contain an index P such that A[P - 1] < A[P] > A[P + 1].
 *
 *
 *
 * A non-empty array A consisting of N integers is given.
 *
 * A peak is an array element which is larger than its neighbors. More
 * precisely, it is an index P such that 0 < P < N − 1, A[P − 1] < A[P] and A[P]
 * > A[P + 1].
 *
 * For example, the following array A:
 *
 * A[0] = 1 A[1] = 2 A[2] = 3 A[3] = 4 A[4] = 3 A[5] = 4 A[6] = 1 A[7] = 2 A[8]
 * = 3 A[9] = 4 A[10] = 6 A[11] = 2 has exactly three peaks: 3, 5, 10.
 *
 * We want to divide this array into blocks containing the same number of
 * elements. More precisely, we want to choose a number K that will yield the
 * following blocks:
 *
 * A[0], A[1], ..., A[K − 1], A[K], A[K + 1], ..., A[2K − 1], ... A[N − K], A[N
 * − K + 1], ..., A[N − 1]. What's more, every block should contain at least one
 * peak. Notice that extreme elements of the blocks (for example A[K − 1] or
 * A[K]) can also be peaks, but only if they have both neighbors (including one
 * in an adjacent blocks).
 *
 * The goal is to find the maximum number of blocks into which the array A can
 * be divided.
 *
 * Array A can be divided into blocks as follows:
 *
 * one block (1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2). This block contains three
 * peaks. two blocks (1, 2, 3, 4, 3, 4) and (1, 2, 3, 4, 6, 2). Every block has
 * a peak. three blocks (1, 2, 3, 4), (3, 4, 1, 2), (3, 4, 6, 2). Every block
 * has a peak. Notice in particular that the first block (1, 2, 3, 4) has a peak
 * at A[3], because A[2] < A[3] > A[4], even though A[4] is in the adjacent
 * block. However, array A cannot be divided into four blocks, (1, 2, 3), (4, 3,
 * 4), (1, 2, 3) and (4, 6, 2), because the (1, 2, 3) blocks do not contain a
 * peak. Notice in particular that the (4, 3, 4) block contains two peaks: A[3]
 * and A[5].
 *
 * The maximum number of blocks that array A can be divided into is three.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A consisting of N integers, returns the maximum
 * number of blocks into which A can be divided.
 *
 * If A cannot be divided into some number of blocks, the function should return
 * 0.
 *
 * For example, given:
 *
 * A[0] = 1 A[1] = 2 A[2] = 3 A[3] = 4 A[4] = 3 A[5] = 4 A[6] = 1 A[7] = 2 A[8]
 * = 3 A[9] = 4 A[10] = 6 A[11] = 2 the function should return 3, as explained
 * above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [0..1,000,000,000].
 *
 * @see https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/peaks/
 */
class L10_04_Peaks {
	/**
	 * This solution is based on {@code L10_03_Flags2}.
	 *
	 * Detected time complexity: O(N * log(log(N)))
	 *
	 * @param A
	 * @return
	 *
	 * @see https://app.codility.com/demo/results/trainingG68KMA-8N9/
	 */
	public int solution(int[] A) {
		int N = A.length;
		if (N < 3) {
			return 0;
		}

		// the index of the next peak starting from the current position
		int[] nextPeakIndices = new int[N];
		nextPeakIndices[N - 1] = -1; // the last position can't be a peak

		for (int i = N - 2; i > 0; i--) {
			if (A[i - 1] < A[i] && A[i] > A[i + 1]) { // it is a peak
				nextPeakIndices[i] = i;
			} else { // it is not a peak
				nextPeakIndices[i] = nextPeakIndices[i + 1];
			}
		}

		nextPeakIndices[0] = nextPeakIndices[1]; // the first position can't be a peak neither.

		if (nextPeakIndices[0] == -1) { // no peak exists
			return 0;
		}

		for (int blockSize = 1; blockSize <= N / 2; blockSize++) {
			if (N % blockSize == 0) { // blocks should contain the same number of elements
				int blockCount = N / blockSize;

				int i;
				for (i = 0; i < blockCount; i++) {
					int start = blockSize * i;
					int end = blockSize * (i + 1) - 1;
					if (nextPeakIndices[start] > end || nextPeakIndices[start] == -1) {
						break;
					}
				}

				if (i == blockCount) {
					return blockCount;
				}
			}

		}

		// try to divide to one block
		return 1;
	}
}