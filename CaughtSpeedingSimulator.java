package com.company;

public class CaughtSpeedingSimulator {
    public static void main(String[] args) {
        CaughtSpeeding cs = new CaughtSpeeding();
        System.out.println(cs.caughtSpeeding(60, false));
        System.out.println(cs.caughtSpeeding(65, false));
        System.out.println(cs.caughtSpeeding(65, true));
    }
}
