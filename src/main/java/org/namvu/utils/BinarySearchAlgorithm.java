package org.namvu.utils;

public class BinarySearchAlgorithm {

	/**
	 * Find the index any item with value equal {@code value}.
	 *
	 * @param array
	 * @param value
	 * @param left     The left index (inclusive).
	 * @param right    The right index (inclusive).
	 * @return The index of the item found, or {@code -1} if not found.
	 */
	public static int findIndex(int[] array, int value, int left, int right) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] > value) {
				right = mid - 1; // try to find in the left half.
			} else if (array[mid] < value) {
				left = mid + 1; // try to find in the right half.
			} else {
				return mid; // stop searching and return the index found.
			}
		}

		return -1; // no item found
	}

	/**
	 * Find the index of the most left item with value greater or equal minValue.
	 *
	 * @param array
	 * @param minValue
	 * @param left     The left index (inclusive).
	 * @param right    The right index (inclusive).
	 * @return The index of the most left item found, or {@code right + 1} if not
	 *         found.
	 */
	public static int findMinIndex(int[] array, int minValue, int left, int right) {
		int minIndex = right + 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] >= minValue) {
				minIndex = mid; /// remember the item found
				right = mid - 1; // try to find another item in the left half
			} else {
				left = mid + 1; // try to find in the right half
			}
		}

		return minIndex;
	}

	/**
	 * Find the index of the most right item with value less or equal
	 * {@code maxValue}.
	 *
	 * @param array
	 * @param maxValue
	 * @param left     The left index (inclusive).
	 * @param right    The right index (inclusive).
	 * @return The index of the most right item found, or {@code left - 1} if not
	 *         found.
	 */
	public static int findMaxIndex(int[] array, int maxValue, int left, int right) {
		int maxIndex = left - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] <= maxValue) {
				maxIndex = mid; // remember the item found
				left = mid + 1; // try to find another item in the right half
			} else {
				right = mid - 1; // try to find in the left half
			}
		}

		return maxIndex;
	}

	private BinarySearchAlgorithm() {
	}

}
