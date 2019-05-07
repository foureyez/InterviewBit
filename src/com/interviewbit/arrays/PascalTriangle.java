package com.interviewbit.arrays;

import java.util.ArrayList;

public class PascalTriangle {

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                int value = (j == 0 || j == i) ? 1 : (i - 1) >= 0 ? sol.get(i - 1).get(j - 1) + sol.get(i - 1).get(j) : 1;
                arr.add(value);
            }

            sol.add(arr);
        }

        return sol;
    }
}
