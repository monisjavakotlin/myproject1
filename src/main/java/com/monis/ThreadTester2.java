package com.monis;

public class ThreadTester2 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println(i);
                }
            }
        };
        thread.start();
    }
}
