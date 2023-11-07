package org.vunam.codility.lesson05_PrefixSums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Lesson05_04_MaxAvgTwoSlice_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(new int[] { 4, 2, 2, 5, 1, 5, 8 }, 1),
				Arguments.of(new int[] { 4, 2, 2, 5, 1, -5, 8 }, 4)
		);
	}

	@ParameterizedTest
	@MethodSource("createTestData")
	public void test(int[] input, int expectedOutput) {
		int actualOutput = new Lesson05_04_MaxAvgTwoSlice().solution(input);
		assertEquals(expectedOutput, actualOutput);
	}

	@ParameterizedTest
	@MethodSource("createTestData")
	public void test2(int[] input, int expectedOutput) {
		int actualOutput = new Lesson05_04_MaxAvgTwoSlice2().solution(input);
		assertEquals(expectedOutput, actualOutput);
	}

}
