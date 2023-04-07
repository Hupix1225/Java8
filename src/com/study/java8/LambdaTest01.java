package com.study.java8;

public class LambdaTest01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名内部类");
            }
        }).start();
        new Thread(() -> System.out.println("我是lambda")).start();
    }
}
