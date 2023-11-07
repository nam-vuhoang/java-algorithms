package org.vunam.codility.lesson07_StacksAndQueues;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L07_04_StoneWall_Tests {

	public static Stream<Arguments> createTestData() {

		int[] bigArray = new int[100000];
		for (int i = 0; i < 50000; i++) {
			bigArray[2 * i] = 1;
			bigArray[2 * i + 1] = 2;
		}
		Arguments bigArrayArguments = Arguments.of(bigArray, 50001);

		return Stream.of(
				Arguments.of(new int[] {}, 0),
				Arguments.of(new int[] {1}, 1),
				Arguments.of(new int[] {5, 5}, 1),
				Arguments.of(new int[] {1, 1, 2, 2}, 2),
				Arguments.of(new int[] {2, 1}, 2),
				Arguments.of(new int[] {9, 5, 7, 7, 9, 9}, 4),
				Arguments.of(new int[] {9, 5, 7, 7, 3, 3}, 4),
				Arguments.of(new int[] {9, 5, 7, 7, 3, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, 5),
				Arguments.of(new int[] {1, 2, 3, 3, 4, 4, 4, 5, 3, 3, 2}, 5),
				Arguments.of(new int[] {8, 8, 5, 7, 9, 8, 8, 7, 7, 4, 8 }, 7),
				bigArrayArguments
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] input, int output) {
		Assertions.assertEquals(output, new L07_04_StoneWall().solution(input));
	}

}
