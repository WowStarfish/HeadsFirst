package com.company;

public class CloseFarSimulator {
    public static void main(String[] args) {
        CloseFar cf = new CloseFar();
        System.out.println(cf.closeFar(1, 2, 10) );
        System.out.println(cf.closeFar(1, 2, 3));
        System.out.println(cf.closeFar(4, 1, 3));
        System.out.println(cf.closeFar(4, 5, 3));
        System.out.println(cf.closeFar(4, 3, 5));
        System.out.println(cf.closeFar(8, 9, 7));
    }
}