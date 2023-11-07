package org.vunam.codility.lesson15_CatepillarMethod;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task15_04_MinAbsSumOfTwo_Tests {

	public static Stream<Arguments> createTestData() {
//		int maxSize1 = 100000;
//		int maxValue1 = 10000;
//		int bigArray1[] = new int[maxSize1];
//		for (int i = 0; i < maxSize1; i++) {
//			bigArray1[i] = maxValue1;
//		}

		return Stream.of(
				Arguments.of(new int[] {1, 4, -3}, 1),
				Arguments.of(new int[] {-8, 4, 5, -10, 3}, 3),
				Arguments.of(new int[] {-8, -4, -5, -10, -3}, 6),
				Arguments.of(new int[] {8, 4, 5, 10, 3}, 6),
				Arguments.of(new int[] {8, 4, 5, 10, 0, -9, 3}, 0),
				Arguments.of(new int[] {-130, -110, -80, -60, -20, 35, 100}, 10),
				Arguments.of(new int[] {-130, -110, -80, -60, -20, 35, 100, 110}, 0),
				Arguments.of(new int[] {-230, -210, -80, -20, 45, 100}, 20)
//				Arguments.of(new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE + 1, -5, -3, -3, -1, 0, 0, 0, 3, 6, Integer.MAX_VALUE}, 7)
//				Arguments.of(10, maxValue1, bigArray1, 100000 * 10000 / 10)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] A, int output) {
		Assertions.assertEquals(output, new Task15_04_MinAbsSumOfTwo().solution(A));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int[] A, int output) {
		Assertions.assertEquals(output, new Task15_04_MinAbsSumOfTwo2().solution(A));
	}

}
