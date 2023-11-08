package org.namvu.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticUtils {

	public static class PrimeNumbers {
		/**
		 * Get array of prime numbers not greater than N.
		 *
		 * @param N
		 * @return
		 */
		public static int[] getPrimes(int N) {
			if (N < 2) {
				return new int[0];
			}

			// using the Sieve of Eratosthenes algorithm

			// if primes[i] = 0 then i is not a prime
			// if primes[i] == i then i is a prime
			int[] primes = new int[N + 1];
			for (int i = 2; i <= N; i++) {
				primes[i] = i;
			}

			int sqrt = (int) Math.sqrt(N);
			for (int i = 2; i <= sqrt; i++) {
				if (primes[i] == i) {
					for (int k = i * i; k <= N; k += i) {
						primes[k] = 0;
					}
				}
			}

			return Arrays.stream(primes).filter(i -> i > 0).toArray();
		}

		/**
		 * Get the map of smallest divisors for each number from 0 to N.
		 *
		 * "smallestDivisorMap[i] = j" means that the smallest divisor of i is j.
		 *
		 * For example for N = 12, the result will be [0, 1, 2, 3, 2, 5, 2, 7, 2, 3, 2,
		 * 11, 2]
		 *
		 * @param N
		 * @return
		 */
		public static int[] getSmallestDivisorMap(int N) {
			int[] smallestDivisors = new int[N + 1];
			for (int i = 0; i <= N; i++) {
				smallestDivisors[i] = i;
			}

			double sqrt = Math.sqrt(N);
			for (int i = 2; i <= sqrt; i++) {
				if (smallestDivisors[i] == i) {
					for (int k = i * i; k <= N; k += i) {
						if (smallestDivisors[k] == k) {
							smallestDivisors[k] = i;
						}
					}
				}
			}

			return smallestDivisors;
		}

		/**
		 *
		 * Factorize number N into list of divisors, for example: 12 --> [2, 2, 3]
		 *
		 * @param N
		 * @return
		 */
		public static int[] factorize(int N) {
			return factorize(N, getSmallestDivisorMap(N));
		}

		/**
		 * Factorize number N into list of divisors, for example: 12 --> [2, 2, 3]
		 *
		 * @param N
		 * @param smallestDivisorMap
		 * @return
		 */
		public static int[] factorize(int N, int[] smallestDivisorMap) {
			if (N == 1) {
				return new int[] { 1 };
			}

			List<Integer> factors = new ArrayList<>();
			while (N > 1) {
				int d = smallestDivisorMap[N];
				factors.add(d);
				N /= d;
			}

			return factors.stream().mapToInt(i -> i).toArray();
		}

		private PrimeNumbers() {
		}

	}

	public static class CommonNumbers {

		/**
		 * Get the Greatest Common Divisors (GCD) using the Euclidean Algorithm and the
		 * division operation.
		 *
		 * Time complexity: O(log(a + b))
		 *
		 * If a > b, then gcd(a, b) = b, if b | a gcd(a, b) = gcd(b, a mod b),
		 * otherwise.
		 *
		 * This is the fastest method.
		 *
		 * @param a
		 * @param b
		 * @param output
		 * @see https://codility.com/media/train/9-Sieve.pdf
		 */
		public static int getGreatestCommonDivisorByDivision(int a, int b) {
			while (true) {
				if (a >= b) {
					int remainder = a % b;
					if (remainder == 0) {
						return b;
					}
					a = remainder;
				} else {
					int remainder = b % a;
					if (remainder == 0) {
						return a;
					}
					b = remainder;
				}
			}
		}

		/**
		 * Get the Greatest Common Divisors (GCD) using the Euclidean Algorithm and the
		 * substraction operation.
		 *
		 * Time complexity: O(n)
		 *
		 * gcd(a, b) == gcd(a - b, b), if a > b gcd(a, b) == gcd(a, b - a), if a < b
		 *
		 *
		 * This method is slow, only used for testing.
		 *
		 * @param a
		 * @param b
		 * @param output
		 * @see https://codility.com/media/train/9-Sieve.pdf
		 */
		static int getGreatestCommonDivisorBySubstraction(int a, int b) {
			while (a != b) {
				if (a > b) {
					a -= b;
				} else {
					b -= a;
				}
			}
			return a;
		}

		/**
		 * Get the Greatest Common Divisors (GCD) using the Binary Euclidean Algorithm:
		 * by use the divide and conquer technique together.
		 *
		 * gcd(a, b, res) = gcd(a, b, 1) · res
		 *
		 * Time complexity: O(log(a + b))
		 *
		 *
		 * @param a
		 * @param b
		 * @return
		 */
		static int getGreatestCommonDivisorBySubstractionAndDivision(int a, int b) {
			int multiply = 1;
			while (a != b) {
				if (a % 2 == 0) {
					a /= 2;

					if (b % 2 == 0) {
						multiply *= 2;
						b /= 2;
					}
				} else if (b % 2 == 0) {
					b /= 2;
				} else if (a > b) {
					a -= b;
				} else {
					b -= a;
				}
			}
			return multiply * a;
		}

		/**
		 * Get the Least Common Multiple (LCM) of two numbers via calculation of the
		 * Greatest Common Divisor (GCD) of them.
		 *
		 * @param a
		 * @param b
		 * @return
		 */
		public static long getLeastCommonMultiple(int a, int b) {
			return (long) a * b / getGreatestCommonDivisorByDivision(a, b);
		}

		private CommonNumbers() {
		}
	}

	/**
	 * Fibonacci numbers
	 */
	public static class FibonacciNumbers {
		/**
		 * Get all Fibonacci numbers not smaller than 1 and not greater than N.
		 *
		 * @param N
		 * @return
		 */
		public static int[] getFibonacciNumbers(int N) {
			int f_2 = 0; // fib[N-2]
			int f_1 = 1; // fib[N-1]
			List<Integer> list = new ArrayList<>();

			for (int f; (f = f_1 + f_2) <= N; f_2 = f_1, f_1 = f) {
				list.add(f);
			}
			return list.stream().mapToInt(x -> x).toArray();
		}
	}

	private ArithmeticUtils() {
	}

}
