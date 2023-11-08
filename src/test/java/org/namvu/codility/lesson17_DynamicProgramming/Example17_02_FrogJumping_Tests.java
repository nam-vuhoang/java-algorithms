package org.namvu.codility.lesson17_DynamicProgramming;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class Example17_02_FrogJumping_Tests {

	public static Stream<Arguments> createTestData() {
//		int maxSize1 = 100000;
//		int maxValue1 = 10000;
//		int bigArray1[] = new int[maxSize1];
//		for (int i = 0; i < maxSize1; i++) {
//			bigArray1[i] = maxValue1;
//		}

		return Stream.of(
				Arguments.of(new int[] {1}, 0, 1),
				Arguments.of(new int[] {1}, 6, 1),

				Arguments.of(new int[] {1, 2}, 0, 1),
				Arguments.of(new int[] {1, 2}, 1, 1),
				Arguments.of(new int[] {1, 2}, 2, 2),
				Arguments.of(new int[] {1, 2}, 3, 3),
				Arguments.of(new int[] {1, 2}, 4, 5),
				Arguments.of(new int[] {1, 2}, 5, 8),

				Arguments.of(new int[] {1, 2, 3}, 0, 1),
				Arguments.of(new int[] {1, 2, 3}, 1, 1),
				Arguments.of(new int[] {1, 2, 3}, 2, 2),
				Arguments.of(new int[] {1, 2, 3}, 3, 4),
				Arguments.of(new int[] {1, 2, 3}, 4, 7),
				Arguments.of(new int[] {1, 2, 3}, 5, 13),

				Arguments.of(new int[] {1, 2, 4}, 0, 1),
				Arguments.of(new int[] {1, 2, 4}, 1, 1),
				Arguments.of(new int[] {1, 2, 4}, 2, 2),
				Arguments.of(new int[] {1, 2, 4}, 3, 3),
				Arguments.of(new int[] {1, 2, 4}, 4, 6),
				Arguments.of(new int[] {1, 2, 4}, 5, 10),

				Arguments.of(new int[] {2, 4}, 0, 1),
				Arguments.of(new int[] {2, 4}, 1, 0),
				Arguments.of(new int[] {2, 4}, 2, 1),
				Arguments.of(new int[] {2, 4}, 3, 0),
				Arguments.of(new int[] {2, 4}, 4, 2),
				Arguments.of(new int[] {2, 4}, 5, 0)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] stepDistances, int distance, int output) {
		Assertions.assertEquals(output, new Example17_02_FrogJumping().getNumberOfJumpingOptions(stepDistances, distance));
	}

}
