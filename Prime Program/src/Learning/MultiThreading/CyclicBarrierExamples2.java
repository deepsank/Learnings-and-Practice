package Learning.MultiThreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExamples2 {
    public static void main(String[] args) {
        int numberOfSubSystems = 4;
        CyclicBarrier barrier = new CyclicBarrier(numberOfSubSystems, new Runnable() {
            // This callback action(barrier action) executes when all threads trip the barrier
            @Override
            public void run() {
                System.out.println("All the subsystems are up and running. System startup completed.");
            }
        });
        Thread databaseThread = new Thread(new SubSystem(4000,"Database",barrier ));
        Thread webServerThread = new Thread(new SubSystem(2000,"Web Server",barrier ));
        Thread cacheThread = new Thread(new SubSystem(3000,"Cache",barrier ));
        Thread messagingServiceThread = new Thread(new SubSystem(2000,"Messaging Service",barrier ));
        databaseThread.start();
        webServerThread.start();
        cacheThread.start();
        messagingServiceThread.start();
    }
}
class SubSystem implements Runnable{
    private int initializationTime;
    private String name;
    private CyclicBarrier barrier;
    public SubSystem(int initializationTime, String name, CyclicBarrier barrier) {
        this.initializationTime = initializationTime;   this.name = name;   this.barrier = barrier;
    }
    @Override
    public void run() {
        try {
            System.out.println(name+" starting initializtion...");
            Thread.sleep(initializationTime);
            System.out.println(name+" initialization done...");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
