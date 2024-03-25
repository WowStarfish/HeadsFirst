package com.company;

public class CountEvensSimulator {
    public static void main(String[] args) {
        CountEvens ce = new CountEvens();
        int[] evens1 = {2, 1, 2, 3, 4};
        int[] evens2 = {2, 2, 0};
        int[] evens3 = {1,3,5};
        System.out.println(ce.countEvens(evens1));
        System.out.println(ce.countEvens(evens2));
        System.out.println(ce.countEvens(evens3));
    }
}
