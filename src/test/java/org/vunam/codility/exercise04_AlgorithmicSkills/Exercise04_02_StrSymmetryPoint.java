package org.vunam.codility.exercise04_AlgorithmicSkills;

/**
 * [EASY] StrSymmetryPoint: Find a symmetry point of a string, if any.
 *
 * Write a function:
 *
 * class Solution { public int solution(String S); }
 *
 * that, given a string S, returns the index (counting from 0) of a character
 * such that the part of the string to the left of that character is a reversal
 * of the part of the string to its right. The function should return −1 if no
 * such index exists.
 *
 * Note: reversing an empty string (i.e. a string whose length is zero) gives an
 * empty string.
 *
 * For example, given a string:
 *
 * "racecar"
 *
 * the function should return 3, because the substring to the left of the
 * character "e" at index 3 is "rac", and the one to the right is "car".
 *
 * Given a string:
 *
 * "x"
 *
 * the function should return 0, because both substrings are empty.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * the length of string S is within the range [0..2,000,000].
 *
 * @see https://app.codility.com/programmers/trainings/4/str_symmetry_point/
 */
public class Exercise04_02_StrSymmetryPoint {

	/**
	 *
	 * @param S
	 * @return
	 * @see https://app.codility.com/demo/results/trainingG23FQT-WSD/
	 */
	public int solution(String S) {
		int N = S.length();
		if (N % 2 == 0) {
			return -1;
		}

		for (int i = 0; i < N / 2; i++) {
			if (S.charAt(i) != S.charAt(N - 1 - i)) {
				return -1;
			}
		}

		return N / 2;
	}

}
