package org.vunam.codility.lesson09_MaxSliceProblem;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L09_02_MaxSliceSum_Tests {

	public static Stream<Arguments> createTestData() {

//		final int maxSize = 100000;
//
//		int[] bigArray1 = new int[maxSize + 1];
//		for (int i = 0; i < maxSize / 2; i++) {
//			bigArray1[2 * i] = Integer.MIN_VALUE;
//			bigArray1[2 * i + 1] = Integer.MAX_VALUE;
//		}
//		bigArray1[maxSize] = Integer.MAX_VALUE;

		return Stream.of(Arguments.of(new int[] {}, 0), Arguments.of(new int[] { -10 }, -10),
				Arguments.of(new int[] { 10 }, 10), Arguments.of(new int[] { -1000000, 1000000 }, 1000000),
				Arguments.of(new int[] { 3, 2, -6, 4, 0 }, 5), Arguments.of(new int[] { 3, 2, -6, 4, 7, 0 }, 11)
//				Arguments.of(new int[] { 1, 2, 3, 3, 4, 4, 4, 5, 3, 3, 2, 3, 3, 3, 3, 3, 5, 3 }, 2),
//				Arguments.of(bigArray1, 1)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] input, int output) {
		Assertions.assertEquals(output, new L09_02_MaxSliceSum().solution(input));
	}

}
