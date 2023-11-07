package org.vunam.codility.lesson15_CatepillarMethod;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task15_01_AbsDistinct_Tests {

	public static Stream<Arguments> createTestData() {
//		int maxSize1 = 100000;
//		int maxValue1 = 10000;
//		int bigArray1[] = new int[maxSize1];
//		for (int i = 0; i < maxSize1; i++) {
//			bigArray1[i] = maxValue1;
//		}

		return Stream.of(
				Arguments.of(new int[] {-5, -3, -1, 0, 3, 6}, 5),
				Arguments.of(new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE + 1, -5, -3, -3, -1, 0, 0, 0, 3, 6, Integer.MAX_VALUE}, 7)
//				Arguments.of(10, maxValue1, bigArray1, 100000 * 10000 / 10)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] A, int output) {
		Assertions.assertEquals(output, new Task15_01_AbsDistinct().solution(A));
	}

}
