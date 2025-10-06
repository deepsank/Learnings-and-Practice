package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest2130_A_Submission_All_You_Need {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int zeroPresent = 0;
            int totalSum = 0;
            int[] setArr = new int[n];
            for (int i = 0; i < n; i++) {
                setArr[i] = sc.nextInt();
                if(setArr[i]==0){
                    zeroPresent++;
                }
                    totalSum=totalSum+setArr[i];


            }

                totalSum+=zeroPresent;
                System.out.println(totalSum);

        }
        sc.close();
    }
}
