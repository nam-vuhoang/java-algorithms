package org.vunam.codility.lesson11_SieveOfEratosthenes;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L11_02_CountSemiPrimes_Tests {

	/**
	 * Create test data for method with the same name.
	 *
	 * @return
	 */
	public static Stream<Arguments> createTestData() {

//		final int maxSize1 = 100000;
//
//		int[] bigArray1 = new int[maxSize1 + 1];
//		for (int i = 0; i < maxSize1 / 2; i++) {
//			bigArray1[2 * i] = Integer.MIN_VALUE;
//			bigArray1[2 * i + 1] = Integer.MAX_VALUE;
//		}
//		bigArray1[maxSize1] = Integer.MAX_VALUE;
//
//		final int maxSize2 = 100000;
//
//		int[] bigArray2 = new int[maxSize2];
//		for (int i = 0; i < maxSize2; i++) {
//			bigArray2[i] = i;
//		}

		return Stream.of(Arguments.of(26, new int[] { 1, 4, 16 }, new int[] { 26, 10, 20 }, new int[] { 10, 4, 0 }),
				Arguments.of(1, new int[] { 1 }, new int[] { 1 }, new int[] { 0 }),
				Arguments.of(2, new int[] { 1, 1, 1 }, new int[] { 1, 2, 1 }, new int[] { 0, 0, 0 }),
				Arguments.of(10, new int[] { 1, 4, 1 }, new int[] { 4, 6, 1 }, new int[] { 1, 2, 0 })
//				Arguments.of(new int[] {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}, new int[] {}),
//				Arguments.of(new int[] {1}, new int[] {0}),
//				Arguments.of(new int[] {1, 2}, new int[] {1, 0})
//				Arguments.of(bigArray1, 9091),
//				Arguments.of(bigArray2, 0)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int N, int[] P, int[] Q, int[] output) {
		Assertions.assertArrayEquals(output, new L11_02_CountSemiPrimes().solution(N, P, Q));
	}

}
