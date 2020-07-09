package com.shinstealer.algorithmsnote.leetCode;

import java.math.BigInteger;

public class ToHex {

    public static void main(String[] args) {
        String hex = String.format("%04x", new BigInteger(1,"text".getBytes()));

        String shardId = "shardId-" + String.format("%010d", 2);

        System.out.println(hex);

        System.out.println(shardId);
    }
    
}