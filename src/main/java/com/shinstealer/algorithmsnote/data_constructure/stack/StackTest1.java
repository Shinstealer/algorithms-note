package com.shinstealer.algorithmsnote.data_constructure.stack;

import java.util.Arrays;
import java.util.Stack;

public class StackTest1 {
    public static void main(String[] args) {
        //Study stack
        Stack<Object> stack = new Stack<>();
        int[] arr = {10,20,30,40,50};

        System.out.println(stack.empty()); //True or False

        System.out.println("----------------------------------------------");

        Arrays.stream(arr).forEach(e -> System.out.println(stack.push(e)));

        System.out.println("----------------------------------------------");
        stack.push(7);
        System.out.println(stack); // 10,20,30,40,50,7
        System.out.println("----------------------------------------------");
        stack.pop();
        System.out.println(stack);//pop 7 out

        System.out.println("----------------------------------------------");

        System.out.println("current top is : " +stack.peek()); //top is 50

        System.out.println("----------------------------------------------");

        // 스택에 해당 값이 있는지 확인하고 없으면 -1, 있으면 해당하는 인덱스 값 반환(맨 위부터 1)
        System.out.println("Search(30) index is :" + stack.search(30)); // search element in stack

        System.out.println("----------------------------------------------");

        while (!stack.empty()) {
            // LIFO
            // pop out all elements in stack
            System.out.println(stack.pop());
            
        }
    }
}