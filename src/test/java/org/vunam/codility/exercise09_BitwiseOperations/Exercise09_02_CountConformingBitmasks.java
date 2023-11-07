package org.vunam.codility.exercise09_BitwiseOperations;

import java.util.BitSet;

/**
 *
 * [MEDIUM] CountConformingBitmasks: Count 30-bit bitmasks conforming to at
 * least one of three given 30-bit bitmasks.
 *
 * In this problem we consider unsigned 30-bit integers, i.e. all integers B
 * such that 0 ≤ B < 230.
 *
 * We say that integer A conforms to integer B if, in all positions where B has
 * bits set to 1, A has corresponding bits set to 1.
 *
 * For example:
 *
 * 00 0000 1111 0111 1101 1110 0000 1111(BIN) = 16,244,239 conforms to 00 0000
 * 1100 0110 1101 1110 0000 0001(BIN) = 13,032,961, but 11 0000 1101 0111 0000
 * 1010 0000 0101(BIN) = 819,399,173 does not conform to 00 0000 1001 0110 0011
 * 0011 0000 1111(BIN) = 9,843,471. Write a function:
 *
 * class Solution { public int solution(int A, int B, int C); }
 *
 * that, given three unsigned 30-bit integers A, B and C, returns the number of
 * unsigned 30-bit integers conforming to at least one of the given integers.
 *
 * For example, for integers:
 *
 * A = 11 1111 1111 1111 1111 1111 1001 1111(BIN) = 1,073,741,727, B = 11 1111
 * 1111 1111 1111 1111 0011 1111(BIN) = 1,073,741,631, and C = 11 1111 1111 1111
 * 1111 1111 0110 1111(BIN) = 1,073,741,679, the function should return 8, since
 * there are 8 unsigned 30-bit integers conforming to A, B or C, namely:
 *
 * 11 1111 1111 1111 1111 1111 0011 1111(BIN) = 1,073,741,631, 11 1111 1111 1111
 * 1111 1111 0110 1111(BIN) = 1,073,741,679, 11 1111 1111 1111 1111 1111 0111
 * 1111(BIN) = 1,073,741,695, 11 1111 1111 1111 1111 1111 1001 1111(BIN) =
 * 1,073,741,727, 11 1111 1111 1111 1111 1111 1011 1111(BIN) = 1,073,741,759, 11
 * 1111 1111 1111 1111 1111 1101 1111(BIN) = 1,073,741,791, 11 1111 1111 1111
 * 1111 1111 1110 1111(BIN) = 1,073,741,807, 11 1111 1111 1111 1111 1111 1111
 * 1111(BIN) = 1,073,741,823. Write an efficient algorithm for the following
 * assumptions:
 *
 * A, B and C are integers within the range [0..1,073,741,823].
 *
 *
 * @see https://app.codility.com/programmers/trainings/9/count_conforming_bitmasks/
 */
public class Exercise09_02_CountConformingBitmasks {

	/**
	 * Solution - 100%.
	 *
	 * @param N
	 * @return
	 * @see https://app.codility.com/demo/results/trainingTUVSYZ-MXT/
	 */
	public int solution(int A, int B, int C) {
		// The idea is to get the cardinality of set of numbers that conform to each
		// number.
		int a = getCardinality(A);
		int b = getCardinality(B);
		int c = getCardinality(C);
		int ab = getCardinality(A | B);
		int ac = getCardinality(A | C);
		int bc = getCardinality(B | C);
		int abc = getCardinality(A | B | C);

		// |A v B v C| = |A| + |B| + |C| - |A & B| - |A & C| - |B & C| + |A & B & C|
		return (int) ((long) a + b + c - ab - ac - bc + abc);
	}

	/**
	 * Get the number of numbers that conform to the given {@code n}.
	 *
	 * @param n
	 * @return
	 */
	private static int getCardinality(int n) {
		// Get the number of bits "1" in number n.
		int numberOfOneBits = BitSet.valueOf(new long[] { n }).get(0, 30).cardinality();

		// Get the rest bits that can be either "0" or "1".
		int numberOfRestBits = 30 - numberOfOneBits;

		// return 2 ^ numberOfRestBits
		return 1 << numberOfRestBits;
	}

}
