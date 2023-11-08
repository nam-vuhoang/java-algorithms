package org.namvu.codility.lesson04_CountingElements;

import java.util.Arrays;
import java.util.PrimitiveIterator.OfInt;

/**
 *
 * [MEDIUM] MissingInteger: Find the smallest positive integer that does not
 * occur in a given sequence.
 *
 * This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 *
 * @see https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */
class Lesson04_04_MissingInteger {

	/**
	 * https://app.codility.com/demo/results/trainingYTTEK5-BXW/
	 *
	 * @param A
	 * @return
	 * @see https://app.codility.com/demo/results/trainingYTTEK5-BXW/
	 */
	public int solution(int[] A) {
        OfInt it =
            Arrays.stream(A)
                .filter(x -> x > 0)
                .sorted()
                .iterator();

        int minAbsent = 1;
        int x;
        while (it.hasNext() && (x = it.nextInt()) <= minAbsent) {
            minAbsent = x + 1;
        }
        return minAbsent;
   }

}
