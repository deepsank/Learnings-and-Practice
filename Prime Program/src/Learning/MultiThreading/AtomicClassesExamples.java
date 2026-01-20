package Learning.MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassesExamples {
//    private int counter;
    private AtomicInteger counter = new AtomicInteger(0);
    public void increment(){
        counter.getAndIncrement();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) {
        AtomicClassesExamples sharedResource = new AtomicClassesExamples();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sharedResource.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sharedResource.increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(sharedResource.getCounter());
    }
}
