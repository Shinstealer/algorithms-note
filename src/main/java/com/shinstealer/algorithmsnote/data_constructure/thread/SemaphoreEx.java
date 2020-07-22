package com.shinstealer.algorithmsnote.data_constructure.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    static int count = 0;

    /**
     * MyThread
     */
    public static class MyThread extends Thread {
        Semaphore semaphore;
        String threadName;

        public MyThread(Semaphore semaphore, String threadName) {
            super(threadName);
            this.semaphore = semaphore;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            if (this.getName().equals("A")) {
                System.out.println("starting" + threadName);

                try {
                    // First, get a permit.
                    System.out.println(threadName + " is waiting for a permit.");
                    semaphore.acquire();

                    System.out.println(threadName + " gets a permit");

                    for (int i = 0; i < 5; i++) {
                        SemaphoreEx.count++;
                        System.out.println(threadName + ":" + SemaphoreEx.count);

                        Thread.sleep(10);

                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(threadName + " releases the permit."); 
                semaphore.release(); 

            } else {
                System.out.println("starting" + threadName);

                try {
                    // First, get a permit.
                    System.out.println(threadName + " is waiting for a permit.");
                    semaphore.acquire();

                    System.out.println(threadName + " gets a permit");

                    for (int i = 0; i < 5; i++) {
                        SemaphoreEx.count--;
                        System.out.println(threadName + ":" + SemaphoreEx.count);

                        Thread.sleep(10);

                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(threadName + " releases the permit."); 
                semaphore.release(); 

            }
            
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);

        MyThread mt1 = new MyThread(semaphore, "A");
        MyThread mt2 = new MyThread(semaphore, "B");

        mt1.start();
        mt2.start();

        mt1.join();
        mt2.join();

        System.out.println("count : " + SemaphoreEx.count);
    }
}