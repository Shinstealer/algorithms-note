package com.shinstealer.algorithmsnote.data_constructure.queue;

import java.util.Arrays;

public class SumEvenAfterQueries {

    //Time: O(max(m, n)), space: O(n), where m = A.length, n = queries.length.
    public int[] sol(int[] A, int[][] queries) {
        int sumEven = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                sumEven += a;
            }
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < res.length; i++) {
            int value = queries[i][0];
            int index = queries[i][1];
            if (A[index] % 2 == 0) { // A[index] even
                if (value % 2 == 0) {
                    sumEven += value; // even value
                } else {
                    sumEven -= A[index]; // odd value
                }
            } else { // A[index] odd
                if (value % 2 == 0) { // even value
                } else {
                    sumEven += A[index] + value;// odd value
                }
            }
            res[i] = sumEven;
            A[index] += value;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4 };
        // 2차원 배열 사용 법
        // 배열 길이 4
        // 배열 0,1
        int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
        int value = queries[1][0];
        System.out.println(queries.length);
        SumEvenAfterQueries s = new SumEvenAfterQueries();

        System.out.println(Arrays.toString(s.sol(A, queries)));
        System.out.println(value);
    }

}