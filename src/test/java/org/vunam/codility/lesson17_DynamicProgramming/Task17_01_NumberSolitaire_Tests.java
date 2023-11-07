package org.vunam.codility.lesson17_DynamicProgramming;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task17_01_NumberSolitaire_Tests {

	public static Stream<Arguments> createTestData() {
//		int maxSize1 = 100000;
//		int maxValue1 = 10000;
//		int bigArray1[] = new int[maxSize1];
//		for (int i = 0; i < maxSize1; i++) {
//			bigArray1[i] = maxValue1;
//		}

		return Stream.of(
				Arguments.of(new int[] {1, -2, 0, 9, -1, -2}, 8)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] A, int output) {
		Assertions.assertEquals(output, new Task17_01_NumberSolitaire().solution(A));
	}

}
