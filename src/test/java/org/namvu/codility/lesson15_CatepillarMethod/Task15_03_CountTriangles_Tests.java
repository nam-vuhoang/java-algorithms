package org.namvu.codility.lesson15_CatepillarMethod;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Task15_03_CountTriangles_Tests {

	public static Stream<Arguments> createTestData() {
//		int maxSize1 = 100000;
////		int maxValue1 = 10000;
//		int bigArray1[] = new int[maxSize1];
//		for (int i = 0; i < maxSize1; i++) {
//			bigArray1[i] = i;
//		}

		return Stream.of(Arguments.of(new int[] { 10, 2, 5, 1, 8, 12 }, 4)
//				Arguments.of(maxSize1, bigArray1, 1000000000)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int[] A, int output) {
		Assertions.assertEquals(output, new Task15_03_CountTriangles().solution(A));
	}

}
