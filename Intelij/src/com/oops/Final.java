package com.oops;

public class Final extends Static_Final {
    public static void main(String[] args) {
    }
}

class Static_Final {
    public static int a = 100;

    void add() {
        a += a + a;
    }
}