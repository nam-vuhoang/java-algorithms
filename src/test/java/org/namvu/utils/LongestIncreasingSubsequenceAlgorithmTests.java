package org.namvu.utils;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.namvu.utils.LongestIncreasingSubsequenceAlgorithm;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class LongestIncreasingSubsequenceAlgorithmTests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of(new int[] {15, 27, 14, 38, 26, 55, 46, 65, 85, 1}, new int[]{15, 27, 38, 46, 65, 85}),
				Arguments.of(new int[] {5, 2, 7, 4, 3, 8, 1}, new int[]{2, 3, 8})
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(int[] array, int[] output) {
		Assertions.assertEquals(output.length, LongestIncreasingSubsequenceAlgorithm.findLongestSize(array));
	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test2(int[] array, int[] output) {
		int[] longestSubsequence = LongestIncreasingSubsequenceAlgorithm.findLongestSubsequence(array);
		Assertions.assertArrayEquals(output, longestSubsequence);
	}



}

