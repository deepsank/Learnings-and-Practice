package Learning.DSA.sorting;

import java.util.Arrays;
import java.util.Scanner;


/*
* TC --- O(n^2) in all 3 cases Best Case, Worst Case, Average Case
* SC --- O(1)
*
* */
public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("---Please enter "+n+" elements of the array that you want to sort--");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println("---Now about to send it to Selection Sort method to sort it---");

        selectionSort(arr);

        System.out.println("---The sorted array is:--- " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int size = arr.length;
        if(size<2){
            return;
        }
        for (int i = 0; i < size; i++) {
            int minEleIndex = i;
            for (int j = i; j < size; j++) {
                if(arr[j]<arr[minEleIndex]){
                    minEleIndex = j;
                }
            }

            int temp = arr[minEleIndex];
            arr[minEleIndex] = arr[i];
            arr[i] = temp;
        }

    }
}
