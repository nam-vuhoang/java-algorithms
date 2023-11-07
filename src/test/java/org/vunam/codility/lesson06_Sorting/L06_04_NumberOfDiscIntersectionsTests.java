package org.vunam.codility.lesson06_Sorting;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class L06_04_NumberOfDiscIntersectionsTests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(new int[] { 1, 5, 2, 1, 4, 0 }, 11 )
//				Arguments.of(new int[] { 3, 5, 6}, 90 ),
//				Arguments.of(new int[] { 4, 2, 2, 5, 1, -5, 8 }, 160 ),
//				Arguments.of(new int[] { 4, 2, 2, -5, 1, -5, 8 }, 200 ),
//				Arguments.of(new int[] { 8 }, 0),
//				Arguments.of(new int[] { }, 0)
		);
	}

	@ParameterizedTest
	@MethodSource(value = "com.codility.lesson06.sorting.NumberOfDiscIntersectionsTests#createTestData()")
	public void test(int[] input, int output) {
		Assertions.assertEquals(output, new L06_04_NumberOfDiscIntersections().solution(input));
	}

	@ParameterizedTest
	@MethodSource(value = "com.codility.lesson06.sorting.NumberOfDiscIntersectionsTests#createTestData()")
	public void test2(int[] input, int output) {
		Assertions.assertEquals(output, new L06_04_NumberOfDiscIntersections2().solution(input));
	}

	@ParameterizedTest
	@MethodSource(value = "com.codility.lesson06.sorting.NumberOfDiscIntersectionsTests#createTestData()")
	public void test3(int[] input, int output) {
		Assertions.assertEquals(output, new L06_04_NumberOfDiscIntersections3().solution(input));
	}


}
