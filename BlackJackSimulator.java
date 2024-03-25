package com.company;

public class BlackJackSimulator {
    public static void main(String[] args) {
        BlackJack bj = new BlackJack();
        System.out.println(bj.blackjack(19, 21));
        System.out.println(bj.blackjack(21, 19));
        System.out.println(bj.blackjack(19, 22));
    }
}
