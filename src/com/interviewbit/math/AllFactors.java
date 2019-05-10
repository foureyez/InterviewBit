package com.interviewbit.math;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given a number N, find all factors of N.
 * 
 * @author Abhijeet
 *
 */
public class AllFactors {

	public ArrayList<Integer> allFactors(int A) {
		ArrayList<Integer> ans = new ArrayList<>();
		int upperLimit = (int) Math.sqrt(A);

		for (int i = 1; i <= upperLimit; i++) {
			if (A % i == 0) {
				if (A / i == i) {
					ans.add(i);
				} else {
					ans.add(i);
					ans.add(A / i);
				}
			}
		}

		Collections.sort(ans);
		return ans;
	}
}
