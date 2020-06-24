package com.shinstealer.algorithmsnote.leetCode;

public class Replace {
    public String defangIPaddr(String address) {
        
        return address.replace("." , "[.]");
    }

    public static void main(String[] args) {
        String addr = "255.255.255.0";
        Replace r = new Replace();
        System.out.println(r.defangIPaddr(addr));
    }
}