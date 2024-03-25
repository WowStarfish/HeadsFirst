package com.company;

public class AnswerCellSimulator {
    public static void main(String[] args) {
        AnswerCell ac = new AnswerCell();
        System.out.println(ac.answerCell(false, false, false));
        System.out.println(ac.answerCell(false, false, true));
        System.out.println(ac.answerCell(true, false, false));
        System.out.println(ac.answerCell(true, true, true));

    }
}
