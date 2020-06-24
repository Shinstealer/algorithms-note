package com.shinstealer.algorithmsnote.leetCode;

public class XOROperationSolution {

    public int xorOperation(int n , int start){
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= start + 2*i;
        }
        return result;

    }

    public static void main(String[] args) {
        int n = 4;
        int start = 3;

        XOROperationSolution xor = new XOROperationSolution();
        int result =  xor.xorOperation(n, start);
        System.out.println(result);
    }
    
}