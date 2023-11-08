package org.namvu.codility.lesson10_PrimeNumbers;

/**
 * [EASY] MinPerimeterRectangle
 *
 * Find the minimal perimeter of any rectangle whose area equals N.
 *
 * An integer N is given, representing the area of some rectangle.
 *
 * The area of a rectangle whose sides are of length A and B is A * B, and the
 * perimeter is 2 * (A + B).
 *
 * The goal is to find the minimal perimeter of any rectangle whose area equals
 * N. The sides of this rectangle should be only integers.
 *
 * For example, given integer N = 30, rectangles of area 30 are:
 *
 * (1, 30), with a perimeter of 62, (2, 15), with a perimeter of 34, (3, 10),
 * with a perimeter of 26, (5, 6), with a perimeter of 22. Write a function:
 *
 * class Solution { public int solution(int N); }
 *
 * that, given an integer N, returns the minimal perimeter of any rectangle
 * whose area is exactly equal to N.
 *
 * For example, given an integer N = 30, the function should return 22, as
 * explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..1,000,000,000].
 *
 * @see https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/
 */
class L10_02_MinPerimeterRectangle {

	/**
	 * Detected time complexity: O(sqrt(N))
	 *
	 * @param N
	 * @return
	 * @see https://app.codility.com/demo/results/trainingPXFUCF-3YK/
	 */
	public int solution(int N) {

		for (int a = (int) Math.sqrt(N); a >= 1; a--) {
			if (N % a == 0) {
				int b = N / a;
				return 2 * (a + b);
			}
		}

		// The code should never reach this line
		return -1;
	}

}
