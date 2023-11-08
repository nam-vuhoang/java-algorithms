package org.namvu.codility.lesson08_Leader;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L08_02_EquiLeader_Tests {

	/**
	 * Create test data for method with the same name.
	 *
	 * @return
	 */
	public static Stream<Arguments> createTestData() {

		final int maxSize = 100000;

		int[] bigArray1 = new int[maxSize + 1];
		for (int i = 0; i < maxSize / 2; i++) {
			bigArray1[2 * i] = Integer.MIN_VALUE;
			bigArray1[2 * i + 1] = Integer.MAX_VALUE;
		}
		bigArray1[maxSize] = Integer.MAX_VALUE;

		return Stream.of(Arguments.of(new int[] { 4, 3, 4, 4, 4, 2 }, 2), Arguments.of(new int[] { 1 }, 0),
				Arguments.of(new int[] { 1, 1 }, 1), Arguments.of(new int[] { 1, 2 }, 0),
				Arguments.of(new int[] { 1, 2, 3, 3, 4, 4, 4, 5, 3, 3, 2 }, 0),
				Arguments.of(new int[] { 1, 2, 3, 3, 4, 4, 4, 5, 3, 3, 2, 3, 3, 3, 3, 3, 5, 3 }, 2),
				Arguments.of(new int[] { 4, 4, 2, 5, 3, 4, 4, 4 }, 3)
//				Arguments.of(bigArray1, 0)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] input, int output) {
		Assertions.assertEquals(output, new L08_02_EquiLeader1().solution(input));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int[] input, int output) {
		Assertions.assertEquals(output, new L08_02_EquiLeader2().solution(input));
	}

}
