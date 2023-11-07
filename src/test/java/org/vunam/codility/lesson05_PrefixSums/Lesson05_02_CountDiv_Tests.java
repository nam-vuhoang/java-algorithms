package org.vunam.codility.lesson05_PrefixSums;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Lesson05_02_CountDiv_Tests {

	public static Stream<Arguments> createTestData() {
		final int MAX = 2000000000;
		return Stream.of(
				Arguments.of(6, 11, 2, 3),
				Arguments.of(0, 1, 1, 2),
				Arguments.of(0, 0, 1, 1),
				Arguments.of(0, 10, 2, 6),
				Arguments.of(5, 5, 2, 0),
				Arguments.of(6, 6, 2, 1),
				Arguments.of(MAX, MAX, MAX, 1),
				Arguments.of(0, 2000000000, 2000000000, 2)
		);
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int A, int B, int K, int output) {
		Assertions.assertEquals(output, new Lesson05_02_CountDiv().solution(A, B, K));
	}

}
