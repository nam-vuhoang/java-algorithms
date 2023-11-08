package org.namvu.utils;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/longest-increasing-subsequent/problem
 *
 * An Introduction to the Longest Increasing Subsequence Problem
 *
 * The task is to find the length of the longest subsequence in a given array of
 * integers such that all elements of the subsequence are sorted in strictly
 * ascending order. This is called the Longest Increasing Subsequence (LIS)
 * problem.
 *
 * For example, the length of the LIS for [15, 27, 14, 38, 26, 55, 46, 65, 85,
 * 1] is 6 since the longest increasing subsequence is [15, 27, 38, 55, 65, 85].
 *
 * Here's a great YouTube video of a lecture from MIT's Open-CourseWare covering
 * the topic: https://youtu.be/4fQJGoeW5VE
 *
 *
 * This is one approach which solves this in quadratic time using dynamic
 * programming. A more efficient algorithm which solves the problem in time is
 * available here.
 *
 * Given a sequence of integers, find the length of its longest strictly
 * increasing subsequence.
 *
 */
public class LongestIncreasingSubsequenceAlgorithm {

	/**
	 * Get the size of the longest increasing subsequence in an array.
	 *
	 * For example: given array [5, 2, 7, 4, 3, 8, 1], it should return 3 because
	 * the longest subsequence [2, 3, 8] has 3 items.
	 *
	 * @param values an unordered array of integers
	 * @return the length of the longest increasing subsequence
	 * @see Original solution: https://bojanv55.wordpress.com/2020/01/24/codility-slalomskiing-compact-slow/
	 */
	public static int findLongestSize(int[] values) {
		int[] tempSequence = new int[values.length];
		int maxLength = 0;

		for (int value : values) {
			int insertPosition = Arrays.binarySearch(tempSequence, 0, maxLength, value);
			if (insertPosition < 0) { // value not found
				insertPosition = -insertPosition - 1;
			}

			if (insertPosition == maxLength) {
				maxLength++;
			}

			tempSequence[insertPosition] = value;
		}

		return maxLength;
	}

	/**
	 * Get the longest increasing subsequence in an array.
	 *
	 * For example: given array [5, 2, 7, 4, 3, 8, 1], it should return the longest
	 * subsequence [2, 3, 8] which has 3 items.
	 *
	 * @param array an unordered array of integers
	 * @return the length of the longest increasing subsequence
	 * @see Original solution: https://www.geeksforgeeks.org/construction-of-longest-monotonically-increasing-subsequence-n-log-n/
	 */
	public static int[] findLongestSubsequence(int[] values) {
		// Definitions:
		//
		// "indexA" - an index of the values array, 0 <= indexA < values.length.
		// "positionX" - a position in the longest subsequence, 0 <= positionX <
		// maxLength - 1
		//

		//
		// tailIndices - indices of the latest items of increasing subsequences,
		// sorted by their corresponding values, i.e.
		// positionX < positionY <==> values[tailIndices[positionX]] <
		// values[tailIndices[positionY]],
		// where 0 <= positionX < positionY <= maxPosition = maxLength - 1
		//
		// length_of_subsequence(position) = position+1, where 0 <= position <=
		// maxPosition
		// maxLength = maxPosition + 1
		//
		int[] tailIndices = new int[values.length];

		//
		// previousIndices - in case indexA belongs to an increasing subsequence,
		// then indexB = previousIndices[indexA] also belongs to that increasing
		// subsequence
		// in a way that the subsequence containing indexA has a longest possible
		// length.
		//
		int[] previousIndices = new int[values.length];

		int maxPosition = 0;
		tailIndices[0] = 0;

		for (int index = 1; index < values.length; index++) {
			int position = getInsertPosition(values, tailIndices, values[index], -1, maxPosition + 1);

			// update tailIndices at the position
			tailIndices[position] = index;

			if (position > 0) {
				// build links to previous items
				previousIndices[index] = tailIndices[position - 1];

				// update maxPosition
				maxPosition = Integer.max(maxPosition, position);
			}
		}

		// build the longest subsequence
		int[] longestSubsequence = new int[maxPosition + 1];
		for (int position = maxPosition, index = tailIndices[position]; position >= 0; position--) {
			longestSubsequence[position] = values[index];
			index = previousIndices[index];
		}

		return longestSubsequence;
	}

	private static int getInsertPosition(int[] values, int[] tailIndexes, int keyValue, int left, int right) {
		while (right - left > 1) {
			int mid = (left + right) / 2;
			if (keyValue <= values[tailIndexes[mid]]) {
				right = mid;
			} else {
				left = mid;
			}
		}
		return right;
	}

	private LongestIncreasingSubsequenceAlgorithm() {
	}

}
