package Learning.MultiThreading;

import java.util.concurrent.*;

public class CyclicBarrierExamples {
    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CyclicBarrier barrier = new CyclicBarrier(3);
        executor.submit(new DependentService2(barrier));
        executor.submit(new DependentService2(barrier));
        executor.submit(new DependentService2(barrier));
        executor.shutdown();
        System.out.println(barrier.getNumberWaiting());
        System.out.println("MAIN");
        barrier.reset();  //Resets the barrier to its initial state i.e. 3 here
        System.out.println(barrier.getParties());  // Returns the number of parties required to trip this barrier.
        System.out.println(barrier.getNumberWaiting()); //Returns the number of parties currently waiting at the
        // barrier. This method is primarily useful for debugging and assertions.
    }
}
class DependentService2 implements Callable<String> {
    final private CyclicBarrier barrier;
    DependentService2(CyclicBarrier barrier) {
        this.barrier = barrier;
    }
    @Override
    public String call() throws Exception {
            System.out.println(Thread.currentThread().getName()+" service started...");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" is waiting at the barrier...");
            barrier.await();  //Synchronized Wait: It allows a fixed number of threads to wait for
        // each other at a specific "barrier point" until all participating threads have arrived.
        return "Success";
    }
}
