package com.arr.stack;

public class StackUse {

    public static void main(String[] args) throws StackFullExceptions, StackEmptyException {

        // StackUsingArray stack = new StackUsingArray();
        StackUsingArray stack = new StackUsingArray(2);
        // stack.data[0] = 10;
        // stack.push(10);
        // stack.top();
        // stack.pop();
        // System.out.println(stack.size());
        // System.out.println(stack.isEmpty());
        int[] arr = { 5, 3, 7, 9, 1, 3 };
        // push element one by one in stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        // remove element one by one in stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

        }
    }
}
