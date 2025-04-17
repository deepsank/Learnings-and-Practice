package Learning.patternsPractice;

import java.util.Scanner;

/*

p q r s t u v
p q r s t u
p q r s t
p q r s
p q r
p q
p

* */
public class Pattern71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            char ch= 'p';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
