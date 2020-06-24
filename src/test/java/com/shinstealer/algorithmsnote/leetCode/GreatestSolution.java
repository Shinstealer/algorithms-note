package com.shinstealer.algorithmsnote.leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreatestSolution {

    public List<Boolean> candy(int[] c , int e ){
        // List<Boolean> res = new ArrayList<>();
        // int max = 0;

        // for (int i = 0; i < c.length; i++) {
        //     max = Math.max(c[i], max);
        // }
        // for (int i = 0; i < c.length; i++) {
            
        //     res.add(c[i] + e >= max);
        // }

        int max = Arrays.stream(c).max().getAsInt();
        return Arrays.stream(c).mapToObj(candy -> candy + e >= max ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] c= {2,3,5,1,3};
        int e= 3;

        GreatestSolution s = new GreatestSolution();
        

        System.out.println(s.candy(c, e));
    }
    
}