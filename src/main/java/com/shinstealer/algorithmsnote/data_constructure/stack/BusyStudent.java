package com.shinstealer.algorithmsnote.data_constructure.stack;

import java.util.stream.IntStream;

public class BusyStudent {
    public int solution (int[] startTime , int[] endTime, int queryTime){

        
        // int result = 0;

        // for (int i = 0; i < endTime.length; i++) {
        //     if (startTime[i] <= queryTime && endTime[i] >=queryTime ) {
        //         result += 1;
        //     }
        // }

        // return result;

        return (int) IntStream.range(0, startTime.length)
                .filter(i -> startTime[i] <= queryTime && endTime[i] >= queryTime).count();

    }

    public static void main(String[] args) {

        int[] startTime = {4};
        int[] endTime = {4};
        // int[] startTime = {9,8,7,6,5,4,3,2,1};
        // int[] endTime = {10,10,10,10,10,10,10,10,10};
        int queryTime = 5;

        BusyStudent s = new BusyStudent();
        System.out.println(s.solution(startTime, endTime, queryTime));
    }
    
}