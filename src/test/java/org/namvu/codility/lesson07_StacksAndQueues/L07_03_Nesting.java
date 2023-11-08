package org.namvu.codility.lesson07_StacksAndQueues;

/**
 * [EASY ]Nesting
 *
 * Determine whether a given string of parentheses (single type) is properly
 * nested.
 *
 * A string S consisting of N characters is called properly nested if:
 *
 * S is empty; S has the form "(U)" where U is a properly nested string; S has
 * the form "VW" where V and W are properly nested strings. For example, string
 * "(()(())())" is properly nested but string "())" isn't.
 *
 * Write a function:
 *
 * class Solution { public int solution(String S); }
 *
 * that, given a string S consisting of N characters, returns 1 if string S is
 * properly nested and 0 otherwise.
 *
 * For example, given S = "(()(())())", the function should return 1 and given S
 * = "())", the function should return 0, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..1,000,000]; string S is made only of the
 * characters '(' and/or ')'.
 *
 * @see https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
 */
class L07_03_Nesting {
	private static int CORRECT = 1;
	private static int WRONG = 0;

	/**
	 * Detected time complexity: O(N)
	 *
	 * @param S
	 * @return
	 */
	public int solution(String S) {
		int openedCount = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				openedCount++;
			} else {
				openedCount--;
				if (openedCount < 0) {
					return WRONG;
				}
			}
		}

		return openedCount == 0 ? CORRECT : WRONG;
	}
}