package Learning.DSA.sorting;

import java.util.Arrays;
import java.util.Scanner;


/*
 * TC --- O(n) in Best Case, O(n^2) in Worst Case,O(n^2) in Average Case
 * SC --- O(1)
 *
 * */
public class BubbleSort {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("---Please enter "+n+" elements of the array that you want to sort--");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println("---Now about to send it to Bubble Sort method to sort it---");

        bubbleSort(arr);

        System.out.println("---The sorted array is:--- " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int size = arr.length;
        if(size<2){
            return;
        }
        boolean swapped ;
        for (int i = 0; i < size-1; i++) {
             swapped = false;
            for (int j = 0; j < size-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false)
            return;
        }

    }
}
