package org.vunam.codility.lesson05_PrefixSums;

import java.util.Arrays;

/**
 * [MEDIUM, 100%] GenomicRangeQuery: Find the minimal nucleotide from a range of
 * sequence DNA.
 *
 * A DNA sequence can be represented as a string consisting of the letters A, C,
 * G and T, which correspond to the types of successive nucleotides in the
 * sequence. Each nucleotide has an impact factor, which is an integer.
 * Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4,
 * respectively. You are going to answer several queries of the form: What is
 * the minimal impact factor of nucleotides contained in a particular part of
 * the given DNA sequence?
 *
 * The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1]
 * consisting of N characters. There are M queries, which are given in non-empty
 * arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M)
 * requires you to find the minimal impact factor of nucleotides contained in
 * the DNA sequence between positions P[K] and Q[K] (inclusive).
 *
 * For example, consider string S = CAGCCTA and arrays P, Q such that:
 *
 * P[0] = 2 Q[0] = 4 P[1] = 5 Q[1] = 5 P[2] = 0 Q[2] = 6 The answers to these M
 * = 3 queries are as follows:
 *
 * The part of the DNA between positions 2 and 4 contains nucleotides G and C
 * (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
 * The part between positions 5 and 5 contains a single nucleotide T, whose
 * impact factor is 4, so the answer is 4. The part between positions 0 and 6
 * (the whole string) contains all nucleotides, in particular nucleotide A whose
 * impact factor is 1, so the answer is 1. Write a function:
 *
 * class Solution { public int[] solution(String S, int[] P, int[] Q); }
 *
 * that, given a non-empty string S consisting of N characters and two non-empty
 * arrays P and Q consisting of M integers, returns an array consisting of M
 * integers specifying the consecutive answers to all queries.
 *
 * Result array should be returned as an array of integers.
 *
 * For example, given the string S = CAGCCTA and arrays P, Q such that:
 *
 * P[0] = 2 Q[0] = 4 P[1] = 5 Q[1] = 5 P[2] = 0 Q[2] = 6 the function should
 * return the values [2, 4, 1], as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; M is an integer within the
 * range [1..50,000]; each element of arrays P and Q is an integer within the
 * range [0..N - 1]; P[K] ≤ Q[K], where 0 ≤ K < M; string S consists only of
 * upper-case English letters A, C, G, T. Copyright 2009–2023 by Codility
 * Limited. All Rights Reserved. Unauthorized copying, publication or disclosure
 * prohibited.
 *
 */
class Lesson05_03_GenomicRangeQuery {
	/**
	 * Detected time complexity: O(N + M)
	 *
	 * @param S
	 * @param P
	 * @param Q
	 * @return
	 * @see https://app.codility.com/demo/results/trainingDUZMU9-8KP/
	 */
	public int[] solution(String S, int[] P, int[] Q) {

		// counts of each impact factor (A, C, G, T) after each sequence character
		// "count[i][j] = k" means that after the i-th character, the count of the j-th
		// impact factor is k, where 0 <= i < N, 0 <= j < 4, 0 <= k < N
		int[][] counts = buildCountArray(S);

		int M = P.length;
		int[] impactFactors = new int[M];

		for (int k = 0; k < M; k++) {
			int[] countsBefore = counts[P[k]];
			int[] countsAfter = counts[Q[k] + 1];
			impactFactors[k] = getFirstChangedImpactFactor(countsBefore, countsAfter);
		}

		return impactFactors;
	}

	private static int getImpactFactor(char ch) {
		switch (ch) {
		case 'A':
			return 1;
		case 'C':
			return 2;
		case 'G':
			return 3;
		case 'T':
		default:
			return 4;
		}
	}

	/**
	 * Build the count array:
	 *
	 * @param S
	 * @return
	 */
	private int[][] buildCountArray(String S) {
		int N = S.length();
		int[][] counts = new int[N + 1][];
		int[] currentCount = counts[0] = new int[] { 0, 0, 0, 0 };

		for (int i = 0; i < N; i++) {
			currentCount = counts[i + 1] = Arrays.copyOf(currentCount, 4);
			int j = getImpactFactor(S.charAt(i)) - 1;
			currentCount[j]++;
		}

		return counts;
	}

	/**
	 * Get the first impact factor changed between before and after.
	 *
	 * @param countsBefore
	 * @param countsAfter
	 * @return
	 */
	private int getFirstChangedImpactFactor(int[] countsBefore, int[] countsAfter) {
		for (int i = 0; i < 4; i++) {
			int change = countsAfter[i] - countsBefore[i];
			if (change > 0) {
				return i + 1;
			}
		}
		return 0;
	}

}