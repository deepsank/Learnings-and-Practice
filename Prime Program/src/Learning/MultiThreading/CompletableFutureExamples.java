package Learning.MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExamples {
    public static void main(String[] args) {

//        //CompletableFuture class is designed for asynchronous, non-blocking programming in Java
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            return "Success";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s->"Timeout Exception Occurred");
//                .thenApply((x -> x+x));
        try {
            System.out.println(completableFuture.get()); // block further code
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }
//        System.out.println(completableFuture.getNow("NOOO")); // block further code
        System.out.println("MAIN");


//        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker f1..");
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//            return "Success";
//        });
//
//        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker f2..");
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//            return "Success";
//        });
//
//        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);
//        f.join();  // SIMILAR TO f.get();
//        System.out.println("MAIN");

    }
}
