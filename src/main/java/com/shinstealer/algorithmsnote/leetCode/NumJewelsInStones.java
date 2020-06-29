package com.shinstealer.algorithmsnote.leetCode;

import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {
    //time O(2n)
    //space O(n)
    public int solution(String j, String s) {

        int result = 0;
        if (j == null || j.length() == 0 || s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        for (char c1 : j.toCharArray()) {
            set.add(c1);
        }
        for (char c2 : s.toCharArray()) {
            if (set.contains(c2)) {
                result ++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String j = "z";
        String s = "ZZ";

        String t = "test";
        NumJewelsInStones n = new NumJewelsInStones();

        System.out.println(n.solution(j, s));
        Set<Character> set = new HashSet<>();//distinct 
        
        for (char c : t.toCharArray()) {
            set.add(c);
        }
        System.out.println(set);
        

        
    }

}