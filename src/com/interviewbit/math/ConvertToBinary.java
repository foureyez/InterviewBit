package com.interviewbit.math;

/**
 * Given a number N >= 0, find its representation in binary.
 * 
 * @author Abhijeet
 *
 */
public class ConvertToBinary {
	public String findDigitsInBinary(int A) {
		StringBuilder sb = new StringBuilder();
		while (A != 0) {
			int rem = A % 2;
			sb.append(rem);
			A = A / 2;
		}
		sb.append(1);
		sb.reverse();

		return sb.toString();
	}
}
