package com.interviewbit.math;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * 
 * @author arawat
 */
public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int col = 0;

        for (int i = 0; i < A.length(); i++) {
            char curr = A.charAt(i);
            col = 26 * col + (int) curr - 64;
        }

        return col;
    }
}
