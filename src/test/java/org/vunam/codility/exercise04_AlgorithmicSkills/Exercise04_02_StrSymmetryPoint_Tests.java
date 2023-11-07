package org.vunam.codility.exercise04_AlgorithmicSkills;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise04_02_StrSymmetryPoint_Tests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of("racecar", 3),
				Arguments.of("raceecar", -1),
				Arguments.of("", -1),
				Arguments.of("a", 0)
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(String a, int output) {
		Assertions.assertEquals(output, new Exercise04_02_StrSymmetryPoint().solution(a));
	}


}
