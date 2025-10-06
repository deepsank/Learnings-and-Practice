//package a2ojLadder.ladder11;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numSolved = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            if((p==1 && v==1) || (p==1 && t==1) || (v==1 && t==1)){
                numSolved++;
            }
        }

        System.out.println(numSolved);
    }
}
