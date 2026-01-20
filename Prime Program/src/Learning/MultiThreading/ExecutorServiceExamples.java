package Learning.MultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExamples {

    public static long factorial(int num){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long  result = 1;
        for (int i = 1; i <=num; i++) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args)  {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        Runnable runnable = () -> "Hello!!!";  // Here, getting error, as run() method has void return type
//        Callable callable = () -> "Hello!!!";
//        Future<String> future = executor.submit(() -> "Hello!!!");// But, here, Callable is used instead of Runnable,
// and it has return type which is not void, and hence no error
//        Future<?> future = executor.submit(() -> System.out.println("Hello!!!"));

//        Future<String> future = executor.submit(() -> System.out.println("Hello!!!"), "success");


        ExecutorService executor = Executors.newFixedThreadPool(2);
//        Future<Integer> future = executor.submit(() -> 1 + 3);
//        try {
//            System.out.println(future.get());
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        executor.shutdown();
//        Thread.sleep(1);  // bloack further execution of main() thread,
//        // and gives enough time for the task to complete
//        System.out.println(executor.isTerminated()); // Now, it will return true;

        Callable<Integer> callable1 = ()->{
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = ()->{
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = ()->{
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
        List<Future<Integer>> futures;
        try {
//            futures = executor.invokeAll(list);
//            futures = executor.invokeAll(list,1,TimeUnit.SECONDS);
//            for(Future<Integer> f : futures){
//                try {
//                    System.out.println(f.get());
//                } catch (ExecutionException | InterruptedException e) {
//                    System.out.println(e);
//                }
//            }

            Integer i = executor.invokeAny(list);
            System.out.println(i);

        } catch (InterruptedException | CancellationException e) {
            System.out.println(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();
        System.out.println("Hello World!!!");

    }

//    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        ExecutorService executor = Executors.newFixedThreadPool(9);
//        for (int i = 1; i < 10; i++) {
//            int finalI = i;
//            Future<Long> futures = executor.submit(() ->
//            {
//                long result = factorial(finalI);
//                return result;
//            });
//
//            try {
//                System.out.println(futures.get());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        executor.shutdown();
////        executor.shutdownNow();
//
////        try {
////            while(!executor.awaitTermination(100, TimeUnit.MILLISECONDS)){
////                System.out.println("Waiting...");
////            }
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//        System.out.println("Total time taken:-- "+(System.currentTimeMillis()-startTime));
//    }
}
