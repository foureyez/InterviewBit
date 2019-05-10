package com.interviewbit.math;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * https://www.interviewbit.com/problems/excel-column-title/
 * 
 * @author arawat
 */
public class ExcelColumnName {

    public String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while (A > 0) {
            int rem = A % 26;
            if (rem == 0) {
                sb.append((char) (26 + 64));
                A = A / 26 - 1;
            } else {
                sb.append((char) (rem + 64));
                A = A / 26;
            }
        }

        return sb.reverse().toString();
    }
}
