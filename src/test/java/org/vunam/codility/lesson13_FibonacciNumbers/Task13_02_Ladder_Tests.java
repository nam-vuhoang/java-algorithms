package org.vunam.codility.lesson13_FibonacciNumbers;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task13_02_Ladder_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(new int[] {4, 4, 5, 5, 1}, new int[]{3, 2, 4, 3, 1}, new int[] {5, 1, 8, 0, 1}),
				Arguments.of(new int[] {50000, 4, 5, 5, 1}, new int[]{30, 2, 4, 3, 1}, new int[] {890883426, 1, 8, 0, 1})
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] a, int[] b, int[] output) {
		Assertions.assertArrayEquals(output, new Task13_02_Ladder().solution(a, b));
	}

}
