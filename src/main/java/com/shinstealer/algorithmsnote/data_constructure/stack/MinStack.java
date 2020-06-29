package com.shinstealer.algorithmsnote.data_constructure.stack;


public class MinStack {
    // Stack<Integer> min = new Stack<>();
    // Stack<Integer> stack = new Stack<>();
    private Node head;

    //정석 풀이
    public class Node {
        private int val;
        private int min;
        Node next;

        public Node(int val, int min, Node next) {
            //question : why use self instance variable in ctx
            this.val = val;
            this.min = min;
            this.next = next;
        }

    }

    public void push(int x) {
        // stack.push(x);
        // if (min.isEmpty() || min.peek() >= x) {
        // min.push(x);
        // }

        if (head == null) {
            head = new Node(x, x, null);
        } else {
            head = new Node(x, Math.min(x, head.min), head);
        }

    }

    public void pop() {
        // if (stack.pop().equals(min.peek())) {
        // min.pop();
        // }
        head = head.next;
    }

    public int top() {

        // return stack.peek();
        return head.val;
    }

    public int getMin() {

        // return min.peek();
        return head.min;
    }

    public static void main(final String[] args) {
        final MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }

}