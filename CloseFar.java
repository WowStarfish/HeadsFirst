package com.company;

public class CloseFar {
    /**
     * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
     * while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num)
     * computes the absolute value of a number.
     * closeFar(1, 2, 10) → true
     * closeFar(1, 2, 3) → false
     * closeFar(4, 1, 3) → true
     * closeFar(4, 5, 3) → false
     * closeFar(4, 3, 5) → false
     * closeFar(8, 9, 7) → false
     */

    public boolean closeFar(int a, int b, int c) {
        if ((a - b >= 0 && a - b <= 1)|| (b - a >= 0 && b - a <= 1 )){
            if ((a - c >= 2 || c - a >= 2) && (b - c >= 2 || c - b >= 2)){
                return true;
            }
            return false;
        }
        if ((c - a >= 0 && c - a <= 1) || (a - c >= 0 && a - c <= 1 )){
            if ((b - a >= 2 || a - b >= 2) && (b - c >= 2 || c - b >= 2)) {
                return true;
            }
            return false;
        }

        return false;
    }
}
