package org.namvu.codility.lesson13_FibonacciNumbers;

import org.namvu.utils.ArithmeticUtils.FibonacciNumbers;

/**
 * [EASY] FibFrog. Count the minimum number of jumps required for a frog to get
 * to the other side of a river.
 *
 * Count the minimum number of jumps required for a frog to get to the other
 * side of a river.
 *
 * https://app.codility.com/programmers/lessons/13-fibonacci_numbers/fib_frog/
 *
 * The Fibonacci sequence is defined using the following recursive formula:
 *
 * F(0) = 0 F(1) = 1 F(M) = F(M - 1) + F(M - 2) if M >= 2 A small frog wants to
 * get to the other side of a river. The frog is initially located at one bank
 * of the river (position −1) and wants to get to the other bank (position N).
 * The frog can jump over any distance F(K), where F(K) is the K-th Fibonacci
 * number. Luckily, there are many leaves on the river, and the frog can jump
 * between the leaves, but only in the direction of the bank at position N.
 *
 * The leaves on the river are represented in an array A consisting of N
 * integers. Consecutive elements of array A represent consecutive positions
 * from 0 to N − 1 on the river. Array A contains only 0s and/or 1s:
 *
 * 0 represents a position without a leaf; 1 represents a position containing a
 * leaf. The goal is to count the minimum number of jumps in which the frog can
 * get to the other side of the river (from position −1 to position N). The frog
 * can jump between positions −1 and N (the banks of the river) and every
 * position containing a leaf.
 *
 * For example, consider array A such that:
 *
 * A[0] = 0 A[1] = 0 A[2] = 0 A[3] = 1 A[4] = 1 A[5] = 0 A[6] = 1 A[7] = 0 A[8]
 * = 0 A[9] = 0 A[10] = 0 The frog can make three jumps of length F(5) = 5, F(3)
 * = 2 and F(5) = 5.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns the minimum number
 * of jumps by which the frog can get to the other side of the river. If the
 * frog cannot reach the other side of the river, the function should return −1.
 *
 * For example, given:
 *
 * A[0] = 0 A[1] = 0 A[2] = 0 A[3] = 1 A[4] = 1 A[5] = 0 A[6] = 1 A[7] = 0 A[8]
 * = 0 A[9] = 0 A[10] = 0 the function should return 3, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000]; each element of array A is an
 * integer that can have one of the following values: 0, 1.
 */
class Task13_01_FibFrog {

	static class Solution {
		public int solution(int[] A) {
			int N = A.length;
			int[] fibonacciNumbers = FibonacciNumbers.getFibonacciNumbers(N + 1);

			// steps[i] is the minimum number of steps to reach position i.
			// steps[i] == 0 means that this position is not reached yet.
			int[] steps = new int[N];

			// CurrentLeft and currentRight are used to limit the range of starting
			// positions for each subsequent step.

			// At the beginning they both are -1.
			int currentLeft = -1;
			int currentRight = -1;

			// for every step count, we try to get all positions that it can achieve
			for (int stepCount = 1; currentLeft <= currentRight; stepCount++) {

				int newLeft = N;
				int newRight = -1;

				for (int from = currentLeft; from <= currentRight; from++) {
					if (from == -1 || steps[from] == stepCount - 1) {
						for (int fibonacciNumber : fibonacciNumbers) {
							int to = from + fibonacciNumber;
							if (to < N) {
								if (steps[to] == 0 && A[to] == 1) {
									steps[to] = stepCount;
									newLeft = Math.min(to, newLeft);
									newRight = Math.max(to, newRight);
								}
							} else if (to == N) {
								return stepCount;
							} else {
								break;
							}
						}
					}
				}

				currentLeft = newLeft;
				currentRight = newRight;
			}

			return -1;
		}
	}

}
