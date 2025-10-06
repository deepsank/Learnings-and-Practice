package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest2122_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n>=3 && m >= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
