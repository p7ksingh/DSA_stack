package com.arr.stack;

class Node<T> {

    public T data;
    public Node<T> next; // by difult null of any reference

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

public class StackUsingLL<T> {
    // declear node reference
    private Node<T> head;
    private int size;

    // create constructor
    public StackUsingLL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T elem) {
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() throws StackEmptyException {
        // remove node , first chech if empty
        if (head == null) {
            throw new StackEmptyException();
        }
        T newNode = head.data;
        head = head.next;
        size--;
        return newNode;
    }

    public T top() throws StackEmptyException {
        if (head == null) {
            throw new StackEmptyException();
        }
        return head.data;
    }

    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> stack = new StackUsingLL<>();

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