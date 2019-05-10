package com.interviewbit.math;

import java.util.ArrayList;

/**
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
 * 
 * @author arawat
 */
public class RearrangeArray {

    /**
     * 1) Increase every Array element Arr[i] by (Arr[Arr[i]] % n)*n.
     * 2) Divide every element by N.
     * Given a number as
     * A = B + C * N if ( B, C < N )
     * A % N = B
     * A / N = C
     */
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n; i++) {
            int curr = a.get(i);
            a.set(i, curr + (a.get(curr) % n) * n);
        }

        for (int i = 0; i < n; i++) {
            int curr = a.get(i);
            a.set(i, curr / n);
        }
    }
}
