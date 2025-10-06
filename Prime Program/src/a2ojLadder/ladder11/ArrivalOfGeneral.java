//package a2ojLadder.ladder11;

import java.util.Scanner;

public class ArrivalOfGeneral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] seq  = new int [n];

        int max = -1;
        int maxIndex = -1;
        int min = 101;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            seq[i]=sc.nextInt();
            if(max<seq[i]){
                max=seq[i];
                maxIndex = i;
            }
            if(min>=seq[i]){
                min=seq[i];
                minIndex = i;
            }
        }

        if(maxIndex<minIndex){
            System.out.println((maxIndex)+(n-minIndex-1));
        }
        else {
            System.out.println(maxIndex+(n-minIndex-1)-1);
        }

    }
}
