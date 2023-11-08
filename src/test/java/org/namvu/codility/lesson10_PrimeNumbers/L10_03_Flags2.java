package org.namvu.codility.lesson10_PrimeNumbers;

/**
 * [MEDIUM] Flags
 *
 * Find the maximum number of flags that can be set on mountain peaks.
 *
 * A non-empty array A consisting of N integers is given.
 *
 * A peak is an array element which is larger than its neighbours. More
 * precisely, it is an index P such that 0 < P < N − 1 and A[P − 1] < A[P] > A[P
 * + 1].
 *
 * For example, the following array A:
 *
 * A[0] = 1 A[1] = 5 A[2] = 3 A[3] = 4 A[4] = 3 A[5] = 4 A[6] = 1 A[7] = 2 A[8]
 * = 3 A[9] = 4 A[10] = 6 A[11] = 2 has exactly four peaks: elements 1, 3, 5 and
 * 10.
 *
 * You are going on a trip to a range of mountains whose relative heights are
 * represented by array A, as shown in a figure below. You have to choose how
 * many flags you should take with you. The goal is to set the maximum number of
 * flags on the peaks, according to certain rules.
 *
 *
 *
 * Flags can only be set on peaks. What's more, if you take K flags, then the
 * distance between any two flags should be greater than or equal to K. The
 * distance between indices P and Q is the absolute value |P − Q|.
 *
 * For example, given the mountain range represented by array A, above, with N =
 * 12, if you take:
 *
 * two flags, you can set them on peaks 1 and 5; three flags, you can set them
 * on peaks 1, 5 and 10; four flags, you can set only three flags, on peaks 1, 5
 * and 10. You can therefore set a maximum of three flags in this case.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the maximum number of
 * flags that can be set on the peaks of the array.
 *
 * For example, the following array A:
 *
 * A[0] = 1 A[1] = 5 A[2] = 3 A[3] = 4 A[4] = 3 A[5] = 4 A[6] = 1 A[7] = 2 A[8]
 * = 3 A[9] = 4 A[10] = 6 A[11] = 2 the function should return 3, as explained
 * above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..400,000]; each element of array A is an
 * integer within the range [0..1,000,000,000].
 *
 *
 * @see https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/flags/
 */
class L10_03_Flags2 {
	/**
	 * Test score: 100% (correctness: 100%, performance: 100%)
	 *
	 * Detected time complexity: O(N)
	 *
	 * @param A
	 * @return
	 *
	 * @see Attached solution explanation (PDF).
	 *
	 * @see https://app.codility.com/demo/results/trainingS3KBK2-Z29/
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

		// Try to set flags using the nextPeakIndices array with additional requirement
		// that the minimum distance between flags should be no more than the number of
		// flags.
		int result = 0;

		for (int minDistance = 1; minDistance * (minDistance - 1) < N; minDistance++) {
			int maxFlagCount = minDistance; // as required in the problem
			int flagCount = 0;

			for (int position = 1; position < N && flagCount < maxFlagCount; position += minDistance, flagCount++) {
				position = nextPeakIndices[position];
				if (position == -1) { // no more peak left
					break;
				}
			}

			result = Math.max(result, flagCount);
		}

		return result;
	}
}