package Learning.MultiThreading;

public class Counter {

    private int count = 0;

    public synchronized void increment(){  // Critical Section-- where resources are shared with multiple
        // threads
        // Race condition --- when both threads try to increment the count variable concurrently;
        // prevented using synchronized
        count++;

        /* Synchronization Block  */

//        synchronized (this){
//            count++;
//        }
    }

    public int getCount() {
        return count;
    }
}
