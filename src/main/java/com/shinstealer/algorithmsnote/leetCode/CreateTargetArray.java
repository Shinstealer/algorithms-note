package com.shinstealer.algorithmsnote.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {

    public int[] sol(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        CreateTargetArray ca = new CreateTargetArray();
        int[] result = ca.sol(nums, index);
        System.out.println(Arrays.toString(result));
    }

}