package org.vunam.codility.lesson12_EuclideanAlgorithm;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task12_02_CommonPrimeDivisorsTests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(new int[] {15, 10, 9}, new int[] {75, 30, 5}, 1),
				Arguments.of(new int[] {15}, new int[] {75}, 1),
				Arguments.of(new int[] {15}, new int[] {100}, 0),
				Arguments.of(new int[] {25}, new int[] {100}, 0),
				Arguments.of(new int[] {50}, new int[] {100}, 1),
				Arguments.of(new int[] {13}, new int[] {13}, 1),
				Arguments.of(new int[] {13}, new int[] {13 * 13}, 1),
				Arguments.of(new int[] {97 * 2}, new int[] {97 * 97 * 97 * 2}, 1),
				Arguments.of(new int[] {97}, new int[] {91}, 0),
				Arguments.of(new int[] {10}, new int[] {10000}, 1),
				Arguments.of(new int[] {Integer.MAX_VALUE}, new int[] {100}, 0),
				Arguments.of(new int[] {Integer.MAX_VALUE}, new int[] {Integer.MAX_VALUE}, 1)
//				Arguments.of(1, 1, 1),
//				Arguments.of(1, 100, 1),
//				Arguments.of(100, 100, 1),
//				Arguments.of(1000000, 30, 100000)
//				Arguments.of(100, 5, 20)
//				Arguments.of(9, 24, 3),
//				Arguments.of(24, 18, 6),
//				Arguments.of(18, 24, 6),
//				Arguments.of(1, 1, 1),
//				Arguments.of(1, 2, 1),
//				Arguments.of(1, 24, 1),
//				Arguments.of(24, 1, 1),
//				Arguments.of(23, 24, 1),
//				Arguments.of(999999999, 6, 3),
//				Arguments.of(6, 999999999, 3),
//				Arguments.of(999999999, 999999998, 1),
//				Arguments.of(999999998, 999999999, 1),
//				Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE),
//				Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE - 1, 1)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int a[], int b[], int output) {
		Assertions.assertEquals(output, new Task12_02_CommonPrimeDivisors2().solution(a, b));
	}

}
