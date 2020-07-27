package com.shinstealer.algorithmsnote.leetCode;

public class BalancedStringSplit {
    public int sol(String s) {
        int res = 0;
        int bal = 0;

        for (int i = 0; i < s.length(); ++i) {
            
            bal += s.charAt(i) == 'L' ? 1 : -1;
            if (bal ==0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BalancedStringSplit b = new BalancedStringSplit();
        String s = "LLLLRRRR";
        System.out.println(b.sol(s));
    }
}
