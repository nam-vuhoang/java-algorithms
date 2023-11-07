package org.vunam.codility.lesson06_Sorting;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class L06_01_Distinct_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(new int[] { 5, 3, 5, 6}, 3),
				Arguments.of(new int[] { 4, 2, 2, 5, 1, -5, 8 }, 6),
				Arguments.of(new int[] { 8 }, 1),
				Arguments.of(new int[] { }, 0)
		);
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(int[] input, int output) {
		Assertions.assertEquals(new L06_01_Distinct().solution(input), output);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int[] input, int output) {
		Assertions.assertEquals(new L06_01_Distinct().solution2(input), output);

	}

}
