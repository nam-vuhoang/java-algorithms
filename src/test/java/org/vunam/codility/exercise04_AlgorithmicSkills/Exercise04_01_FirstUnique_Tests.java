package org.vunam.codility.exercise04_AlgorithmicSkills;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise04_01_FirstUnique_Tests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of(new int[] {4, 10, 5, 4, 2, 10}, 5),
				Arguments.of(new int[] {1, 4, 3, 3, 1, 2}, 4),
				Arguments.of(new int[] {6, 4, 4, 6}, -1),
				Arguments.of(new int[] {0, 0, 1000000000, 999999999}, 1000000000),
				Arguments.of(new int[] {1000000000, 7, 1000000000}, 7)
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(int[] a, int output) {
		Assertions.assertEquals(output, new Exercise04_01_FirstUnique().solution(a));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int[] a, int output) {
		Assertions.assertEquals(output, new Exercise04_FirstUnique2().solution(a));
	}

}
