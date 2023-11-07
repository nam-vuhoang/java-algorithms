package org.vunam.codility.lesson10_PrimeNumbers;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L10_01_CountFactors_Tests {

	public static Stream<Arguments> test1() {

//		final int maxSize = 100000;
//
//		int[] bigArray1 = new int[maxSize + 1];
//		for (int i = 0; i < maxSize / 2; i++) {
//			bigArray1[2 * i] = Integer.MIN_VALUE;
//			bigArray1[2 * i + 1] = Integer.MAX_VALUE;
//		}
//		bigArray1[maxSize] = Integer.MAX_VALUE;

		return Stream.of(
				Arguments.of(24, 8),
				Arguments.of(1, 1),
				Arguments.of(2, 2),
				Arguments.of(4, 3),
				Arguments.of(Integer.MAX_VALUE, 2)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "")
	public void test1(int input, int output) {
		Assertions.assertEquals(output, new L10_01_CountFactors().solution(input));
	}

}
