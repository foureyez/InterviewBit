package com.interviewbit.arrays;

import java.util.ArrayList;

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * 
 * @author arawat
 */
public class SpiralMatrix {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();

        // Initialize the array
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int j = 0; j < A; j++) {
                a.add(0);
            }
            sol.add(a);
        }

        int rFirst = 0, rLast = A - 1, cFirst = 0, cLast = A - 1;
        int k = 1;
        while (rFirst <= rLast && cFirst <= cLast) {

            // Right Direction
            for (int i = cFirst; i <= cLast; i++) {
                sol.get(rFirst).set(i, k++);
            }
            rFirst++;

            // Down Direction
            for (int i = rFirst; i <= rLast; i++) {
                sol.get(i).set(cLast, k++);
            }
            cLast--;

            // Left Direction
            if (rFirst <= rLast) {
                for (int i = cLast; i >= cFirst; i--) {
                    sol.get(rLast).set(i, k++);
                }
                rLast--;
            }

            // Up Direction
            if (cFirst <= cLast) {
                for (int i = rLast; i >= rFirst; i--) {
                    sol.get(i).set(cFirst, k++);
                }
                cFirst++;
            }
        }

        return sol;
    }
}
