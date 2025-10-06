//package a2ojLadder.ladder11;

import java.util.Scanner;

public class Drinks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalVolume = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            totalVolume+=x;
        }
        double result = (double)totalVolume/n;

        System.out.printf("%.12f%n", result);
    }
}
