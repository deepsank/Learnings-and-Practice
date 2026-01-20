package Learning.MultiThreading;

public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside the thread, run() method...");
    }


    public static void main(String[] args) {
        ThreadWithRunnable thread = new ThreadWithRunnable();
        Thread t1 = new Thread(thread);
        t1.start();
        System.out.println("Inside the main() method thread...");

    }
}
