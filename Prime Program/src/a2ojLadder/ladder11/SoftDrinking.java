package a2ojLadder.ladder11;

import java.util.Scanner;

public class SoftDrinking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int result = Math.min((k*l/nl) ,Math.min(c*d,p/np))/n;

        System.out.println(result);
    }
}
