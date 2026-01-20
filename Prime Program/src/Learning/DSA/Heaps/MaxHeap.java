package Learning.DSA.Heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxHeap {
    private int capacity;
    private int size;
    private int[] maxHeap;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        this.maxHeap = new int[capacity];
        this.size = 0;
    }
    /*  Various operations required for Heap */
    public void insertion(int value){
        this.maxHeap[size] = value;
        int currentIndex = size;
        size++;
        heapify(currentIndex);
    }

    public void remove(){
        swap(0,size-1);
        maxHeap[size-1]=0;
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
        int temp = maxHeap[i];
        maxHeap[i] = maxHeap[j];
        maxHeap[j] = temp;
    }

    public void heapify(int current){
        while(current!=0 && maxHeap[current]>maxHeap[parent(current)]){
            swap(current,parent(current));
            current=parent(current);
        }
    }

    public void heapifyDown(int parent){
        while((parent <size && rightChild(parent)< size && leftChild(parent)<size) && !(maxHeap[parent] > maxHeap[rightChild(parent)] &&
                maxHeap[parent] > maxHeap[leftChild(parent)] )){
            if(maxHeap[leftChild(parent)] > maxHeap[rightChild(parent)] ){
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
        System.out.println( "MaxHeap{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", maxHeap=" + Arrays.toString(maxHeap) +
                '}');
        return "MaxHeap{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", maxHeap=" + Arrays.toString(maxHeap) +
                '}';
    }


    public static int longestConsecutive(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        Map<Integer,Integer> hmap = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i=0;i<nums.length; i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],1));
            if(nums[i]>maxValue){
                maxValue= nums[i];
            }
            if(nums[i]<minValue){
                minValue= nums[i];
            }
        }
        int currentCount = 0;
        int maxConsecutive = 0;

        for(int i=minValue; i<=maxValue;i++){
            if(hmap.getOrDefault(i,0) > 0){
                currentCount++;
            }
            else{
                if(currentCount>maxConsecutive){
                    maxConsecutive = currentCount;
                }
                currentCount = 0;
            }
        }

        if(currentCount>maxConsecutive){
            maxConsecutive = currentCount;
        }

        return maxConsecutive;
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            while(i<j && (int)s.charAt(i)<48 || ((int)s.charAt(i)>57 && (int)s.charAt(i)<65) ||
                    ((int)s.charAt(i)>90 && (int)s.charAt(i)<97) ||
                    (int)s.charAt(i)>122
            ){
                i++;
            }
            while(i<j && (int)s.charAt(j)<48 || ((int)s.charAt(j)>57 && (int)s.charAt(j)<65) ||
                    ((int)s.charAt(j)>90 && (int)s.charAt(j)<97) ||
                    (int)s.charAt(j)>122
            ){
                j--;
            }
            if(i<j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)) ){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(6);



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


        System.out.println("---Answer is :---" +MaxHeap.longestConsecutive(new int[]{0,1,2,4,8,5,6,7,9,3,55,88,77,99,999999999}));
        System.out.println("---2nd Answer is :---" +MaxHeap.isPalindrome("A man, a plan, a canal: Panama"));

    }
}
