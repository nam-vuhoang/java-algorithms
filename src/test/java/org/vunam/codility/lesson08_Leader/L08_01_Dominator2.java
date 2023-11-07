package org.vunam.codility.lesson08_Leader;

/**
 *
 * https://app.codility.com/programmers/lessons/8-leader/dominator/
 *
 * An array A consisting of N integers is given. The dominator of array A is the
 * value that occurs in more than half of the elements of A.
 *
 * For example, consider array A such that
 *
 * A[0] = 3 A[1] = 4 A[2] = 3 A[3] = 2 A[4] = 3 A[5] = -1 A[6] = 3 A[7] = 3 The
 * dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in
 * those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 *
 * Write a function
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns index of any element
 * of array A in which the dominator of A occurs. The function should return −1
 * if array A does not have a dominator.
 *
 * For example, given array A such that
 *
 * A[0] = 3 A[1] = 4 A[2] = 3 A[3] = 2 A[4] = 3 A[5] = -1 A[6] = 3 A[7] = 3 the
 * function may return 0, 2, 4, 6 or 7, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000]; each element of array A is an
 * integer within the range [−2,147,483,648..2,147,483,647].
 *
 * @see https://app.codility.com/programmers/lessons/8-leader/dominator/
 *
 */
class L08_01_Dominator2 {

	/**
	 * Test score: 100%
	 *
	 * Detected time complexity: O(n)
	 *
	 * This solution is based on the invariant that removing any two different values do
	 * not change the leader. Read the attached PDF!
	 *
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		int leader = 0; // leader candidate
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

		if (stackSize > 0) { // stack contains a leader candidate
			int leaderCount = 0;
			for (int a : A) {
				if (a == leader) {
					leaderCount++;
				}
			}

			if (leaderCount > A.length / 2) { // leader found
				for (int i = 0; i < A.length; i++) {
					if (A[i] == leader) { // return first index with leader
						return i;
					}
				}
			}

		}

		return -1;
	}

}
