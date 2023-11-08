package org.namvu.utils;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.namvu.utils.ArithmeticUtils;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ArithmeticUtils_PrimeNumbers_Tests {

	/**
	 * Create test data for method with the same name.
	 *
	 * @return
	 */
	public static Stream<Arguments> testPrimeNumbers() {

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

		return Stream.of(
				Arguments.of(1, new int[] {}),
				Arguments.of(0, new int[] {}),
				Arguments.of(2, new int[] {2}),
				Arguments.of(3, new int[] {2, 3}),
				Arguments.of(10, new int[] {2, 3, 5, 7}),
				Arguments.of(101, new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101})
		);

	}

	@ParameterizedTest
	@MethodSource(value = "")
	public void testPrimeNumbers(int input, int[] output) {
		Assertions.assertArrayEquals(output, ArithmeticUtils.PrimeNumbers.getPrimes(input));
	}


	/**
	 * Create test data for method with the same name.
	 *
	 * @return
	 */
	public static Stream<Arguments> testSmallestDivisors() {

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

		return Stream.of(
				Arguments.of(0, new int[] {0}),
				Arguments.of(1, new int[] {0, 1}),
				Arguments.of(2, new int[] {0, 1, 2}),
				Arguments.of(3, new int[] {0, 1, 2, 3}),
				Arguments.of(11, new int[] {0, 1, 2, 3, 2, 5, 2, 7, 2, 3, 2, 11}),
				Arguments.of(24, new int[] {0, 1, 2, 3, 2, 5, 2, 7, 2, 3, 2, 11, 2, 13, 2, 3, 2, 17, 2, 19, 2, 3, 2, 23, 2})
//				Arguments.of(101, new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101})
				);

	}

	@ParameterizedTest
	@MethodSource(value = "")
	public void testSmallestDivisors(int input, int[] output) {
		Assertions.assertArrayEquals(output, ArithmeticUtils.PrimeNumbers.getSmallestDivisorMap(input));
	}

	private static int[] smallestDivisorMap;

	@BeforeAll
	public static void setUp() {
		smallestDivisorMap = ArithmeticUtils.PrimeNumbers.getSmallestDivisorMap(200);
		System.out.println(Arrays.toString(smallestDivisorMap));
	}




	/**
	 * Create test data for method with the same name.
	 *
	 * @return
	 */
	public static Stream<Arguments> test_getSmallestDivisorMap() {
		return Stream.of(
				Arguments.of(1,new int[] {0, 1}),
				Arguments.of(12,new int[] {0, 1, 2, 3, 2, 5, 2, 7, 2, 3, 2, 11, 2}),
				Arguments.of(32,new int[] {0, 1, 2, 3, 2, 5, 2, 7, 2, 3, 2, 11, 2, 13, 2, 3, 2, 17, 2, 19, 2, 3, 2, 23, 2, 5, 2, 3, 2, 29, 2, 31, 2}),
				Arguments.of(200,new int[] {0, 1, 2, 3, 2, 5, 2, 7, 2, 3, 2, 11, 2, 13, 2, 3, 2, 17, 2, 19, 2, 3, 2, 23, 2, 5, 2, 3, 2, 29, 2, 31, 2, 3, 2, 5, 2, 37, 2, 3, 2, 41, 2, 43, 2, 3, 2, 47, 2, 7, 2, 3, 2, 53, 2, 5, 2, 3, 2, 59, 2, 61, 2, 3, 2, 5, 2, 67, 2, 3, 2, 71, 2, 73, 2, 3, 2, 7, 2, 79, 2, 3, 2, 83, 2, 5, 2, 3, 2, 89, 2, 7, 2, 3, 2, 5, 2, 97, 2, 3, 2, 101, 2, 103, 2, 3, 2, 107, 2, 109, 2, 3, 2, 113, 2, 5, 2, 3, 2, 7, 2, 11, 2, 3, 2, 5, 2, 127, 2, 3, 2, 131, 2, 7, 2, 3, 2, 137, 2, 139, 2, 3, 2, 11, 2, 5, 2, 3, 2, 149, 2, 151, 2, 3, 2, 5, 2, 157, 2, 3, 2, 7, 2, 163, 2, 3, 2, 167, 2, 13, 2, 3, 2, 173, 2, 5, 2, 3, 2, 179, 2, 181, 2, 3, 2, 5, 2, 11, 2, 3, 2, 191, 2, 193, 2, 3, 2, 197, 2, 199, 2})
		);

	}



	@ParameterizedTest
	@MethodSource(value = "")
	public void test_getSmallestDivisorMap(int input, int[] output) {
		Assertions.assertArrayEquals(output, ArithmeticUtils.PrimeNumbers.getSmallestDivisorMap(input));
	}


	/**
	 * Create test data for method with the same name.
	 *
	 * @return
	 */
	public static Stream<Arguments> testFactorize() {
		return Stream.of(
//				Arguments.of(0,new int[] {0}),
				Arguments.of(1,new int[] {1}),
				Arguments.of(2,new int[] {2}),
				Arguments.of(3,new int[] {3}),
				Arguments.of(4,new int[] {2, 2}),
				Arguments.of(6,new int[] {2, 3}),
				Arguments.of(11,new int[] {11}),
				Arguments.of(12,new int[] {2, 2, 3}),
				Arguments.of(99,new int[] {3, 3, 11}),
				Arguments.of(100,new int[] {2, 2, 5, 5}),
				Arguments.of(101,new int[] {101})
//				Arguments.of(101, new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101})
				);

	}



	@ParameterizedTest
	@MethodSource(value = "")
	public void testFactorize(int input, int[] output) {
		Assertions.assertArrayEquals(output, ArithmeticUtils.PrimeNumbers.factorize(input, smallestDivisorMap));
	}

}

