package org.vunam.codility.lesson15_CatepillarMethod;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task15_02_CountDistinctSlices_Tests {

	public static Stream<Arguments> createTestData() {
		int maxSize1 = 100000;
//		int maxValue1 = 10000;
		int bigArray1[] = new int[maxSize1];
		for (int i = 0; i < maxSize1; i++) {
			bigArray1[i] = i;
		}

		return Stream.of(
				Arguments.of(6, new int[] {3, 4, 5, 5, 2}, 9),
				Arguments.of(6, new int[] {3, 4, 5, 5, 5, 2}, 10),
				Arguments.of(6, new int[] {3, 4, 5, 5, 5, 5, 2}, 11),
				Arguments.of(6, new int[] {3, 4, 5, 5, 5, 5, 2, 3}, 14),
				Arguments.of(6, new int[] {3, 4, 5, 5, 5, 5, 2, 3, 5}, 17),
				Arguments.of(10, new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 66), //
				Arguments.of(100000, new int[] {3, 4, 100, 100, 100, 2}, 10),
				Arguments.of(maxSize1, bigArray1, 1000000000)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int M, int[] A, int output) {
		Assertions.assertEquals(output, new Task15_02_CountDistinctSlices().solution(M, A));
	}

}
