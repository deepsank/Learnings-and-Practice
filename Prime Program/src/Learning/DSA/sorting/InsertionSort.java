package Learning.DSA.sorting;

import java.util.Arrays;
import java.util.Scanner;


/*
 * TC --- O(n) in Best Case, O(n^2) in Worst Case,O(n^2) in Average Case
 * SC --- O(1)
 *
 * */
public class InsertionSort {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("---Please enter "+n+" elements of the array that you want to sort--");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println("---Now about to send it to Insertion Sort method to sort it---");

        insertionSort(arr);

        System.out.println("---The sorted array is:--- " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int size = arr.length;
        if(size<2){
            return;
        }
        for (int i = 1; i < size; i++) {
            int key = arr[i];   // Taking the key and finding its correct place in sub sorted array before key
            // i.e. from 0 index to (i-1)th index
            int j =i-1;

            while(j>=0){
                if(key<arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                else{
                    break;
                }
            }

            arr[j+1] = key;     // found suitable place for key in sub sorted array

        }

    }
}
