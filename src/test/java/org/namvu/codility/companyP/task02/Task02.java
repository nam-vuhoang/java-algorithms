package org.namvu.codility.companyP.task02;

/**
 *
 */
class Task02 {

	public int solution(String S) {
		int countA = 0;
		int countB = 0;
		int countN = 0;

		for (char c : S.toCharArray()) {
			switch (c) {
			case 'A':
				countA++;
				break;
			case 'B':
				countB++;
				break;
			case 'N':
				countN++;
				break;
			}
		}

		return Math.min(Math.min(countA / 3, countB), countN / 2);
	}

}
