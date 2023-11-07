package org.vunam.codility.lesson11_SieveOfEratosthenes;

import java.util.BitSet;

import org.vunam.utils.ArithmeticUtils;

/**
 *
 * [100%] CountSemiprimes
 *
 * Count the semiprime numbers in the given range [a..b]
 *
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and
 * X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 *
 * A semiprime is a natural number that is the product of two (not necessarily
 * distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15,
 * 21, 22, 25, 26.
 *
 * You are given two non-empty arrays P and Q, each consisting of M integers.
 * These arrays represent queries about the number of semiprimes within
 * specified ranges.
 *
 * Query K requires you to find the number of semiprimes within the range (P[K],
 * Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.
 *
 * For example, consider an integer N = 26 and arrays P, Q such that:
 *
 * P[0] = 1 Q[0] = 26 P[1] = 4 Q[1] = 10 P[2] = 16 Q[2] = 20 The number of
 * semiprimes within each of these ranges is as follows:
 *
 * (1, 26) is 10, (4, 10) is 4, (16, 20) is 0. Write a function:
 *
 * class Solution { public int[] solution(int N, int[] P, int[] Q); }
 *
 * that, given an integer N and two non-empty arrays P and Q consisting of M
 * integers, returns an array consisting of M elements specifying the
 * consecutive answers to all the queries.
 *
 * For example, given an integer N = 26 and arrays P, Q such that:
 *
 * P[0] = 1 Q[0] = 26 P[1] = 4 Q[1] = 10 P[2] = 16 Q[2] = 20 the function should
 * return the values [10, 4, 0], as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..50,000]; M is an integer within the
 * range [1..30,000]; each element of arrays P and Q is an integer within the
 * range [1..N]; P[i] ≤ Q[i].
 *
 *
 * @see https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_semiprimes/
 *
 *
 */
class L11_02_CountSemiPrimes {
	/**
	 * Test score: 100%
	 *
	 * Detected complexity: O(N * log(log(N)) + M)
	 *
	 * @param N
	 * @param P
	 * @param Q
	 * @return
	 *
	 * @see https://app.codility.com/demo/results/training62BCNQ-K65/
	 */
	public int[] solution(int N, int[] P, int[] Q) {

		// mark all semiprimes from 0 to N
		int[] primeNumbers = ArithmeticUtils.PrimeNumbers.getPrimes(N);
		BitSet isSemiPrimeNumber = new BitSet(N + 1);

		for (int i = 0; i < primeNumbers.length; i++) {
			int k = N / primeNumbers[i];
			for (int j = i; primeNumbers[j] <= k; j++) {
				isSemiPrimeNumber.set(primeNumbers[i] * primeNumbers[j]);
			}
		}

		// count semi prime numbers using the prefix sum technique
		int[] semiPrimeCount = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			semiPrimeCount[i] = semiPrimeCount[i - 1];
			if (isSemiPrimeNumber.get(i)) {
				semiPrimeCount[i]++;
			}
		}

		// find number of semiprimes between P[k] and Q[k]
		int M = P.length;
		int[] count = new int[M];
		for (int k = 0; k < M; k++) {
			count[k] = semiPrimeCount[Q[k]] - semiPrimeCount[P[k] - 1];
		}

		return count;
	}
}