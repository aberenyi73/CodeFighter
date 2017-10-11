/**
 * 
 */
package com.ab.cf.array;

import java.util.Arrays;

/**
 * @author berenyia
 *
 */
public class Sudoku2 {

	public boolean sudoku2(char[][] grid) {
		char[] check = new char[9];

		Arrays.fill(check, '.');
		boolean answer = true;
		// check rows
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char g = grid[i][j];
				if (g == '.')
					continue;
				// check if our array contains this char
				if (check[g - 49] == g)
					return false;
				check[g - 49] = g; // put into array

			}
			Arrays.fill(check, '.');
		}
		Arrays.fill(check, '.');
		// check columns
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char g = grid[j][i];
				if (g == '.')
					continue;
				// check if our array contains this char
				if (check[g - 49] == g)
					return false;
				check[g - 49] = g; // put into array

			}
			Arrays.fill(check, '.');
		}

		Arrays.fill(check, '.');
		// each 9 quadrant
		for (int i = 0; i < 3; i++) { // mega row
			for (int j = 0; j < 3; j++) { // mega column

				for (int m = 0; m < 3; m++) {
					for (int n = 0; n < 3; n++) {
						char g = grid[m + 3 * i][n + 3 * j];
						if (g == '.')
							continue;
						// check if our array contains this char
						if (check[g - 49] == g)
							return false;
						check[g - 49] = g; // put into array

					}

				}
				Arrays.fill(check, '.');

			}
		}

		return answer;
	}

}
