package com.interviewbit.math;

/**
 * Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.
 * 
 * @author arawat
 */
public class TwoIntPower {
    public int isPower(int A) {
        if (A == 1)
            return 1;

        for (int i = 2; i <= A / 2; i++) {
            if (checkPower(i, A)) {
                return 1;
            }
        }
        return 0;
    }

    public boolean checkPower(int i, int A) {
        while (A > 1) {
            if (A % i != 0) {
                return false;
            }
            A = A / i;
        }
        return true;
    }
}
