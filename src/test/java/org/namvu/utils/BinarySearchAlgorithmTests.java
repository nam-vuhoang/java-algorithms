package org.namvu.utils;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BinarySearchAlgorithmTests {

	// 22 items
	private static final int[] ARRAY = new int[] {2, 2, 3, 5, 5, 5, 7, 11, 12, 13, 13, 13, 17, 19, 23, 29, 31, 37, 41, 43, 43, 43};

	public static Stream<Arguments> testFindIndex() {

		return Stream.of(
//				Arguments.of(new int[] {}, 5, 0, 0, -1),
				Arguments.of(new int[] {1, 2}, 5, 1, 1, -1),
				Arguments.of(new int[] {1, 2}, 1, 0, 1, 0),
				Arguments.of(ARRAY, 20, 0, ARRAY.length - 1, -1),
				Arguments.of(ARRAY, 11, 0, ARRAY.length - 1, 7),
				Arguments.of(ARRAY, 11, 5, 8, 7),
				Arguments.of(ARRAY, 11, 7, 8, 7),
				Arguments.of(ARRAY, 11, 8, 8, -1),
				Arguments.of(ARRAY, 13, 0, ARRAY.length - 1, (ARRAY.length - 1) / 2),
				Arguments.of(ARRAY, 2, 0, ARRAY.length - 1, 1),
				Arguments.of(ARRAY, 2, 3, ARRAY.length - 1, -1),
				Arguments.of(ARRAY, 43, 0, ARRAY.length - 1, 19),
				Arguments.of(ARRAY, 43, ARRAY.length - 3, ARRAY.length - 1, ARRAY.length - 2),
				Arguments.of(ARRAY, 43, ARRAY.length - 2, ARRAY.length - 1, ARRAY.length - 2),
				Arguments.of(ARRAY, 44, 0, ARRAY.length - 1, -1)

		);

	}

	public static Stream<Arguments> testFindMinIndex() {

		return Stream.of(
//				Arguments.of(new int[] {}, 5, 0, 0, -1),
				Arguments.of(new int[] {1, 2}, 5, 1, 1, 1+1),
				Arguments.of(new int[] {1, 2}, 1, 0, 1, 0),
				Arguments.of(ARRAY, 20, 0, ARRAY.length - 1, 14), // index of 23
				Arguments.of(ARRAY, 11, 0, ARRAY.length - 1, 7), // most left 11
				Arguments.of(ARRAY, 11, 5, 8, 7),
				Arguments.of(ARRAY, 11, 7, 8, 7),
				Arguments.of(ARRAY, 11, 8, 8, 8),
				Arguments.of(ARRAY, 13, 0, ARRAY.length - 1, 9), // index of most left 13
				Arguments.of(ARRAY, 2, 0, ARRAY.length - 1, 0), // index of most left 2
				Arguments.of(ARRAY, 2, 3, ARRAY.length - 1, 3),
				Arguments.of(ARRAY, 43, 0, ARRAY.length - 1, 19),
				Arguments.of(ARRAY, 43, ARRAY.length - 3, ARRAY.length - 1, ARRAY.length - 3),
				Arguments.of(ARRAY, 43, ARRAY.length - 2, ARRAY.length - 1, ARRAY.length - 2),
				Arguments.of(ARRAY, 44, 0, ARRAY.length - 1, ARRAY.length)
			);

	}

	public static Stream<Arguments> testFindMaxIndex() {

		return Stream.of(
//				Arguments.of(new int[] {}, 5, 0, 0, -1),
				Arguments.of(new int[] {1, 2}, 5, 1, 1, 1),
				Arguments.of(new int[] {1, 2}, 1, 0, 1, 0),
				Arguments.of(ARRAY, 20, 0, ARRAY.length - 1, 13), // index of 19
				Arguments.of(ARRAY, 11, 0, ARRAY.length - 1, 7), // index of most right 11
				Arguments.of(ARRAY, 11, 5, 8, 7),
				Arguments.of(ARRAY, 11, 7, 8, 7),
				Arguments.of(ARRAY, 11, 8, 8, 8-1),
				Arguments.of(ARRAY, 13, 0, ARRAY.length - 1, 11),  // index of most right 13
				Arguments.of(ARRAY, 2, 0, ARRAY.length - 1, 1), // index of most right 2
				Arguments.of(ARRAY, 2, 3, ARRAY.length - 1, 3-1), // no item found
				Arguments.of(ARRAY, 43, 0, ARRAY.length - 1, ARRAY.length - 1),
				Arguments.of(ARRAY, 43, ARRAY.length - 3, ARRAY.length - 1, ARRAY.length - 1),
				Arguments.of(ARRAY, 43, ARRAY.length - 2, ARRAY.length - 1, ARRAY.length - 1),
				Arguments.of(ARRAY, 44, 0, ARRAY.length - 1, ARRAY.length - 1)
			);

	}

	@ParameterizedTest
	@MethodSource(value = "")
	public void testFindIndex(int[] array, int value, int from, int to, int output) {
		Assertions.assertEquals(output, BinarySearchAlgorithm.findIndex(array, value, from, to));
	}

	@ParameterizedTest
	@MethodSource(value = "")
	public void testFindMinIndex(int[] array, int value, int from, int to, int output) {
		Assertions.assertEquals(output, BinarySearchAlgorithm.findMinIndex(array, value, from, to));
	}

	@ParameterizedTest
	@MethodSource(value = "")
	public void testFindMaxIndex(int[] array, int value, int from, int to, int output) {
		Assertions.assertEquals(output, BinarySearchAlgorithm.findMaxIndex(array, value, from, to));
	}



}

