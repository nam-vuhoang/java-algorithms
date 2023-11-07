package org.vunam.codility.lesson12_EuclideanAlgorithm;

import org.vunam.utils.ArithmeticUtils.CommonNumbers;

/**
 * [MEDIUM] CommonPrimeDivisors. Check whether two numbers have the same prime
 * divisors.
 *
 * Check whether two numbers have the same prime divisors.
 *
 * https://app.codility.com/programmers/lessons/12-euclidean_algorithm/common_prime_divisors/
 * *
 *
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and
 * X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 *
 * A prime D is called a prime divisor of a positive integer P if there exists a
 * positive integer K such that D * K = P. For example, 2 and 5 are prime
 * divisors of 20.
 *
 * You are given two positive integers N and M. The goal is to check whether the
 * sets of prime divisors of integers N and M are exactly the same.
 *
 * For example, given:
 *
 * N = 15 and M = 75, the prime divisors are the same: {3, 5}; N = 10 and M =
 * 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5}; N =
 * 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
 * Write a function:
 *
 * class Solution { public int solution(int[] A, int[] B); }
 *
 * that, given two non-empty arrays A and B of Z integers, returns the number of
 * positions K for which the prime divisors of A[K] and B[K] are exactly the
 * same.
 *
 * For example, given:
 *
 * A[0] = 15 B[0] = 75 A[1] = 10 B[1] = 30 A[2] = 3 B[2] = 5 the function should
 * return 1, because only one pair (15, 75) has the same set of prime divisors.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * Z is an integer within the range [1..6,000]; each element of arrays A and B
 * is an integer within the range [1..2,147,483,647].
 *
 * @see https://app.codility.com/programmers/lessons/12-euclidean_algorithm/common_prime_divisors/
 *
 */
class Task12_02_CommonPrimeDivisors2 {

	/**
	 * Detected time complexity: O(Z * log(max(A) + max(B))**2)
	 *
	 * @param A
	 * @param B
	 * @return
	 */
	public int solution(int[] A, int[] B) {
		int result = 0;

		for (int k = 0; k < A.length; k++) {
			int a = A[k];
			int b = B[k];

			if (hasSamePrimeDivisors(a, b)) {
				result++;
			}

		}

		return result;
	}

	/**
	 * Check if two numbers have common prime divisors.
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	private boolean hasSamePrimeDivisors(int a, int b) {
		// If "a = gcd * ka", "b = gcd * kb", then all prime divisors of ka and kb
		// (separately) should be divisors of gcd.

		int gcdA;
		int gcdB;

		// Get the original GCD of the two numbers
		gcdA = gcdB = CommonNumbers.getGreatestCommonDivisorByDivision(a, b);

		// Check if (a / GCD) is also divisor of GCD
		while (a % gcdA == 0 && gcdA != 1) {
			a /= gcdA;
			gcdA = CommonNumbers.getGreatestCommonDivisorByDivision(a, gcdA);
		}

		if (a != 1) {
			return false;
		}

		// Check if (b / GCD) is also divisor of GCD
		while (b % gcdB == 0 && gcdB != 1) {
			b /= gcdB;
			gcdB = CommonNumbers.getGreatestCommonDivisorByDivision(b, gcdB);
		}

		return b == 1;
	}

}
