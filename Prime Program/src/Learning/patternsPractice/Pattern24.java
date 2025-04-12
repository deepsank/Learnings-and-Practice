package Learning.patternsPractice;

import java.util.Scanner;

/*
7 6 5 4 3 2 1
 7 6 5 4 3 2
  7 6 5 4 3
   7 6 5 4
    7 6 5
     7 6
      7
* */
public class Pattern24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to have in the pattern:-- ");
        int rows = sc.nextInt();

        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = rows; j >= i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
