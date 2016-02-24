package com.pethoalpar;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            for(int i = 1 ; i<=10 ; ++i){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1 :"+i);
            }
        }).start();
        new Thread(() -> {
            for(int i = 1 ; i<=10 ; ++i){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2 :"+i);
            }
        }).start();
    }
}
