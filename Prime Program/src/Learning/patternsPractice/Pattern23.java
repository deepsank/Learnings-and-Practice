package Learning.patternsPractice;

import java.util.Scanner;

/*
      7
     7 6
    7 6 5
   7 6 5 4
  7 6 5 4 3
 7 6 5 4 3 2
7 6 5 4 3 2 1
* */
public class Pattern23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to have in the pattern:-- ");
        int rows = sc.nextInt();

        for (int i = rows; i >0; i--) {
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
