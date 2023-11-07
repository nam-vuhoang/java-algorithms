package org.vunam.codility.lesson07_StacksAndQueues;

import java.util.Stack;

/**
 * [EASY] StoneWall
 *
 * Cover "Manhattan skyline" using the minimum number of rectangles.
 *
 * You are going to build a stone wall. The wall should be straight and N meters
 * long, and its thickness should be constant; however, it should have different
 * heights in different places. The height of the wall is specified by an array
 * H of N positive integers. H[I] is the height of the wall from I to I+1 meters
 * to the right of its left end. In particular, H[0] is the height of the wall's
 * left end and H[N−1] is the height of the wall's right end.
 *
 * The wall should be built of cuboid stone blocks (that is, all sides of such
 * blocks are rectangular). Your task is to compute the minimum number of blocks
 * needed to build the wall.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] H); }
 *
 * that, given an array H of N positive integers specifying the height of the
 * wall, returns the minimum number of blocks needed to build it.
 *
 * For example, given array H containing N = 9 integers:
 *
 * H[0] = 8 H[1] = 8 H[2] = 5 H[3] = 7 H[4] = 9 H[5] = 8 H[6] = 7 H[7] = 4 H[8]
 * = 8 the function should return 7. The figure shows one possible arrangement
 * of seven blocks.
 *
 *
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000]; each element of array H is an
 * integer within the range [1..1,000,000,000].
 *
 * @see https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
 */
class L07_04_StoneWall {

	/**
	 * Detected time complexity: O(N)
	 *
	 * @param H
	 * @return
	 */
	public int solution(int[] H) {
		Stack<Integer> stack = new Stack<>();
		int lastHeight = 0;
		int blockCount = 0;

		for (int height : H) {
			while (lastHeight > height) {
				stack.pop();
				lastHeight = stack.isEmpty() ? 0 : stack.peek();
			}

			if (height > lastHeight) { // start a new block
				lastHeight = height;
				stack.push(lastHeight);
				blockCount++;
			}
		}

		return blockCount;
	}

}
