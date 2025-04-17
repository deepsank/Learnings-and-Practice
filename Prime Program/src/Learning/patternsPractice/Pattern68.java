package Learning.patternsPractice;

import java.util.Scanner;

/*

A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G

* */
public class Pattern68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();
        char ch= 'A';
        for (int i = 1; i <= rows; i++, ch++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
