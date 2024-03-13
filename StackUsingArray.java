package com.arr.stack;

public class StackUsingArray {

    private int[] data;
    private int topIndex;

    public StackUsingArray() {
        data = new int[10];
        topIndex = -1;
    }

    public StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    // check stack isEmpty
    public boolean isEmpty() {
        // if (topIndex == -1) {
        // return false;
        // } else {
        // return true;
        // }

        return topIndex == -1;
    }

    // check size of stack
    public int size() {
        return topIndex + 1;
    }

    // how to get top element in stack
    public int top() throws StackEmptyException {
        // first check if stack is empty
        if (topIndex == -1) {
            // StackEmptyException e = new StackEmptyException();
            // throw e;
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // How to remove top element in stack
    public int pop() throws StackEmptyException {
        // first check if stack is empty
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        // remove top element from stack
        int temp = data[topIndex];
        topIndex--;
        return temp;

    }

    // how to push element in stack on top
    public void push(int ele) throws StackFullExceptions {
        // first check if stack is full ?
        if (topIndex == data.length - 1) {
            // throw new StackFullExceptions();
            doubleCapacity();
        }
        // push element to stack
        data[++topIndex] = ele;
    }

    private void doubleCapacity() {
        System.out.println("doubleCapacity call");
        int[] temp = data;
        data = new int[2 * temp.length];
        // again put all data into data
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }
}
