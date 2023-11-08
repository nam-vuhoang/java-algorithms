package org.namvu.codility.companyP.task01;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Task01_Tests {

	public static Stream<Arguments> createTestData() {

		return Stream.of(Arguments.of(
				"admin  -wx 29 Sep 1983        833 source.h\\nadmin  r-x 23 Jun 2003     854016 blockbuster.mpeg\\nadmin  --x 02 Jul 1997        821 delete-this.py\\nadmin  -w- 15 Feb 1971      23552 library.dll\\nadmin  --x 15 May 1979  645922816 logs.zip\\njane   --x 04 Dec 2010      93184 old-photos.rar\\njane   -w- 08 Feb 1982  681574400 important.java\\nadmin  rwx 26 Dec 1952   14680064 to-do-list.txt",
				"29 Sep 1983"));

	}

	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test1(String S, String output) {
		Assertions.assertEquals(output, new Task01().solution(S));
	}

}
