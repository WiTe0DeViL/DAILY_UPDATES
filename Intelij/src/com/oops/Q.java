package com.oops;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q {
    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        System.out.println(q);
//        reverse(q);
        ArrayQ arr = new ArrayQ();
//        arr.enqueue(1);
        arr.enqueue(2);
        arr.enqueue(3);
        arr.enqueue(4);
        arr.enqueue(5);
        System.out.println(arr);
        System.out.println(arr.dequeue());
    }

    public static void reverse(Queue<Integer> q) {
//        System.out.println(q.remove());
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < q.size(); i++)
            s.add(q.remove());

        q.addAll(s);
        System.out.println(q);
    }
}
