package Learning.MultiThreading;

public class LambdaExpressionInThreads {

    Runnable runnable = () -> {
        System.out.println("Inside thread...");
    };

}
