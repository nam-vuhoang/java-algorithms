package org.namvu.codility.exercise04_AlgorithmicSkills;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise04_05_DisappearingPairs_Tests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(
				Arguments.of("ACCAABBC", "AC"),
				Arguments.of("BABABA", "BABABA"),
				Arguments.of("", ""),
				Arguments.of("A", "A"),
				Arguments.of("AA", ""),
				Arguments.of("ABCBBCBA", ""),
				Arguments.of("ABCABCABCABCBBCBACBACBACBA", ""),
				Arguments.of("ABCABCABCABCBBCBACBABBACBAABCACBACBA", "")
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(String a, String output) {
		Assertions.assertEquals(output, new Exercise04_05_DisappearingPairs().solution(a));
	}

//	@ParameterizedTest
//	@MethodSource(value = "createTestData")
//	public void test2(String a, String output) {
//		Assertions.assertEquals(output, new Exercise04_05_DisappearingPairs2().solution(a));
//	}


}
