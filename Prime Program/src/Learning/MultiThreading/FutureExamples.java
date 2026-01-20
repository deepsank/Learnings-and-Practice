package Learning.MultiThreading;

import java.util.concurrent.*;

public class FutureExamples {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Hello");
            return 42;
        });
//        try {
//            System.out.println(future.get(1, TimeUnit.SECONDS));
//            System.out.println(future.isDone());
//
//        } catch (InterruptedException | TimeoutException | ExecutionException e) {
//            System.out.println(e);
//        }
        try {
            Thread.sleep(1000);  // to block main thread for allowing executor thread to start so as to see how cancel() doesn't
            // cancel it
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        future.cancel(false); // False means it will not interrupt already running task, and only cancel task
        // which are not yet started
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());

        executor.shutdown();
    }
}
