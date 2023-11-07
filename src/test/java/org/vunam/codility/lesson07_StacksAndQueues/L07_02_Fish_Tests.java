package org.vunam.codility.lesson07_StacksAndQueues;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L07_02_Fish_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of(new int[] { 4, 3, 2, 1, 5}, new int[] { 0, 1, 0, 0, 0}, 2 ),
				Arguments.of(new int[] { 4, 3, 2, 1, 5}, new int[] { 0, 0, 0, 0, 0}, 5 ),
				Arguments.of(new int[] { 4, 3, 2, 1, 5}, new int[] { 1, 1, 1, 1, 1}, 5 ),
				Arguments.of(new int[] { 4, 3, 2, 1, 5}, new int[] { 0, 1, 1, 0, 1}, 4 ),
				Arguments.of(new int[] { 4 }, new int[] { 1 }, 1 )
		);
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void testTrue(int[] A, int[]B , int expected) {
		Assertions.assertEquals(expected, new L07_02_Fish().solution(A, B));
	}

}
