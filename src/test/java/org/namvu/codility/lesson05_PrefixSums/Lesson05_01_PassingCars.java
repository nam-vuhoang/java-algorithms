package org.namvu.codility.lesson05_PrefixSums;

/**
 * [EASY] PassingCars: Count the number of passing cars on the road.
 *
 * A non-empty array A consisting of N integers is given. The consecutive
 * elements of array A represent consecutive cars on a road.
 *
 * Array A contains only 0s and/or 1s:
 *
 * 0 represents a car traveling east, 1 represents a car traveling west. The
 * goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P
 * < Q < N, is passing when P is traveling to the east and Q is traveling to the
 * west.
 *
 * For example, consider array A such that:
 *
 * A[0] = 0 A[1] = 1 A[2] = 0 A[3] = 1 A[4] = 1 We have five pairs of passing
 * cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the number of pairs of
 * passing cars.
 *
 * The function should return −1 if the number of pairs of passing cars exceeds
 * 1,000,000,000.
 *
 * For example, given:
 *
 * A[0] = 0 A[1] = 1 A[2] = 0 A[3] = 1 A[4] = 1 the function should return 5, as
 * explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer that can have one of the following values: 0, 1.
 *
 * @see https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 *
 */
class Lesson05_01_PassingCars {

	private static final int EAST = 0;
	private static final int WEST = 1;
	private static final long MAX_COUNT = 1000000000L;

	/**
	 * Detected time complexity: O(N)
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/trainingQE6JQ2-UHD/
	 */
	public int solution(int[] A) {
		for (int i = A.length - 1, countWest = 0; i >= 0; i--) {
			if (A[i] == WEST) {
				A[i] = ++countWest;
			}
		}

		long countPairs = 0;
		for (int i = 0, countEast = 0; i < A.length; i++) {
			if (A[i] == EAST) {
				countEast++;
			} else { // A[i] == countWest
				countPairs += countEast * A[i]; // countEast * countWest
				if (countPairs < 0L || countPairs > MAX_COUNT) {
					return -1;
				}
				countEast = 0; // reset countEast
			}
		}
		return (int) countPairs;
	}
}
