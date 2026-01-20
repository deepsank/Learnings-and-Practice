package Learning.MultiThreading;

public class ThreadStatesExample extends Thread{
    @Override
    public void run() {
        System.out.println("Inside the ThreadStatesExample thread run() method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStatesExample t1 = new ThreadStatesExample();
        System.out.println(t1.getState());  // NEW State
        t1.start();
        System.out.println(t1.getState());  // RUNNABLE State for ThreadStatesExample THREAD
        System.out.println(Thread.currentThread().getState()); //  RUNNABLE State for main() THREAD
        Thread.sleep(100);  // Stopping main() thread to allow ThreadStatesExample t1 thread run() method
        System.out.println(t1.getState());  // TIMED_WAITING State of ThreadStatesExample t1 due to 2000 ms sleep

        t1.join();  // The main() thread will wait for this t1 thread to die before continuing its own code.
        System.out.println(t1.getState());  // TERMINATED State of ThreadStatesExample t1

    }
}
