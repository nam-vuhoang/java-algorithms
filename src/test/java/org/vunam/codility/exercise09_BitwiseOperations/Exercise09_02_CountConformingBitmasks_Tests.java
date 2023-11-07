package org.vunam.codility.exercise09_BitwiseOperations;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise09_02_CountConformingBitmasks_Tests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of(1073741727, 1073741631, 1073741679, 8)
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(int a, int b, int c, int output) {
		Assertions.assertEquals(output, new Exercise09_02_CountConformingBitmasks().solution(a, b, c));
	}

}
