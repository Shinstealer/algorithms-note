package com.shinstealer.algorithmsnote.leetCode;

public class NumberOfSteps {
    int steps = 0;

    public int solution(int num) {
        if (num == 0)
            return steps;
        reduceNumber(num);
        return steps;
    }

    public void reduceNumber(int num) {
        if (num == 0)
            return;
        steps++;
        if (num % 2 == 0)
            reduceNumber(num / 2);
        else
            reduceNumber(num - 1);
    }

    

    public static void main(String[] args) {

        int num = 123;
        NumberOfSteps n = new NumberOfSteps();

        System.out.println(n.solution(num));
    }

}