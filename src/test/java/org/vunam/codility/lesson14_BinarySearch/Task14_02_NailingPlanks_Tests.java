package org.vunam.codility.lesson14_BinarySearch;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Task14_02_NailingPlanks_Tests {

	public static Stream<Arguments> createTestData() {
//		int maxSize1 = 100000;
//		int maxValue1 = 10000;
//		int bigArray1[] = new int[maxSize1];
//		for (int i = 0; i < maxSize1; i++) {
//			bigArray1[i] = maxValue1;
//		}

		return Stream.of(
				Arguments.of(new int[] {1, 4, 5, 8}, new int[] {4, 5, 9, 10}, new int [] {4, 6, 7, 10, 2}, 4),
				Arguments.of(new int[] {1, 4, 5, 8, 1}, new int[] {4, 5, 9, 10, 12}, new int [] {4, 6, 7, 10, 2}, 4),
				Arguments.of(new int[] {1, 4, 5, 8, 11}, new int[] {4, 5, 9, 10, 12}, new int [] {4, 6, 7, 10, 2}, -1),
				Arguments.of(new int[] {1, 4, 5, 8, -1}, new int[] {4, 5, 9, 10, 0}, new int [] {4, 6, 7, 10, 2}, -1),
				Arguments.of(new int[] {1}, new int[] {4}, new int [] {4}, 1),
				Arguments.of(new int[] {1}, new int[] {4}, new int [] {0, 4}, 2)
//				Arguments.of(10, maxValue1, bigArray1, 100000 * 10000 / 10)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] A, int[] B, int[] C, int output) {
		Assertions.assertEquals(output, new Task14_02_NailingPlanks().solution(A, B, C));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int[] A, int[] B, int[] C, int output) {
		Assertions.assertEquals(output, new Task14_02_NailingPlanks2().solution(A, B, C));
	}

}
