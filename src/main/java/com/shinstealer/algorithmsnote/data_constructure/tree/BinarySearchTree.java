package com.shinstealer.algorithmsnote.data_constructure.tree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    /**
     * Time Complexity: The worst case time complexity of delete operation is O(h)
     * where h is height of Binary Search Tree. In worst case, we may have to travel
     * from root to the deepest leaf node. The height of a skewed tree may become n
     * and the time complexity of delete operation may become O(n)
     * 
     * @param key
     */
    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);

            System.out.println("root left val:" + root.key);

        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
            System.out.println("root right val:" + root.key);
        }
        return root;
    }

    /* A recursive function to insert a new key in BST */
    private Node deleteRec(Node root, int key) {
        /* Base Case: If the tree is empty */
        if (root == null) {
            return root;
        }
        /* Otherwise, recur down the tree */
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int min = root.key;
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }

    /**
     * TreeNode
     */
    public class Node {
        int key;
        Node left; // 동적객체 생성 =C로 말하면 포인터
        Node right;

        public Node(int insertItem) {
            this.key = insertItem;
            this.left = this.right = null;
        }

    }
}