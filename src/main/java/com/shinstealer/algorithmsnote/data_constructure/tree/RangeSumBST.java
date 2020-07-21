package com.shinstealer.algorithmsnote.data_constructure.tree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import java.util.TreeSet;

public class RangeSumBST {
    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
     */
    public int sol(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        } else if (root.val < L) {
            root.val = sol(root.left, L, R);
        } else if (root.val > R) {
            root.val = sol(root.left, L, R);
        }

        return root.val + sol(root.left, L, R) + sol(root.right, L, R);

    }

    public static void main(String[] args) {
        /**
         * treeSet은 null을 허용안함 
         * NullPointerException
         * TreeSet uses Red- Black tree algorithm underneath to sort out the elements. When one need to perform read/write operations frequently, then TreeSet is a good choice.
         * 저장된 데이터의 값에 따라 정렬됨. red-black tree 타입으로 값이 저장. HashSet보다 성능이 느림
         */
        TreeSet<String> tree_set = new TreeSet<>();
        tree_set.addAll(Arrays.asList("10", "5", "15", "3", "7", null, "18"));

        TreeSet<String> sub_set = new TreeSet<>();
        sub_set = (TreeSet<String>) tree_set.subSet( "7", true,  "15", true);
        
        Iterator iter = sub_set.iterator();
        int sum = 0;
        for (String i : sub_set) {
            sum += Integer.parseInt(i);
        }
        System.out.println(sum);

        HashSet<Integer> tree_hash = new HashSet<>();
        tree_hash.addAll(Arrays.asList(10, 5, 15, 3, 7, null, 18));
        HashSet<Integer> sub_hash = new HashSet<>();
        

    }

    /**
     * TreeNode
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;

        }

    }
}