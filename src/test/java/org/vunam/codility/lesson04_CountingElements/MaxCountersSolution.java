package org.vunam.codility.lesson04_CountingElements;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class MaxCountersSolution {
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int minCount = 0;
		int maxCount = 0;

		for (int op : A) {
			int index = op - 1;
			if (index < N) {
				counters[index] = Math.max(counters[index], minCount) + 1;
				maxCount = Math.max(counters[index], maxCount);
			} else {
				minCount = maxCount;
			}
		}

		for (int index = 0; index < N; index++) {
			if (counters[index] < minCount) {
				counters[index] = minCount;
			}
		}
		return counters;
	}
}