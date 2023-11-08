package org.namvu.codility.lesson09_MaxSliceProblem;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L09_03_MaxDoubleSliceSum_Tests {

	public static Stream<Arguments> createTestData() {

		final int half1 = 10;
		final int maxSize1 = half1 * 2 + 1;
		int[] bigArray1 = new int[maxSize1];
		for (int i = 0; i < maxSize1; i++) {
			bigArray1[i] = i - half1;
		}

		final int half2 = 10;
		final int maxSize2 = half2 * 2 + 1;
		int[] bigArray2 = new int[maxSize2];
		for (int i = 0; i < maxSize2; i++) {
			bigArray2[i] = i - half2;
		}

		return Stream.of(Arguments.of(new int[] {}, 0), Arguments.of(new int[] { -10 }, 0),
				Arguments.of(new int[] { 10, 10, 10 }, 0), Arguments.of(new int[] { 10, 10, 10, 10 }, 10),
				Arguments.of(new int[] { 3, 2, 6, -1, 4, 5, -1, 2 }, 17),
				Arguments.of(new int[] { -2 - 3, 4, -1, -2, 1, 5, -3 }, 9),
				Arguments.of(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 25),
				Arguments.of(new int[] { -1, -2, -3, -4, -5, -6, -7, -8 }, 0),
//				Arguments.of(new int[] { 1, 2, 3, 3, 4, 4, 4, 5, 3, 3, 2, 3, 3, 3, 3, 3, 5, 3 }, 2),
				Arguments.of(bigArray1, (half1 * (half1 - 1)) / 2), Arguments.of(bigArray2, (half2 * (half2 - 1)) / 2));

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] input, int output) {
		Assertions.assertEquals(output, new L09_03_MaxDoubleSliceSum1().solution(input));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int[] input, int output) {
		Assertions.assertEquals(output, new L09_03_MaxDoubleSliceSum2().solution(input));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test4(int[] input, int output) {
		Assertions.assertEquals(output, new L09_03_MaxDoubleSliceSum4().solution(input));
	}

}
