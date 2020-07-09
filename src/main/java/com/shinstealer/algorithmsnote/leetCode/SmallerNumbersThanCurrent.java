package com.shinstealer.algorithmsnote.leetCode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public int[] sol(int[] nums){
        int[] count = new int[101];
        int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++; //times
        }
        
        for (int i = 1 ; i <= 100; i++) {
            count[i] = count[i]+ count[i-1]; //greater than   //2 = 2 +1 3= 1+ 3 4 = 0 + 4
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1]; //0 =  4 1 =0 2= 1
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] num = {8,1,2,2,3};
        int[] nums = {8,1,2,2,3};
        SmallerNumbersThanCurrent s = new SmallerNumbersThanCurrent();
        int[] result = s.sol(num);
        System.out.println(Arrays.toString(result));

        int[] count = new int[101];
        //int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        System.out.println(count[8]);
        
    }
    
}