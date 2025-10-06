package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest2126_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
             int[][] casinosArray = new int[n][3];
            for (int i = 0; i < n; i++) {
                casinosArray[i][0] = sc.nextInt();
                casinosArray[i][1] = sc.nextInt();
                casinosArray[i][2] = sc.nextInt();
            }

        }
    }
}
