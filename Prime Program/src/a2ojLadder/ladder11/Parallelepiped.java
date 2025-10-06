package a2ojLadder.ladder11;

import java.util.Scanner;

public class Parallelepiped {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long ab = sc.nextInt();
        long bc = sc.nextInt();
        long ca = sc.nextInt();

        long abc = (long) Math.sqrt(ab*bc*ca);
        long a = abc/bc;
        long b = abc/ca;
        long c = abc/ab;

        System.out.println(4*(a+b+c));
    }
}
