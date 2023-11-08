package org.namvu.codility.lesson06_Sorting;

import java.util.Arrays;

/**
 * [MEDIUM, 100%] [100%] NumberOfDiscIntersections: Compute the number of
 * intersections in a sequence of discs.
 *
 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array
 * A of N non-negative integers, specifying the radiuses of the discs, is given.
 * The J-th disc is drawn with its center at (J, 0) and radius A[J].
 *
 * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and
 * K-th discs have at least one common point (assuming that the discs contain
 * their borders).
 *
 * The figure below shows discs drawn for N = 6 and A as follows:
 *
 * A[0] = 1 A[1] = 5 A[2] = 2 A[3] = 1 A[4] = 4 A[5] = 0
 *
 *
 * There are eleven (unordered) pairs of discs that intersect, namely:
 *
 * discs 1 and 4 intersect, and both intersect with all the other discs; disc 2
 * also intersects with discs 0 and 3. Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A describing N discs as explained above, returns the
 * number of (unordered) pairs of intersecting discs. The function should return
 * −1 if the number of intersecting pairs exceeds 10,000,000.
 *
 * Given array A shown above, the function should return 11, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000]; each element of array A is an
 * integer within the range [0..2,147,483,647].
 *
 * @see https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
 */
public class L06_04_NumberOfDiscIntersections3 {

	/**
	 * Detected time complexity: O(N*log(N)) or O(N)
	 *
	 * The idea is to use INDEPENDENT (UNBOUNDED) arrays of start positions & end
	 * positions. And then calculated "started" and "ended" discs for each position.
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/trainingMHNMKA-WW7/
	 */
	public int solution(int[] A) {
		//
		// The idea is to use INDEPENDENT (UNBOUNDED) arrays of start positions & end
		// positions.
		//

		if (A.length == 0) {
			return 0;
		}

		long[] startPositions = new long[A.length];
		long[] endPositions = new long[A.length];

		for (int i = 0; i < A.length; i++) {
			startPositions[i] = (long) i - A[i];
			endPositions[i] = (long) i + A[i];
		}

		Arrays.sort(startPositions);
		Arrays.sort(endPositions);

		// calculate started discs and ended discs
		int intersectionCount = 0;
		int startedDiscCount = 0;

		int j = 0;
		long nextEndPosition = endPositions[j++];

		for (int i = 0; i < A.length; i++) {
			long startPosition = startPositions[i];

			while (nextEndPosition < startPosition) {
				startedDiscCount--;
				if (j < A.length) {
					nextEndPosition = endPositions[j++];
				}
			}

			intersectionCount += startedDiscCount;
			if (intersectionCount > 10000000) {
				return -1;
			}

			startedDiscCount++;
		}

		return intersectionCount;
	}

}
