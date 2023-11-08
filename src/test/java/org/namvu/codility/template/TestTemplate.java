package org.namvu.codility.template;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

class Solution {

	public int solution(int[] H) {
		return 0;
	}

}


@SpringBootTest
public class TestTemplate {

	/**
	 * Create test data for method with the same name.
	 * @return
	 */
	public static Stream<Arguments> test1() {

		return Stream.of(
				Arguments.of(new int[] {1, 2, 3, 3, 4, 4, 4, 5, 3, 3, 2}, 5)
		);

	}

	private Solution solution = new Solution();


	@ParameterizedTest
	@MethodSource(value = "")
	public void test1(int[] input, int output) {
		Assertions.assertEquals(output, solution.solution(input));
	}

}
