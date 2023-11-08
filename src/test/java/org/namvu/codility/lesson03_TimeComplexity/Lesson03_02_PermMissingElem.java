package org.namvu.codility.lesson03_TimeComplexity;

import java.util.BitSet;

/**
 * [EASY, 100%]
 *
 * PermMissingElem:
 *
 * Find the missing element in a given permutation.
 *
 * An array A consisting of N different integers is given. The array contains
 * integers in the range [1..(N + 1)], which means that exactly one element is
 * missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 * A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5 the function should return 4, as it is
 * the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000]; the elements of A are all
 * distinct; each element of array A is an integer within the range [1..(N +
 * 1)].
 *
 * @see https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 *
 *
 */
class Lesson03_02_PermMissingElem {

	/**
	 * Idea: use a bit set to mark all existing values and find the only clear bit.
	 *
	 * Solution - 100%
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/trainingJ95HWY-P65/
	 */
	public int solution(int[] A) {
		BitSet B = new BitSet(A.length + 1);
		for (int element : A) {
			B.set(element - 1);
		}
		return B.nextClearBit(0) + 1;
	}

}
