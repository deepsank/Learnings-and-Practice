package Learning.patternsPractice;

import java.util.Scanner;

/*
    1
   2 3
  3 4 5
 4 5 6 7
5 6 7 8 9

* */
public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern you want to have:-- ");
        int rows = sc.nextInt();

        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 2*i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
