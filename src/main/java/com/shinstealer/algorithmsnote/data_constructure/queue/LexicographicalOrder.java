package com.shinstealer.algorithmsnote.data_constructure.queue;

import java.util.Arrays;

public class LexicographicalOrder {
    public static void main(String[] args) {//bubble sort
        String[] words = { "Peach", "Orange", "Mango", "Cherry", "Apple" };
        //오름 차순
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
            
        }
        Arrays.stream(words).forEach(i-> System.out.println(i));
    }
    
}