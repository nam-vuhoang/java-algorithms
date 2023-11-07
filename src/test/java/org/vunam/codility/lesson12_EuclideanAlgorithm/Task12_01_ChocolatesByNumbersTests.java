package org.vunam.codility.lesson12_EuclideanAlgorithm;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task12_01_ChocolatesByNumbersTests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(10, 4, 5),
				Arguments.of(1, 1, 1),
				Arguments.of(1, 100, 1),
				Arguments.of(100, 100, 1),
				Arguments.of(1000000, 30, 100000)
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
	public void test1(int a, int b, int output) {
		Assertions.assertEquals(output, new Task12_01_ChocolatesByNumbers().solution(a, b));
	}

}
