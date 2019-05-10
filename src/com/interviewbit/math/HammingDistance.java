package com.interviewbit.math;

import java.util.List;

/**
 * Hamming distance between two non-negative integers is defined as the number
 * of positions at which the corresponding bits are different.
 * 
 * For example,
 * 
 * HammingDistance(2, 7) = 2, as only the first and the third bit differs in the
 * binary representation of 2 (010) and 7 (111).
 * 
 * Given an array of N non-negative integers, find the sum of hamming distances
 * of all pairs of integers in the array. Return the answer modulo 1000000007.
 * 
 * @author Abhijeet
 *
 */
public class HammingDistance {

	// Brute Force approach. O(n2) complexity
	public int hammingDistance(final List<Integer> A) {
		int hd = 0, n = A.size();
		int modulo = 1000000007;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				hd = (hd + hammingDistance(A.get(i), A.get(j))) % modulo;
			}
		}

		return (hd * 2) % modulo;
	}

	// Efficient Approach. O(n) complexity.
	public int hammingDistance(final List<Integer> A, int n) {
		int ans = 0; // Initialize result

		// traverse over all bits
		for (int i = 0; i < 32; i++) {

			// count number of elements
			// with i'th bit set
			int count = 0;

			for (int j = 0; j < n; j++)
				if ((A.get(j) & (1 << i)) == 0)
					count++;

			// Add "count * (n - count) * 2"
			// to the answer
			ans += (count * (n - count) * 2);
		}

		return ans;
	}

	public int hammingDistance(int a, int b) {
		int x = a ^ b;
		int setBits = 0;

		while (x > 0) {
			setBits += x & 1;
			x >>= 1;
		}

		return setBits;
	}
}
