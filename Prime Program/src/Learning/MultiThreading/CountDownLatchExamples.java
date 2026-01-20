package Learning.MultiThreading;


import java.util.concurrent.*;

public class CountDownLatchExamples {
    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(3);
        executor.submit(new DependentService(latch));
        executor.submit(new DependentService(latch));
        executor.submit(new DependentService(latch));
        latch.await(1, TimeUnit.SECONDS);  // Causes the current thread to wait until the latch has
        // counted down to zero, unless the thread is interrupted, or the specified waiting time elapses.
        executor.shutdown();
        System.out.println("MAIN");
    }
}
class DependentService implements Callable<String> {
    final private CountDownLatch latch;
    DependentService(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" service started...");
        }
        finally {
            latch.countDown();
        }
        return "Success";
    }
}
