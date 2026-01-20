package Learning.DSA.Heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinHeap {
    private int capacity;
    private int size;
    private int[] minHeap;

    public MinHeap(int capacity){
        this.capacity = capacity;
        this.minHeap = new int[capacity];
        this.size = 0;
    }
    /*  Various operations required for Heap */
    public void insertion(int value){
        this.minHeap[size] = value;
        int currentIndex = size;
        size++;
        heapify(currentIndex);
    }

    public void remove(){
        swap(0,size-1);
        minHeap[size-1]=0;
        size--;
        int rootIndex = 0;

        heapifyDown(rootIndex);
    }

    public int parent(int childIndex){
        return (childIndex-1)/2;
    }
    public int leftChild(int parent){
        return (2*parent+1);
    }

    public int rightChild(int parent){
        return (2*parent+2);
    }

    public void swap( int i, int j){
        int temp = minHeap[i];
        minHeap[i] = minHeap[j];
        minHeap[j] = temp;
    }

    public void heapify(int current){
        while(current!=0 && minHeap[current] < minHeap[parent(current)]){
            swap(current,parent(current));
            current=parent(current);
        }
    }

    public void heapifyDown(int parent){
        while((parent <size && rightChild(parent)< size && leftChild(parent)<size) && !(minHeap[parent] < minHeap[rightChild(parent)] &&
                minHeap[parent] < minHeap[leftChild(parent)] )){
            if(minHeap[leftChild(parent)] < minHeap[rightChild(parent)] ){
                swap(parent,leftChild(parent));
                parent=leftChild(parent);
            }
            else {
                swap(parent,rightChild(parent));
                parent=rightChild(parent);
            }

        }
    }

    @Override
    public String toString() {
        System.out.println( "minHeap{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", minHeap=" + Arrays.toString(minHeap) +
                '}');
        return "minHeap{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", minHeap=" + Arrays.toString(minHeap) +
                '}';
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> hmap = new HashMap<>();

        for (int num : nums) {
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> priorityQueueHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (Map.Entry<Integer,Integer> entry : hmap.entrySet()) {
            priorityQueueHeap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(priorityQueueHeap.size()>k){
                priorityQueueHeap.poll();
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = priorityQueueHeap.poll()[1];
        }
        return res;

    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(6);

        int result[] = new int[4];
        result = topKFrequent(new int[]{1, 3, 2, 4, 5, 4, 5, 5, 6, 3, 6, 14, 53, 1, 2, 5, 3, 2, 5, 3, 6, 5, 3, 2}, 5);
        System.out.println(Arrays.toString(result));
        System.out.println("----------------------------------------------------------------------------------");
        heap.insertion(24);
        heap.toString();
        heap.insertion(36);
        heap.toString();
        heap.insertion(39);
        heap.toString();
        heap.insertion(21);
        heap.toString();
        heap.insertion(53);
        heap.toString();
        heap.insertion(54);
        heap.toString();


        heap.remove();
        heap.toString();
    }
}
