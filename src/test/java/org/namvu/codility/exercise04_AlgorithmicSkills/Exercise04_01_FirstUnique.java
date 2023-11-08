package org.namvu.codility.exercise04_AlgorithmicSkills;

import java.util.HashMap;
import java.util.Map;

/**
 * [EASY] FirstUnique: Find the first unique number in a given sequence.
 *
 * A non-empty array A consisting of N integers is given. The unique number is
 * the number that occurs exactly once in array A.
 *
 * For example, the following array A:
 *
 * A[0] = 4 A[1] = 10 A[2] = 5 A[3] = 4 A[4] = 2 A[5] = 10 contains two unique
 * numbers (5 and 2).
 *
 * You should find the first unique number in A. In other words, find the unique
 * number with the lowest position in A.
 *
 * For above example, 5 is in second position (because A[2] = 5) and 2 is in
 * fourth position (because A[4] = 2). So, the first unique number is 5.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the first unique
 * number in A. The function should return −1 if there are no unique numbers in
 * A.
 *
 * For example, given:
 *
 * A[0] = 1 A[1] = 4 A[2] = 3 A[3] = 3 A[4] = 1 A[5] = 2 the function should
 * return 4. There are two unique numbers (4 and 2 occur exactly once). The
 * first one is 4 in position 1 and the second one is 2 in position 5. The
 * function should return 4 bacause it is unique number with the lowest
 * position.
 *
 * Given array A such that:
 *
 * A[0] = 6 A[1] = 4 A[2] = 4 A[3] = 6 the function should return −1. There is
 * no unique number in A (4 and 6 occur more than once).
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [0..1,000,000,000].
 *
 * @see https://app.codility.com/c/run/trainingJ4PGC3-T7W/
 */
class Exercise04_01_FirstUnique {

	/**
	 * Test result: 54% (!)
	 *
	 *  This solution is good only for small range of values.
	 *
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/trainingJ4PGC3-T7W/
	 */
	public int solution(int[] A) {
		int min = Integer.MAX_VALUE;
		int max = -1;

		for (int element : A) {
			min = Integer.min(min, element);
			max = Integer.max(max, element);
		}

		int[] firstIndicies = new int[max - min + 1];
		for (int i = 0; i < A.length; i++) {
			int normalizedValue = A[i] - min;
			if (firstIndicies[normalizedValue] == 0) {
				firstIndicies[normalizedValue] = i + 1;
			} else {
				firstIndicies[normalizedValue] = Integer.MAX_VALUE;
			}
		}

		int minIndex = Integer.MAX_VALUE;
		for (int element : firstIndicies) {
			if (element != 0) {
				minIndex = Math.min(minIndex, element);
			}
		}

		return minIndex == Integer.MAX_VALUE ? -1 : A[minIndex - 1];
	}

}

class Exercise04_FirstUnique2 {

	/**
	 * Test result: 100%
	 *
	 * This solution is good for small number of elements in big value range.
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/training6FDCHA-M8M/
	 */
	public int solution(int[] A) {
		Map<Integer, Integer> firstIndicies = new HashMap<>();

		for (int i = 0; i < A.length; i++) {
			if (firstIndicies.containsKey(A[i])) {
				// this value is not unique
				firstIndicies.put(A[i], Integer.MAX_VALUE);
			} else {
				// unique value so far
				firstIndicies.put(A[i], i);
			}
		}

		int minIndex = Integer.MAX_VALUE;
		for (int index : firstIndicies.values()) {
			minIndex = Integer.min(index, minIndex);
		}

		return minIndex == Integer.MAX_VALUE ? -1 : A[minIndex];
	}

}