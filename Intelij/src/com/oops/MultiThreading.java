package com.oops;

class Book implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Book " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Person implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Person reading " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}


public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Books " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t2 = new Thread(person);
        t1.setName("Books");
        t1.start();
        t2.start();
        t1.join();
        t2.setName("Suren");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("I am main thread Finished everything " + t1.getName() + " " + t2.getName());

    }
}
