package a2ojLadder.ladder11;

import java.util.Scanner;

public class PerfectPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[]= new int[n];
        if(n%2!=0){
            System.out.println("-1");
            return;
        }
        for (int i = 1; i <=n ; i=i+2) {
            res[i-1]=i+1;
            res[i]=i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+ " ");

        }
    }
}
