package Learning.DSA.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * TC --- O(n log(n)) in Best Case, Average Case; O(n^2) in Worst Case
 * SC --- O(n)
 *
 * Divide and Conquer strategy
 *
 * */
public class QuickSort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("---Please enter "+n+" elements of the array that you want to sort--");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println("---Now about to send it to Quick Sort method to sort it---");

        quickSort(arr,0, n-1);

        System.out.println("---The sorted array is:--- " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int i = low-1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
