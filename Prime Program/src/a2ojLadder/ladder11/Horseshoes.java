//package a2ojLadder.ladder11;

import java.util.Scanner;

public class Horseshoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int minBuy = 0;
        if(s2==s1){
            minBuy++;
        }
        int s3 = sc.nextInt();
        if(s3==s2 || s3==s1){
            minBuy++;
        }

        int s4 = sc.nextInt();
        if(s4==s3 || s4==s2 || s4==s1){
            minBuy++;
        }

        System.out.println(minBuy);
    }
}
