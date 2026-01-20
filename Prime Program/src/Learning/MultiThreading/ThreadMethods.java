package Learning.MultiThreading;

public class ThreadMethods extends Thread{

    /* Varioud Thread methods are:--
    start() -- marks the beginning of thread, calls run() method internally
    run() -- executes the code inside it
    sleep() -- temporarily pauses the execution of the current thread
    join() -- the caller thread waits for the called(i.e t1 here) to die,
     before executing its own further logic
    setPriority() --- set priority of the Thread
    interrupt() -- Interrupts this thread.
    yield() -- A hint to the scheduler that the current thread is willing to
     yield its current use of a processor. The scheduler is free to ignore this hint.
    setDaemon() --
     */

    public ThreadMethods(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {


//            String a = "";
//            for (int j = 0; j < 10000; j++) {
//                a+="a";
//            }
//            System.out.println(Thread.currentThread().getName()+" -- Priority:-- "+
//                    Thread.currentThread().getPriority()+" -- Count:-- "+i);
//            try {
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName()+" Thread is running....");
//                Thread.yield();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }

            while (true){
                System.out.println("Inside "+Thread.currentThread().getName());

            }
        }
    }

    public static void main(String[] args) {

        ThreadMethods t1 = new ThreadMethods("t1");
        t1.setDaemon(true);
        t1.start();
        System.out.println("Done main() thread");


//        ThreadMethods t2 = new ThreadMethods("Sanket");
//        t1.start();
//        t2.start();

//        t1.interrupt();
//        ThreadMethods l = new ThreadMethods("Low Priority Thread");
//        ThreadMethods m = new ThreadMethods("Medium Priority Thread");
//        ThreadMethods h = new ThreadMethods("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);
//        l.start();
//        m.start();
//        h.start();
    }
}
