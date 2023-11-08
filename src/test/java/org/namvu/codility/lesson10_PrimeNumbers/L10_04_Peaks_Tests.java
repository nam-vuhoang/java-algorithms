package org.namvu.codility.lesson10_PrimeNumbers;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L10_04_Peaks_Tests {

	public static Stream<Arguments> createTestData() {

		final int maxSize1 = 100000;

		int[] bigArray1 = new int[maxSize1 + 1];
		for (int i = 0; i < maxSize1 / 2; i++) {
			bigArray1[2 * i] = Integer.MIN_VALUE;
			bigArray1[2 * i + 1] = Integer.MAX_VALUE;
		}
		bigArray1[maxSize1] = Integer.MAX_VALUE;

		final int maxSize2 = 100000;

		int[] bigArray2 = new int[maxSize2];
		for (int i = 0; i < maxSize2; i++) {
			bigArray2[i] = i;
		}

		return Stream.of(
				Arguments.of(new int[] {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}, 3),
				Arguments.of(new int[] {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}, 3),
				Arguments.of(new int[] {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2, 2}, 1),
				Arguments.of(new int[] {1, 2, 3, 4, 5, 6}, 0),
				Arguments.of(new int[] {1}, 0),
				Arguments.of(new int[] {1, 2}, 0),
				Arguments.of(new int[] {1, 2, 1}, 1),
				Arguments.of(bigArray1, 9091),
				Arguments.of(bigArray2, 0)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] input, int output) {
		Assertions.assertEquals(output, new L10_04_Peaks().solution(input));
	}

}
