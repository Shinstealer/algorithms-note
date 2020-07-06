package com.shinstealer.algorithmsnote.leetCode;

public class SubtractProductAndSum {

    //O(logn)
    //Space O(1)

    public int sol(int n) {

        int sum = 0, product = 1;
        while (n > 0) {
            sum += n % 10;
            System.out.println(sum);
            product *= n % 10;
            //System.out.println(product);
            n /= 10;
            System.out.println("value of n:"+n);
        }
        return product - sum;
    }

    public static void main(String[] args) {

        SubtractProductAndSum s = new SubtractProductAndSum();
        System.out.println(s.sol(4421));

    }

}