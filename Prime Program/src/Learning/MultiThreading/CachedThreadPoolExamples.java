package Learning.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExamples {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
    }
}
