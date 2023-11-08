package org.namvu.codility.lesson10_PrimeNumbers;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L10_02_MinPerimeterRectangle_Tests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of(1, 4),
				Arguments.of(2, 6),
				Arguments.of(3, 8),
				Arguments.of(4, 8),
				Arguments.of(10, 14),
				Arguments.of(10000, 400),
				Arguments.of(1000000000, 126500)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(int input, int output) {
		Assertions.assertEquals(output, new L10_02_MinPerimeterRectangle().solution(input));
	}


}
