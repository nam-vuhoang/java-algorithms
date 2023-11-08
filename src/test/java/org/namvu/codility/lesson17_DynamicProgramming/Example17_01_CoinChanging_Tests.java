package org.namvu.codility.lesson17_DynamicProgramming;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class Example17_01_CoinChanging_Tests {

	public static Stream<Arguments> createTestData() {
//		int maxSize1 = 100000;
//		int maxValue1 = 10000;
//		int bigArray1[] = new int[maxSize1];
//		for (int i = 0; i < maxSize1; i++) {
//			bigArray1[i] = maxValue1;
//		}

		return Stream.of(
				Arguments.of(new int[] {1, 3, 4}, 6, 2),
				Arguments.of(new int[] {1, 2, 5}, 12, 3),
				Arguments.of(new int[] {1, 2, 5}, 14, 4),
				Arguments.of(new int[] {1, 3, 4}, 2, 2),
				Arguments.of(new int[] {2, 3, 4}, 2, 1),
				Arguments.of(new int[] {2, 3, 4}, 5, 2),
				Arguments.of(new int[] {2, 3, 4}, 1, Integer.MAX_VALUE)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] coinTypes, int value, int output) {
		Assertions.assertEquals(output, new Example17_01_CoinChanging().getMinCoinNumber(coinTypes, value));
	}

}
