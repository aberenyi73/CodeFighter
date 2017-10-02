package com.ab.cf;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
	}

	/**
	 * solve this task in-place (with O(1) additional memory). You are given an n x
	 * n 2D matrix that represents an image. Rotate the image by 90 degrees
	 * (clockwise).
	 * 
	 * <pre>
	 * Example
	
			For
			
			a = [[1, 2, 3],
			     [4, 5, 6],
			     [7, 8, 9]]
			the output should be
			
			rotateImage(a) =
			    [[7, 4, 1],
			     [8, 5, 2],
			     [9, 6, 3]]
			Input/Output
			
			[time limit] 3000ms (java)
			[input] array.array.integer a
			
			Guaranteed constraints:
			1 <= a.length <= 100,
			a[i].length = a.length, 
			1 <= a[i][j] <= 104.
			
			[output] array.array.integer
	 * </pre>
	 * 
	 * The idea is to swap two index positions with each other using a temporary
	 * variable.
	 * 
	 * @param a
	 * @return
	 */
	public int[][] rotateImage(int[][] a) {
		// array dimension scaling
		int s = a.length - 1;

		// row
		for (int i = 0; i < a.length / 2; i++) { // go layer by layer from the outside in
			for (int j = 0 + i; j < s - i; j++) { // iterate inner matrix
				swap(a, i, j, j, s - i); // swap first row with last column
				swap(a, s - j, i, i, j); // swap first column with first row
				swap(a, s - i, s - j, s - j, i); // swap last row with first column
				System.out.println(String.format("\ni = %1s j = %2s", i, j));
				print(a);
			}
		}
		return a;
	}

	/**
	 * You are given an n x n 2D matrix that represents an image. Rotate the image
	 * by 90 degrees (clockwise).
	 * 
	 * <pre>
	 * Example
	
			For
			
			a = [[1, 2, 3],
			     [4, 5, 6],
			     [7, 8, 9]]
			the output should be
			
			rotateImage(a) =
			    [[7, 4, 1],
			     [8, 5, 2],
			     [9, 6, 3]]
			Input/Output
			
			[time limit] 3000ms (java)
			[input] array.array.integer a
			
			Guaranteed constraints:
			1 <= a.length <= 100,
			a[i].length = a.length, 
			1 <= a[i][j] <= 104.
			
			[output] array.array.integer
	 * </pre>
	 * 
	 * @param m
	 * @return
	 */
	public int[][] rotateMatrix(int[][] m) {
		int s = m.length - 1; // don't swap the last index

		for (int i = 0; i < m.length / 2; i++) { // go down the matrix halfway
			for (int j = 0 + i; j < s - i; j++) { // iterate from left to right from layer to end minus "s"
				int temp = m[i][j]; // swap three times to go around the clock using a temp variable
				m[i][j] = m[j][s - i];
				m[j][s - i] = temp;

				temp = m[s - j][i];
				m[s - j][i] = m[i][j];
				m[i][j] = temp;

				temp = m[s - i][s - j];
				m[s - i][s - j] = m[s - j][i];
				m[s - j][i] = temp;
			}
		}
		return m;
	}

	/**
	 * Given an array, swap two elements
	 * 
	 * @param a
	 * @param i1
	 * @param j1
	 * @param i2
	 * @param j2
	 */
	public static void swap(int[][] a, int i1, int j1, int i2, int j2) {
		int temp = a[i1][j1];
		a[i1][j1] = a[i2][j2];
		a[i2][j2] = temp;
	}

	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

}
