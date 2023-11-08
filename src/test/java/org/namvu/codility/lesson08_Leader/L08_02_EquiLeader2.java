package org.namvu.codility.lesson08_Leader;

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
class L08_02_EquiLeader2 {

	/**
	 * Test score: 100%
	 *
	 * Detected time complexity: O(n)
	 *
	 * This solution is based on the invariant that removing any two different
	 * values do not change the leader. Read the attached PDF!
	 *
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		int leader = 0;
		int stackSize = 0;

		for (int a : A) {
			if (stackSize == 0) {
				// add first value to stack
				leader = a;
				stackSize = 1;
			} else if (leader == a) {
				// add same value to stack
				stackSize++;
			} else {
				// remove both lastValue and A[i]
				stackSize--;
			}
		}

		int equiLeaderCount = 0;

		if (stackSize > 0) {
			int leaderCount = 0;
			for (int a : A) {
				if (a == leader) {
					leaderCount++;
				}
			}

			if (leaderCount > A.length / 2) { // leader found
				int leftLeaderCount = 0;
				for (int i = 0; i < A.length; i++) {
					if (A[i] == leader) {
						leftLeaderCount++;
					}

					int rightLeaderCount = leaderCount - leftLeaderCount;
					if (leftLeaderCount > (i + 1) / 2 && rightLeaderCount > (A.length - i - 1) / 2) { // equiLeader found
						equiLeaderCount++;
					}
				}
			}

		}

		return equiLeaderCount;
	}

}
