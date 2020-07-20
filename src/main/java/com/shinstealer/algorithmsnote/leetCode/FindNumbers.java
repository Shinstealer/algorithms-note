package com.shinstealer.algorithmsnote.leetCode;

import java.util.Arrays;

public class FindNumbers {
    public int sol(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Integer.toString(nums[i]).length() % 2 == 0) {//String은 length()함수를 통해서 글자 수를 아웃풋 가능!
                res++;
            }
        }
        //Arrays.stream(nums).map(i -> 1- Integer.toString(nums[i]).length() %2).sum();
        return  res;

    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        FindNumbers f = new FindNumbers();
        System.out.println(f.sol(nums));
    }

}