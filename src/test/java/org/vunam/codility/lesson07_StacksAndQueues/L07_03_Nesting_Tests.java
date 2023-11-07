package org.vunam.codility.lesson07_StacksAndQueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L07_03_Nesting_Tests {

	private L07_03_Nesting solution = new L07_03_Nesting();

	@ParameterizedTest
	@ValueSource(strings = { "(()(())())", "" })
	public void testTrue(String s) {
		Assertions.assertEquals(1, solution.solution(s));
	}

	@ParameterizedTest
	@ValueSource(strings = { "(()(())(())", "(", ")", "(()", ")(" })
	public void testFalse(String s) {
		Assertions.assertEquals(0, solution.solution(s));
	}

}
