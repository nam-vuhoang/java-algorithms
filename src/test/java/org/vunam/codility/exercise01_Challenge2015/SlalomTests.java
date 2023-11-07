package org.vunam.codility.exercise01_Challenge2015;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SlalomTests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of(new int[] {15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3}, 8)
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(int[] array, int output) {
		Assertions.assertEquals(output, new Slalom().solution(array));
	}

}
