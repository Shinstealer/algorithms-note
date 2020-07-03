package com.shinstealer.algorithmsnote.data_constructure.queue;

import java.util.Arrays;

public class OrderlyQ {

    /**
     * If K == 1, we can only rotate the whole string. There are S.length different
     * states and we return the lexicographically smallest string. If K > 1, it
     * means we can:
     * 
     * rotate the whole string, rotate the whole string except the first letter.
     * 012345 -> 023451 -> 034512 -> 045123 -> 051234 We can rotate i+1th big letter
     * to the start (method 1), then rotate ith big letter to the end (method 2).
     * 2XXX01 -> XXX012
     * 
     * In this way, we can bubble sort the whole string lexicographically. So just
     * return sorted string.
     */
    public String sol(String s, int k) {

        if (k > 1) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }
        String res = s;
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i) + s.substring(0, i);
            System.out.println(i + "temp:" + temp);
            if (res.compareTo(temp) > 0) {
                res = temp;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String s = "bac";
        int k = 1;
        OrderlyQ q = new OrderlyQ();
        System.out.println(q.sol(s, k));
    }

}