package Learning.DSA.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * TC --- O(n log(n)) in all Cases
 * SC --- O(n)
 *
 * Divide and Conquer strategy
 *
 * */
public class MergeSort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("---Please enter "+n+" elements of the array that you want to sort--");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println("---Now about to send it to Merge Sort method to sort it---");

        mergeSort(arr,0, n-1);

        System.out.println("---The sorted array is:--- " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }

    private static void merge(int[] arr, int l,int m, int r) {
            int n1 = m-l+1;
            int n2 = r-m;
            int[] L = new int[n1];
            int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i =0,j=0;

        int k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
