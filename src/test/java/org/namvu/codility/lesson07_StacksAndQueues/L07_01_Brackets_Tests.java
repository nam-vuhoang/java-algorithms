package org.namvu.codility.lesson07_StacksAndQueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class L07_01_Brackets_Tests {

	@ParameterizedTest
	@ValueSource(strings = {"{[()()]}", "", "{[()()]}{[()()]}"})
	public void testTrue(String s) {
		Assertions.assertEquals(1, new L07_01_Brackets().solution(s));
	}

	@ParameterizedTest
	@ValueSource(strings = {"([)()]", "{{{{"})
	public void testFalse(String s) {
		Assertions.assertEquals(0, new L07_01_Brackets().solution(s));
	}


}
