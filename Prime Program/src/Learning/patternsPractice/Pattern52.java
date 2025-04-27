package Learning.patternsPractice;

import java.util.Scanner;

/*

* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *

 * */
public class Pattern52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of midRow in the pattern:-- ");
        int midRow = sc.nextInt();
        for (int i = midRow; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= midRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();





    }

}
