package org.vunam.codility.lesson01_Iterations;

/**
 * [EASY] BinaryGap: Find longest sequence of zeros in binary representation of
 * an integer.
 *
 * A binary gap within a positive integer N is any maximal sequence of
 * consecutive zeros that is surrounded by ones at both ends in the binary
 * representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary
 * gap of length 2. The number 529 has binary representation 1000010001 and
 * contains two binary gaps: one of length 4 and one of length 3. The number 20
 * has binary representation 10100 and contains one binary gap of length 1. The
 * number 15 has binary representation 1111 and has no binary gaps. The number
 * 32 has binary representation 100000 and has no binary gaps.
 *
 * Write a function:
 *
 * class Solution { public int solution(int N); }
 *
 * that, given a positive integer N, returns the length of its longest binary
 * gap. The function should return 0 if N doesn't contain a binary gap.
 *
 * For example, given N = 1041 the function should return 5, because N has
 * binary representation 10000010001 and so its longest binary gap is of length
 * 5. Given N = 32 the function should return 0, because N has binary
 * representation '100000' and thus no binary gaps.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..2,147,483,647].
 *
 * @see https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 */
class Lesson01_01_BinaryGap {

	/**
	 * Iterate over the list of bits "1" and get the gap lengths between them.
	 *
	 * Solution result: 100%
	 *
	 * @param N
	 * @return
	 *
	 * @see https://app.codility.com/demo/results/training8ZYNGC-KM6/
	 */
	public int solution(int N) {
		int maxLength = 0;
		int end;
		for (int start = nextSetBit(N, 0); start >= 0 && (end = nextSetBit(N, start + 1)) >= 0; start = end) {
			maxLength = Integer.max(maxLength, end - start - 1);
		}
		return maxLength;
	}

	/**
	 * Find the first bit "1" in a given number "N" starting from a start position.
	 *
	 * @param N
	 * @param start
	 * @return
	 */
	private static int nextSetBit(int N, int start) {
		for (; start < 32; start++) {
			if ((N & (1 << start)) != 0) {
				return start;
			}
		}
		return -1;
	}
}
