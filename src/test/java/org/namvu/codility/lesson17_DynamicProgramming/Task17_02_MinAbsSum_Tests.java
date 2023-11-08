package org.namvu.codility.lesson17_DynamicProgramming;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task17_02_MinAbsSum_Tests {

	public static Stream<Arguments> createTestData() {
		int maxSize1 = 20;
		int maxValue1 = 10;
		int bigArray1[] = new int[maxSize1];
		for (int i = 0; i < maxSize1; i++) {
			bigArray1[i] = maxValue1;
		}

		int maxSize2 = 20000 - 1;
		int maxValue2 = 100;
		int bigArray2[] = new int[maxSize2];
		for (int i = 0; i < maxSize2; i++) {
			bigArray2[i] = -maxValue2;
		}

		return Stream.of(
				Arguments.of(new int[] {1, 5, 2, -2}, 0),
				Arguments.of(new int[] {}, 0),
				Arguments.of(new int[] {0}, 0),
				Arguments.of(new int[] {5}, 5),
				Arguments.of(new int[] {-5}, 5),
				Arguments.of(new int[] {1, 5, 2, -2, 11}, 1),
				Arguments.of(new int[] {3, 3, 3, 4, 5}, 0),
				Arguments.of(bigArray1, 0),
				Arguments.of(bigArray2, 100)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] A, int output) {
		Assertions.assertEquals(output, new Task17_02_MinAbsSum().solution(A));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test3(int[] A, int output) {
		Assertions.assertEquals(output, new Task17_02_MinAbsSum2().solution(A));
	}

}
