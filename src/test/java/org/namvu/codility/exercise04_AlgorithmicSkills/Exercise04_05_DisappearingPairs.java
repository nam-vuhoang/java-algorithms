package org.namvu.codility.exercise04_AlgorithmicSkills;

/**
 *
 * [HARD] DisappearingPairs: Reduce a string containing instances of the letters
 * "A", "B" and "C" via the following rule: remove one occurrence of "AA", "BB"
 * or "CC".
 *
 * A string S containing only the letters "A", "B" and "C" is given. The string
 * can be transformed by removing one occurrence of "AA", "BB" or "CC".
 *
 * Transformation of the string is the process of removing letters from it,
 * based on the rules described above. As long as at least one rule can be
 * applied, the process should be repeated. If more than one rule can be used,
 * any one of them could be chosen.
 *
 * Write a function:
 *
 * class Solution { public String solution(String S); }
 *
 * that, given a string S consisting of N characters, returns any string that
 * can result from a sequence of transformations as described above.
 *
 * For example, given string S = "ACCAABBC" the function may return "AC",
 * because one of the possible sequences of transformations is as follows:
 *
 *
 *
 * Also, given string S = "ABCBBCBA" the function may return "", because one
 * possible sequence of transformations is:
 *
 *
 *
 * Finally, for string S = "BABABA" the function must return "BABABA", because
 * no rules can be applied to string S.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * the length of string S is within the range [0..50,000]; string S is made only
 * of the following characters: 'A', 'B' and/or 'C'.
 *
 * @see https://app.codility.com/programmers/trainings/4/disappearing_pairs/
 */
class Exercise04_05_DisappearingPairs {

	/**
	 * The idea is to use StringBuffer as a dequeue which automatically removes the
	 * last character instead of adding the same character.
	 *
	 * @param S
	 * @return
	 * @see https://app.codility.com/demo/results/trainingFJCD5R-VEK/
	 */
	public String solution(String S) {
		StringBuffer sb = new StringBuffer(S.length());

		char last = 0;

		for (char ch : S.toCharArray()) {
			if (ch == last) {
				sb.deleteCharAt(sb.length() - 1);
				last = sb.length() == 0 ? 0 : sb.charAt(sb.length() - 1);
			} else {
				sb.append(ch);
				last = ch;
			}
		}

		return sb.toString();
	}

}

//class Exercise04_05_DisappearingPairs2 {
//
//	/**
//	 * The idea is to use StringBuffer as a dequeue which automatically removes the
//	 * last character instead of adding the same character.
//	 *
//	 * @param S
//	 * @return
//	 * @see https://app.codility.com/demo/results/trainingFJCD5R-VEK/
//	 */
//	public String solution(String S) {
//		CharBuffer sb = CharBuffer.allocate(S.length());
////		sb.reset();
//
//		char last = 0;
//
//		for (char ch : S.toCharArray()) {
//			if (ch == last) {
//				sb.position(sb.position() - 1);
//				last = sb.length() == 0 ? 0 : sb.charAt(sb.length() - 1);
//			} else {
//				sb.append(ch);
//				last = ch;
//			}
//		}
//
//		sb.flip();
//
//		return sb.toString();
//	}
//
//}
