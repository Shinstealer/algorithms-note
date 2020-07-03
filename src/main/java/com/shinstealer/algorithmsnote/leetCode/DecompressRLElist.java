package com.shinstealer.algorithmsnote.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRLElist {

    public int[] sol(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i +=2) {
            for (int j = 0; j < nums[i]; j++) {
                res.add(nums[i+1]);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        DecompressRLElist d = new DecompressRLElist();
        
        System.out.println(Arrays.toString(d.sol(nums)));
    }

}