package org.namvu.codility.lesson14_BinarySearch;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task14_01_MinMaxDivision_Tests {

	public static Stream<Arguments> createTestData() {
		int maxSize1 = 100000;
		int maxValue1 = 10000;
		int bigArray1[] = new int[maxSize1];
		for (int i = 0; i < maxSize1; i++) {
			bigArray1[i] = maxValue1;
		}

		return Stream.of(
				Arguments.of(3, 5, new int[] {2, 1, 5, 1, 2, 2, 2}, 6),
				Arguments.of(1, 5, new int[] {2, 1, 5, 1, 2, 2, 2}, 15),
				Arguments.of(10, 272, new int[] {272}, 272),
				Arguments.of(10, 100, new int[] {100, 100}, 100),
				Arguments.of(1, 100, new int[] {12, 87, 23, 34, 100, 40, 40}, 336),
				Arguments.of(2, 100, new int[] {12, 87, 23, 34, 100, 40, 40}, 180),
				Arguments.of(3, 100, new int[] {12, 87, 23, 34, 100, 40, 40}, 134),
				Arguments.of(4, 100, new int[] {12, 87, 23, 34, 100, 40, 40}, 100),
				Arguments.of(10, 100, new int[] {12, 87, 23, 34, 100, 40, 40}, 100),
				Arguments.of(10, maxValue1, bigArray1, 100000 * 10000 / 10)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int K, int M, int[] A, int output) {
		Assertions.assertEquals(output, new Task14_01_MinMaxDivision().solution(K, M, A));
	}

}
