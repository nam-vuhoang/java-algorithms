package org.vunam.codility.exercise09_BitwiseOperations;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise09_03_SpareBinaryDecomposition_Tests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of(26, 10)
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(int a, int output) {
		Assertions.assertEquals(output, new Exercise09_03_SpareBinaryDecomposition().solution(a));
		Assertions.assertTrue(Exercise09_03_SpareBinaryDecomposition.isSparseNumber(output));
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 5, 10, 16, 21, 8, 9, 17, 18})
	public void testSparseNumber(int a) {
		Assertions.assertTrue(Exercise09_03_SpareBinaryDecomposition.isSparseNumber(a));
	}

	@ParameterizedTest
	@ValueSource(ints = {3, 7, Integer.MAX_VALUE, 11, 12, 26})
	public void testNonSparseNumber(int a) {
		Assertions.assertFalse(Exercise09_03_SpareBinaryDecomposition.isSparseNumber(a));
	}



}
