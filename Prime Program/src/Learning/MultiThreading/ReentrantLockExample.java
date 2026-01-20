package Learning.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Outer Method...");
            innerMethod();
        }
        finally {
            lock.unlock();
        }
    }
    public void innerMethod(){
        lock.lock();  // Same thread will try to again acquire lock,
        // so will wait for itself to release lock, which will lead to deadlock---
        // This DeadLock is prevented by using ReentrantLock which allows the same thread to lock/unlock
        // multiple times maintaning a counter of how many times the lock is acquired by same thread
        try {
            System.out.println(Thread.currentThread().getName()+" Inner Method...");
        }
        finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        ReentrantLockExample object = new ReentrantLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                object.outerMethod();
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");

        t1.start();
        t2.start();

    }
}
