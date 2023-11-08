package org.namvu.codility.lesson08_Leader;

import java.util.Arrays;

/**
 * [EASY] EquiLeader
 *
 * Find the index S such that the leaders of the sequences A[0], A[1], ..., A[S]
 * and A[S + 1], A[S + 2], ..., A[N - 1] are the same.
 *
 *
 * A non-empty array A consisting of N integers is given.
 *
 * The leader of this array is the value that occurs in more than half of the
 * elements of A.
 *
 * An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0],
 * A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the
 * same value.
 *
 * For example, given array A such that:
 *
 * A[0] = 4 A[1] = 3 A[2] = 4 A[3] = 4 A[4] = 4 A[5] = 2 we can find two equi
 * leaders:
 *
 * 0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose
 * value is 4. 2, because sequences: (4, 3, 4) and (4, 4, 2) have the same
 * leader, whose value is 4. The goal is to count the number of equi leaders.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A consisting of N integers, returns the number
 * of equi leaders.
 *
 * For example, given:
 *
 * A[0] = 4 A[1] = 3 A[2] = 4 A[3] = 4 A[4] = 4 A[5] = 2 the function should
 * return 2, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [−1,000,000,000..1,000,000,000].
 *
 * https://app.codility.com/programmers/lessons/8-leader/equi_leader/
 *
 */
class L08_02_EquiLeader1 {

	/**
	 * This solution is based on preliminary sorting. Time complexity = O(n log n).
	 * See the better solution below.
	 */
	public int solution(int[] A) {
		System.out.println(Arrays.toString(A));
		if (A.length == 0) {
			return 0;
		}

		int[] sorted = Arrays.copyOf(A, A.length);
		Arrays.sort(sorted);

		int leaderCount = -1;
		int leaderValue = 0;
		int currentValue = sorted[0];
		int currentCount = 1;

		for (int i = 1; i < sorted.length; i++) {
			if (currentValue == sorted[i]) {
				currentCount++;
			} else {
				if (leaderCount < currentCount) {
					leaderValue = currentValue;
					leaderCount = currentCount;
				}

				currentValue = sorted[i];
				currentCount = 1;
			}
		}

		if (leaderCount < currentCount) {
			leaderValue = currentValue;
			leaderCount = currentCount;
		}

		int equiLeaderCount = 0;

		if (leaderCount > A.length / 2) {
			currentCount = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] == leaderValue) {
					currentCount++;
				}

				// Note: the current value A[i] may be different to the leaderValue.
				if (currentCount > (i + 1) / 2 && (leaderCount - currentCount) > (A.length - i - 1) / 2) {
					System.out.printf("Found equileader: A[%d]=%d%n", i, A[i]);
					equiLeaderCount++;
				}
			}
		}

		return equiLeaderCount;
	}

}
