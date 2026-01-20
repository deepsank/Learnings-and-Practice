package Learning.MultiThreading;

public class VolatileExamples {
    private volatile boolean flag;
    /*
        The volatile keyword in Java is a variable modifier that guarantees visibility of changes to a variable across multiple threads and prevents instruction reordering by the compiler and
        processor.
        Core Purpose: Memory Visibility
        In a multi-threaded environment, each thread can have a local cache (e.g., in a CPU register or cache memory) of shared variables for performance optimization. When one thread modifies
        a shared variable, there is no guarantee that other threads will immediately see the updated value from main memory.
        Declaring a variable as volatile forces all threads to:
        Always read the variable's value directly from main memory instead of from their local CPU caches.
        Immediately write any changes to the variable back to main memory.
        This ensures that all threads see the most up-to-date value of the volatile variable, preventing "visibility" problems
    */
    public void write(){
        System.out.println("Inside write to update flag to true..");
        flag=true;
    }
    public void read() {
        while(!flag){

        }
        System.out.println("The flag is read as: "+flag);   // each thread reads local variable from it local cache, where flag is read as FALSE,
        // hence it read the initial FALSE value and after that writerThread updated it to TRUE in JVM memory, but readerThread reads \
        // its value from its local cache and hence sees FALSE only, and hence infinite while LOOP and hence doesn't print anything from read sysout

    }
    public static void main(String[] args) {
        VolatileExamples sharedResource = new VolatileExamples();
        Thread writerThread = new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            sharedResource.write();
        });
        Thread readerThread = new Thread(()->{   // each thread reads local variable from it local cache, where flag is read as FALSE,
            // hence it read the initial FALSE value and after that writerThread updated it to TRUE in JVM memory, but readerThread reads \
            // its value from its local cache and hence sees FALSE only, and hence infinite while LOOP and hence doesn't print anything from read sysout
            sharedResource.read();
        });
        writerThread.start();
        readerThread.start();
    }
}
