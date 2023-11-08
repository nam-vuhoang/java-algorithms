package org.namvu.codility.companyP.task02;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Task02_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of("NAANAAXNABABYNNBZ", 2),
				Arguments.of("NAABXXAN", 1),
				Arguments.of("QABAAAWOBL", 0),
				Arguments.of("N", 0),
				Arguments.of("X", 0),
				Arguments.of("", 0)
		);

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(String A, int output) {
		Assertions.assertEquals(output, new Task02().solution(A));
	}


}
