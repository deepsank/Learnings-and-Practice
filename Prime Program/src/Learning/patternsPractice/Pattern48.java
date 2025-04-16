package Learning.patternsPractice;

import java.util.Scanner;
/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 * */
public class Pattern48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
