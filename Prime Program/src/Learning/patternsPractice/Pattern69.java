package Learning.patternsPractice;

import java.util.Scanner;

/*

A B C D E F G
A B C D E F
A B C D E
A B C D
A B C
A B
A

* */
public class Pattern69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            char ch= 'A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
