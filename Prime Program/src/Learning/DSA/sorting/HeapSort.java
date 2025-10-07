package Learning.DSA.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * TC --- O(n log(n)) in all Cases
 * SC --- O(1)
 *
 * */
public class HeapSort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("---Please enter "+n+" elements of the array that you want to sort--");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println("---Now about to send it to Heap Sort method to sort it---");

        heapSort(arr);

        System.out.println("---The sorted array is:--- " + Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        int size = arr.length;
        if(size<2){
            return;
        }

        for (int i = size/2 - 1; i >= 0 ; i--) {
            heapify(arr, size, i);
        }

        for (int i = size-1; i>=0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }


        

    }

    private static void heapify(int[] arr, int n, int i) {

        int largest = i;

        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }

        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }

        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }


}
