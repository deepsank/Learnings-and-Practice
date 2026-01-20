package Learning.MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExamples {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
//        scheduler.schedule(()-> System.out.println("Task executed after 5 seconds delay.."),
//                5,
//                TimeUnit.SECONDS);
//        scheduler.shutdown();
//        scheduler.scheduleAtFixedRate(()-> System.out.println("Task executed after every 5 seconds.."),
//        5,
//                5,
//                TimeUnit.SECONDS);

        scheduler.scheduleWithFixedDelay(()-> System.out.println("Task executed after every 5 seconds.."),
                5,
                5,
                TimeUnit.SECONDS);

        scheduler.schedule(()->{
            System.out.println("Initiating shutdown...");
            scheduler.shutdown();
        },20,TimeUnit.SECONDS);

    }
}
