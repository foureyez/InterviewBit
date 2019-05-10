package com.interviewbit.arrays;

import java.util.ArrayList;

/**
 * Rotate a 2D matrix 90 degrees clockwise.
 * 
 * @author arawat
 */
public class RotateMatrix {

	/**
	 * Transpose the matrix and then swap the last column with first, second last
	 * with second and so on...
	 */
	public void rotate(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();

		// Transpose the matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				int tmp = a.get(i).get(j);
				a.get(i).set(j, a.get(j).get(i));
				a.get(j).set(i, tmp);
			}
		}

		// Replace the columns
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {

				int tmp = a.get(i).get(j);
				a.get(i).set(j, a.get(i).get(n - j - 1));
				a.get(i).set(n - j - 1, tmp);
			}
		}
	}
}
