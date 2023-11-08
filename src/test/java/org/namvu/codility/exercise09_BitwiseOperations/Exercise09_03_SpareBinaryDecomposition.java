package org.namvu.codility.exercise09_BitwiseOperations;

import java.util.BitSet;

/**
 * [HARD] SparseBinaryDecomposition: Decompose int into sum of ints having no
 * consecutive 1s in binary form.
 *
 * A non-negative integer N is called sparse if its binary representation does
 * not contain two consecutive bits set to 1. For example, 41 is sparse, because
 * its binary representation is "101001" and it does not contain two consecutive
 * 1s. On the other hand, 26 is not sparse, because its binary representation is
 * "11010" and it contains two consecutive 1s.
 *
 * Two non-negative integers P and Q are called a sparse decomposition of
 * integer N if P and Q are sparse and N = P + Q.
 *
 * For example:
 *
 * 8 and 18 are a sparse decomposition of 26 (binary representation of 8 is
 * "1000", binary representation of 18 is "10010"); 9 and 17 are a sparse
 * decomposition of 26 (binary representation of 9 is "1001", binary
 * representation of 17 is "10001"); 2 and 24 are not a sparse decomposition of
 * 26; though 2 + 24 = 26, the binary representation of 24 is "11000", which is
 * not sparse. Write a function:
 *
 * class Solution { public int solution(int N); }
 *
 * that, given a non-negative integer N, returns any integer that is one part of
 * a sparse decomposition of N. The function should return −1 if there is no
 * sparse decomposition of N.
 *
 * For example, given N = 26 the function may return 8, 9, 17 or 18, as
 * explained in the example above. All other possible results for N = 26 are 5,
 * 10, 16 and 21.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..1,000,000,000].
 *
 * @see https://app.codility.com/programmers/trainings/9/sparse_binary_decomposition/
 */
public class Exercise09_03_SpareBinaryDecomposition {

	/**
	 * This solution is based on binary subtraction. If N = A + B, for any bit "1"
	 * of N, either A or B should have bit "1". We only need to make sure only that
	 * both A and B are smaller than N and they don't have two consecutive bits "1".
	 *
	 * @param N
	 * @return
	 * @see https://app.codility.com/demo/results/trainingW9PKYU-ECX/
	 */
	public int solution(int N) {
		BitSet bs = BitSet.valueOf(new long[] { N });
		BitSet result = new BitSet(Integer.SIZE);

		int eldestBit = bs.previousSetBit(Integer.SIZE - 1);
		if (eldestBit < 1) {
			return 0;
		}

		if (bs.get(eldestBit - 1)) { // two eldest bits are "11"
			eldestBit--;
		}

		for (int bit = eldestBit; bit >= 0; bit -= 2) { // skip every bit
			if (bs.get(bit)) {
				result.set(bit);
			}
		}

		return (int) result.toLongArray()[0];
	}

	/**
	 * This method is used only for unit testing
	 *
	 * @param a
	 * @return
	 */
	public static boolean isSparseNumber(int a) {
		BitSet bs = BitSet.valueOf(new long[] { a });

		int previous = bs.nextSetBit(0);
		if (previous == -1) {
			return false; // a == 0
		}

		for (int next; (next = bs.nextSetBit(previous + 1)) != -1; previous = next) {
			if (next - previous == 1) {
				return false;
			}
		}

		return true;
	}

}
