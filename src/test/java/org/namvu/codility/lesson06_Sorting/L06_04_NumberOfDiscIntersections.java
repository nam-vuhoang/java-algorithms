package org.namvu.codility.lesson06_Sorting;

/**
 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array
 * A of N non-negative integers, specifying the radiuses of the discs, is given.
 * The J-th disc is drawn with its center at (J, 0) and radius A[J].
 *
 * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and
 * K-th discs have at least one common point (assuming that the discs contain
 * their borders).
 *
 * The figure below shows discs drawn for N = 6 and A as follows:
 *
 * A[0] = 1 A[1] = 5 A[2] = 2 A[3] = 1 A[4] = 4 A[5] = 0
 *
 *
 * There are eleven (unordered) pairs of discs that intersect, namely:
 *
 * discs 1 and 4 intersect, and both intersect with all the other discs; disc 2
 * also intersects with discs 0 and 3. Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A describing N discs as explained above, returns the
 * number of (unordered) pairs of intersecting discs. The function should return
 * −1 if the number of intersecting pairs exceeds 10,000,000.
 *
 * Given array A shown above, the function should return 11, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000]; each element of array A is an
 * integer within the range [0..2,147,483,647].
 */
import java.util.Arrays;
import java.util.Comparator;

public class L06_04_NumberOfDiscIntersections {

	class Segment {
		private final long start;
		private final long end;

		public Segment(int center, int radius) {
			start = (long)center - radius;
			end = (long)center + radius;
		}

		public long getStart() {
			return start;
		}

		public long getEnd() {
			return end;
		}
	}

	public int solution(int[] A) {
		int N = A.length;

		Segment[] segments = new Segment[N];

		for (int i = 0; i < N; i++) {
			segments[i] = new Segment(i, A[i]);
		}

		Arrays.sort(segments, Comparator.comparingLong(Segment::getStart).thenComparingLong(Segment::getEnd));

		long[] starts = new long[N];
		for (int i = 0; i < N; i++) {
			starts[i] = segments[i].getStart();
		}

		int count = 0;

		for (int i = 0; i < N - 1; i++) {
			long end1 = segments[i].getEnd();
			int index = binarySearch_RightMost(starts, i + 1, N, end1);
			count += index - i;

			if (count > 10000000) {
				return -1;
			}
		}

		return count;
	}

	/**
	 * Returns the index of the last element which is not bigger than key
	 * @param starts
	 * @param from (inclusive)
	 * @param to (exclusive)
	 * @param key
	 * @return
	 */
	private int binarySearch_RightMost(long[] starts, int from, int to, long key) {
		if (key < starts[from]) {
			return from - 1;
		}

		if (key >= starts[to - 1]) {
			return to - 1;
		}

		while (from < to) {
			int mid = (from + to) / 2;
			if (key < starts[mid]) {
				to = mid;
			} else {
				from = mid + 1;
			}
		}

		return to - 1;
	}

}
