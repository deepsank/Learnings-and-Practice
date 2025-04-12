package Learning.patternsPractice;

import java.util.Scanner;

/*
      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6
7 7 7 7 7 7 7
* */
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the pattern:-- ");
        int rows = sc.nextInt();

        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 2*i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


        sc.close();
    }
}
