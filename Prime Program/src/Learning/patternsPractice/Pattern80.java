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
  A B C D E F
    A B C D E
      A B C D
        A B C
          A B
            A

* */
public class Pattern80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            char ch= 'A';
            for (int j = 1; j <=rows ; j++) {
                if(j>rows-i){
                    System.out.print(ch++ + " ");
                }
                else{
                    System.out.print( "  ");
                }


            }
            System.out.println();
        }

        for (int i = rows-1; i >= 1; i--) {
            char ch= 'A';
            for (int j = 1; j <=rows ; j++) {
                if(j>rows-i){
                    System.out.print(ch++ + " ");
                }
                else{
                    System.out.print( "  ");
                }


            }
            System.out.println();
        }

        sc.close();
    }
}
