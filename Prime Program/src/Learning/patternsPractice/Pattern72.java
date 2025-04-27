package Learning.patternsPractice;

import java.util.Scanner;

/*

      A
     A B
    A B C
   A B C D
  A B C D E
 A B C D E F
A B C D E F G

* */
public class Pattern72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            char ch= 'A';
            for (int j = 1; j <=rows ; j++) {
                if(j<=rows-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(ch++ + " ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
