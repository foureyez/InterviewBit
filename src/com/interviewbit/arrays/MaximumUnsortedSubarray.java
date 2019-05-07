package com.interviewbit.arrays;

import java.util.ArrayList;

/**
 * You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.
 * Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.
 * If A is already sorted, output -1.
 * 
 * @author arawat
 */
public class MaximumUnsortedSubarray {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int n = A.size(), start = 0, end = n - 1;
        int[] max = new int[n];
        int[] min = new int[n];

        max[0] = A.get(0);
        for (int i = 01; i < n; i++) {
            max[i] = Math.max(max[i - 1], A.get(i));
        }

        min[n - 1] = A.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], A.get(i));
        }

        while (start < n && min[start] == A.get(start))
            start++;
        while (end >= 0 && max[end] == A.get(end))
            end--;

        ArrayList<Integer> sol = new ArrayList<>();
        if (start == n) {
            sol.add(-1);
        } else {
            sol.add(start);
            sol.add(end);
        }
        return sol;
    }
}
