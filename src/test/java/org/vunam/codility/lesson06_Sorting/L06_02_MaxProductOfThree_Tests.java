package org.vunam.codility.lesson06_Sorting;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L06_02_MaxProductOfThree_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(new int[] { 5, 3, 5, 6}, 150 ),
				Arguments.of(new int[] { 3, 5, 6}, 90 ),
				Arguments.of(new int[] { 4, 2, 2, 5, 1, -5, 8 }, 160 ),
				Arguments.of(new int[] { 4, 2, 2, -5, 1, -5, 8 }, 200 ),
				Arguments.of(new int[] { 8 }, 0),
				Arguments.of(new int[] { }, 0)
		);
	}

	@ParameterizedTest
	@MethodSource(value = "com.codility.lesson06.sorting.TripletProductTests#createTestData()")
	public void test(int[] input, int output) {
		Assertions.assertEquals(new L06_02_MaxProductOfThree().solution(input), output);

	}

}
