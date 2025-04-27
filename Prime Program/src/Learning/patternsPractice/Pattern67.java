package Learning.patternsPractice;

import java.util.Scanner;

/*

Z
Z Y
Z Y X
Z Y X W
Z Y X W V
Z Y X W V U
Z Y X W V U T

* */
public class Pattern67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            char ch= 'Z';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
