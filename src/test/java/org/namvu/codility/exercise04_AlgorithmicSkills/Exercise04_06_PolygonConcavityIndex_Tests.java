package org.namvu.codility.exercise04_AlgorithmicSkills;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.namvu.codility.exercise04_AlgorithmicSkills.Exercise04_06_PolygonConcavityIndex.Point2D;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise04_06_PolygonConcavityIndex_Tests {

	public static Stream<Arguments> createTestData() {

		int max = 1000000000;

		return Stream.of(
				Arguments.of(new int[] {-1, 3, 1, 2, 3, 1, 0, -1, -2, 1}, new int[] {-1}),
				Arguments.of(new int[] {-1, 3, 1, 2, 1, 1, 3, 1, 0, -1, -2, 1, -1, 2}, new int[]{2, 6}), // 2 or 6
				Arguments.of(new int[] {-1, 2, -1, 3, 1, 2, 1, 1, 3, 1, 0, -1, -2, 1}, new int[] {0, 3}), // 0 or 3
				Arguments.of(new int[] {-1, 3, 1, 2, 3, 1, 0, -1, -2, 1, -1, 2}, new int[] {5}),
				Arguments.of(new int[] {-1, 2, -1, 3, 1, 2, 3, 1, 0, -1, -2, 1}, new int[] {0}),
				Arguments.of(new int[] {max, max, max, -max, -max, -max, -max, max}, new int[] {-1}),
//				Arguments.of(new int[] {max, max, max, -max, max, max, -max, max}, 2),
				Arguments.of(new int[] {max, max, max, -max, -max, -max}, new int[] {-1})
		);

	}


	@ParameterizedTest
	@MethodSource(value = "createTestData")
	public void test(int[] a, int[] expected) {
		Point2D[] points = new Point2D[a.length / 2];
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point2D();
			points[i].x = a[2 * i];
			points[i].y = a[2 * i + 1];
		}

		int actual = new Exercise04_06_PolygonConcavityIndex().solution(points);
//		Assertions.assertTrue(Arrays.binarySearch(expected, actual) >= 0);
		Assertions.assertEquals(expected[0], actual);
	}

	@Test
	public void test2() {
		long max = 1000000000L;
		System.out.println(max * max * 8);
		System.out.println(max * max * 16);
	}

}
