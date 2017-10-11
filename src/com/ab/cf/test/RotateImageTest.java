/**
 * 
 */
package com.ab.cf.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ab.cf.array.RotateImage;

/**
 * @author berenyia
 *
 */
public class RotateImageTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.ab.cf.array.RotateImage#rotateImage(int[][])}.
	 */
	@Test
	public void testRotateImage1() {

		RotateImage ri = new RotateImage();
		System.out.println("\noriginal:");

		RotateImage.print(INPUT1);

		System.out.println("\nRotating ...");
		ri.rotateImage(INPUT1);

		System.out.println("\nexpected:");
		RotateImage.print(EXPECTED1);
		System.out.println("\nactual:");
		RotateImage.print(INPUT1);

		Assert.assertArrayEquals(INPUT1, EXPECTED1);
	}

	/**
	 * Test method for {@link com.ab.cf.array.RotateImage#rotateImage(int[][])}.
	 */
	@Test
	public void testRotateImage2() {

		RotateImage ri = new RotateImage();
		System.out.println("\noriginal:");

		RotateImage.print(INPUT2);

		System.out.println("\nRotating ...");
		ri.rotateImage(INPUT2);

		System.out.println("\nexpected:");
		RotateImage.print(EXPECTED2);
		System.out.println("\nactual:");
		RotateImage.print(INPUT2);

		Assert.assertArrayEquals(INPUT2, EXPECTED2);
	}

	/**
	 * Test method for {@link com.ab.cf.array.RotateImage#rotateImage(int[][])}.
	 */
	@Test
	public void testRotateImage3() {

		RotateImage ri = new RotateImage();
		System.out.println("\noriginal:");

		RotateImage.print(INPUT3);

		System.out.println("\nRotating ...");
		ri.rotateImage(INPUT3);

		System.out.println("\nexpected:");
		RotateImage.print(EXPECTED3);
		System.out.println("\nactual:");
		RotateImage.print(INPUT3);

		Assert.assertArrayEquals(INPUT3, EXPECTED3);
	}

	/**
	 * Test method for {@link com.ab.cf.array.RotateImage#rotateImage(int[][])}.
	 */
	@Test
	public void testRotateImage4() {

		RotateImage ri = new RotateImage();
		System.out.println("\noriginal:");

		RotateImage.print(INPUT4);

		System.out.println("\nRotating ...");
		ri.rotateImage(INPUT4);

		System.out.println("\nexpected:");
		RotateImage.print(EXPECTED4);
		System.out.println("\nactual:");
		RotateImage.print(INPUT4);

		Assert.assertArrayEquals(INPUT4, EXPECTED4);
	}

	/**
	 * Test method for {@link com.ab.cf.array.RotateImage#rotateImage(int[][])}.
	 */
	@Test
	public void testRotateImage5() {

		RotateImage ri = new RotateImage();
		System.out.println("\noriginal:");

		RotateImage.print(INPUT5);

		System.out.println("\nRotating ...");
		ri.rotateImage(INPUT5);

		System.out.println("\nexpected:");
		RotateImage.print(EXPECTED5);
		System.out.println("\nactual:");
		RotateImage.print(INPUT5);

		Assert.assertArrayEquals(INPUT5, EXPECTED5);
	}

	/**
	 * Test method for {@link com.ab.cf.array.RotateImage#rotateImage(int[][])}.
	 */
	public void testRotateImage() {

		for (int i = 0; i < INPUTS.length; i++) {
			System.out.println("--------------------------------------------");
			System.out.println(String.format("\nTesting %1s array rotation", i + 1));

			RotateImage ri = new RotateImage();
			System.out.println("\noriginal:");

			RotateImage.print(INPUTS[i]);

			System.out.println("\nRotating ...");
			ri.rotateImage(INPUTS[i]);

			System.out.println("\nexpected:");
			RotateImage.print(EXPECTED[i]);
			System.out.println("\nactual:");
			RotateImage.print(INPUTS[i]);

			Assert.assertArrayEquals(INPUTS[i], EXPECTED[i]);

			System.out.println("Pass");
		}
	}

	/**
	 * Test swapping two elements of a 2D array.
	 */
	@Test
	public void testSwap() {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		RotateImage.swap(a, 0, 1, 1, 2);
		int[][] exp = { { 1, 6, 3 }, { 4, 5, 2 }, { 7, 8, 9 } };
		Assert.assertArrayEquals(exp, a);
	}

	@Test
	public void intDiv() {
		int i = 5 / 2;
		Assert.assertEquals(2, i);
	}

	static int[][] INPUT1 = { { 1 } };
	static int[][] INPUT2 = { { 1, 2 }, { 3, 4 } };
	static int[][] INPUT3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	static int[][] INPUT4 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
	static int[][] INPUT5 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 } };

	static int[][] EXPECTED1 = { { 1 } };
	static int[][] EXPECTED2 = { { 3, 1 }, { 4, 2 } };
	static int[][] EXPECTED3 = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
	static int[][] EXPECTED4 = { { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };
	static int[][] EXPECTED5 = { { 21, 16, 11, 6, 1 }, { 22, 17, 12, 7, 2 }, { 23, 18, 13, 8, 3 }, { 24, 19, 14, 9, 4 },
			{ 25, 20, 15, 10, 5 } };

	static int[][][] INPUTS = { INPUT1, INPUT2, INPUT3, INPUT4, INPUT5 };
	static int[][][] EXPECTED = { EXPECTED1, EXPECTED2, EXPECTED3, EXPECTED4, EXPECTED5 };

}
