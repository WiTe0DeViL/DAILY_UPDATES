package com.oops;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayQ {
    static int front;
    static int rear;
    static int size;
    static final int[] arr = new int[5];

    public void enqueue(int val) {
        if (arr.length == size) {
            throw new StackOverflowError();
        }
        arr[rear++] = val;
        size++;
    }

    public int dequeue() {
        if (size == 0)
            throw new EmptyStackException();
        size--;
        return arr[front++];

    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
