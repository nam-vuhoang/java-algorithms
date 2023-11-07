package org.vunam.codility.lesson16_GreedyAlgorithm;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task16_01_MaxNonoverlappingSegments_Tests {

	public static Stream<Arguments> createTestData() {
		int maxSize1 = 100000;
		int maxValue1 = 10000;
		int bigArray1[] = new int[maxSize1];
		for (int i = 0; i < maxSize1; i++) {
			bigArray1[i] = maxValue1;
		}

		return Stream.of(
				Arguments.of(new int[] {1, 3, 7, 9, 9}, new int[] {5, 6, 8, 9, 10}, 3),
				Arguments.of(new int[] {1, 2, 3, 7, 9, 9}, new int[] {5, 5, 6, 8, 9, 10}, 3),
				Arguments.of(new int[] {1}, new int[] {5}, 1),
				Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 8),
				Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 4),
				Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[] {2, 3, 4, 5, 6, 7, 8, 9, 9}, 5)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] A, int[] B, int output) {
		Assertions.assertEquals(output, new Task16_01_MaxNonoverlappingSegments_Solution().solution(A, B));
	}

}
