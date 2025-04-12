package Learning.patternsPractice;

import java.util.Scanner;

/*
1 2 3 4 5 6 7
  1 2 3 4 5 6
    1 2 3 4 5
      1 2 3 4
        1 2 3
          1 2
            1
* */
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to have in the pattern:--");
        int rows= sc.nextInt();
        for (int i = rows; i >0 ; i--) {

            for (int j = 1; j <= 2*(rows-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
