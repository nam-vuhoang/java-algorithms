package org.vunam.codility.lesson05_PrefixSums;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Lesson05_03_GenomicRangeQuery_Tests {

	public static Stream<Arguments> createTestData() {
		return Stream.of(
				Arguments.of("CAGCCTA", new int[] {2, 5, 0}, new int[] {4, 5, 6}, new int[] {2, 4, 1}),
				Arguments.of("C", new int[] {0}, new int[] {0}, new int[] {2}),
				Arguments.of("CA", new int[] {0, 0, 1}, new int[] {0, 1, 1}, new int[] {2, 1, 1}),
				Arguments.of("CACCCTA", new int[] {1, 5, 0}, new int[] {4, 5, 6}, new int[] {1, 4, 1})
		);
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(String S, int[] P, int[] Q, int[] output) {
		Assertions.assertArrayEquals(output, new Lesson05_03_GenomicRangeQuery().solution(S, P, Q));
	}

}
