package com.interviewbit.math;

import java.util.ArrayList;

/**
 * Given an even number ( greater than 2 ), return two prime numbers whose sum
 * will be equal to given number.
 * 
 * NOTE A solution will always exist. read Goldbach’s conjecture
 * 
 * If there are more than one solutions possible, return the lexicographically
 * smaller solution.
 * 
 * If [a, b] is one solution with a <= b, and [c,d] is another solution with c
 * <= d, then
 * 
 * [a, b] < [c, d]
 * 
 * If a < c OR a==c AND b < d.
 * 
 * @author Abhijeet
 *
 */
public class PrimeSum {
	public ArrayList<Integer> primesum(int A) {
		ArrayList<Integer> sol = new ArrayList<>();

		for (int i = 2; i < A; i++) {
			if (isPrime(i) && isPrime(A - i)) {
				sol.add(i);
				sol.add(A - i);

				break;
			}
		}
		return sol;
	}

	public boolean isPrime(int A) {
		if (A == 0 || A == 1)
			return false;

		int upper = (int) Math.sqrt(A);
		for (int i = 2; i <= upper; i++) {
			if (A % i == 0)
				return false;
		}
		return true;
	}
}
