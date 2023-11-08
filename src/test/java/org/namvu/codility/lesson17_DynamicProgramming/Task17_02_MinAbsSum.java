package org.namvu.codility.lesson17_DynamicProgramming;

import java.util.Arrays;
import java.util.BitSet;

/**
 * [HARD] MinAbsSum (hard): Given array of integers, find the lowest absolute
 * sum of elements.
 *
 * For a given array A of N integers and a sequence S of N integers from the set
 * {−1, 1}, we define val(A, S) as follows:
 *
 * val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
 *
 * (Assume that the sum of zero elements equals zero.)
 *
 * For a given array A, we are looking for such a sequence S that minimizes
 * val(A,S).
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, computes the minimum value of val(A,S)
 * from all possible values of val(A,S) for all possible sequences S of N
 * integers from the set {−1, 1}.
 *
 * For example, given array:
 *
 * A[0] = 1 A[1] = 5 A[2] = 2 A[3] = -2 your function should return 0, since for
 * S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..20,000]; each element of array A is an
 * integer within the range [−100..100].
 *
 * @see https://app.codility.com/programmers/lessons/17-dynamic_programming/min_abs_sum/
 *
 */
class Task17_02_MinAbsSum {

	/**
	 * Test score - 54% (correctness: 100%, performance: 0%)
	 *
	 * Detected time complexity: O(N**2 * max(abs(A)))
	 *
	 * @param A
	 * @return
	 *
	 * @see https://app.codility.com/demo/results/trainingTKQWS5-SC4/
	 */
	public int solution(int[] A) {
		Arrays.sort(A);

		int N = A.length;
		int MAX = 100;
		int MID = MAX * N;

		BitSet current = new BitSet(2 * MAX * N + 1);
		current.set(MID); // start value = 0

		BitSet previous = new BitSet(2 * MAX * N + 1);

		for (int a : A) {
			previous.clear();
			previous.or(current);

			current.clear();

			for (int index = 0; (index = previous.nextSetBit(index)) != -1; index++) {
				current.set(index + a);
				current.set(index - a);
			}
		}

		int minAbsSum = Integer.MAX_VALUE;

		int closestNonNegativeValueIndex = current.nextSetBit(MID);
		if (closestNonNegativeValueIndex != -1) {
			minAbsSum = Integer.min(closestNonNegativeValueIndex - MID, minAbsSum);
		}

		int closestNonPositiveValueIndex = current.previousSetBit(MID);
		if (closestNonPositiveValueIndex != -1) {
			minAbsSum = Integer.min(MID - closestNonPositiveValueIndex, minAbsSum);
		}

		return minAbsSum;
	}

}
