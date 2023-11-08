package org.namvu.utils;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.namvu.utils.ArithmeticUtils;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ArithmeticUtils_CommonNumbers_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(24, 9, 3),
				Arguments.of(9, 24, 3),
				Arguments.of(24, 18, 6),
				Arguments.of(18, 24, 6),
				Arguments.of(1, 1, 1),
				Arguments.of(1, 2, 1),
				Arguments.of(1, 24, 1),
				Arguments.of(24, 1, 1),
				Arguments.of(23, 24, 1),
				Arguments.of(999999999, 6, 3),
				Arguments.of(6, 999999999, 3),
				Arguments.of(999999999, 999999998, 1),
				Arguments.of(999999998, 999999999, 1),
				Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE),
				Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE - 1, 1)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test_getGreatestCommonDivisorBySubstraction(int a, int b, int output) {
		Assertions.assertEquals(output, ArithmeticUtils.CommonNumbers.getGreatestCommonDivisorBySubstraction(a, b));
	}

	/**
	 * Fastest method.
	 *
	 * Time complexity: O(log(a + b))
	 *
	 * If a > b, then gcd(a, b) = gcd(b, a mod b)
	 *
	 * @param a
	 * @param b
	 * @param output
	 */
	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test_getGreatestCommonDivisorByDivision(int a, int b, int output) {
		Assertions.assertEquals(output, ArithmeticUtils.CommonNumbers.getGreatestCommonDivisorByDivision(a, b));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test_getGreatestCommonDivisorBySubstractionAndDivision(int a, int b, int output) {
		Assertions.assertEquals(output, ArithmeticUtils.CommonNumbers.getGreatestCommonDivisorBySubstractionAndDivision(a, b));
	}


	public static Stream<Arguments> createTestData_LCM() {
		return Stream.of(
				Arguments.of(24, 9, 72),
				Arguments.of(9, 24, 72),
				Arguments.of(24, 18, 72),
				Arguments.of(18, 24, 72),
				Arguments.of(1, 1, 1),
				Arguments.of(1, 2, 2),
				Arguments.of(1, 24, 24),
				Arguments.of(24, 1, 24),
				Arguments.of(23, 24, 23 * 24),
				Arguments.of(999999999, 6, 999999999 * 2),
				Arguments.of(6, 999999999, 999999999 * 2),
				Arguments.of(999999999, 999999998, 999999999L * 999999998L),
				Arguments.of(999999998, 999999999, 999999999L * 999999998L),
				Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE),
				Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE - 1, (long)Integer.MAX_VALUE * (Integer.MAX_VALUE - 1))
			);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData_LCM")
	public void test_getLeastCommonMultiple(int a, int b, long output) {
		Assertions.assertEquals(output, ArithmeticUtils.CommonNumbers.getLeastCommonMultiple(a, b));
	}

}
