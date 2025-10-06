package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest2125_B_LeftAndDown {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            long gcdAB = gcd(a,b);

            if(a/gcdAB<=k && b/gcdAB<=k){
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }


        }

    }

    public static long gcd(long a, long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }



}
