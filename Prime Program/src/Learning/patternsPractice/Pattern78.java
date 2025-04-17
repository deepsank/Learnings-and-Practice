package Learning.patternsPractice;

import java.util.Scanner;

/*

A B C D E F G
 A B C D E F
  A B C D E
   A B C D
    A B C
     A B
      A
     A B
    A B C
   A B C D
  A B C D E
 A B C D E F
A B C D E F G

* */
public class Pattern78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        for (int i = rows; i >= 2; i--) {
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
