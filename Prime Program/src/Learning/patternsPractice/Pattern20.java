package Learning.patternsPractice;

import java.util.Scanner;

/*

7 7 7 7 7 7 7
 6 6 6 6 6 6
  5 5 5 5 5
   4 4 4 4
    3 3 3
     2 2
      1
* */
public class Pattern20 {
    public static void main(String     [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the pattern:-- ");
        int rows = sc.nextInt();

        for (int i = rows; i >=1 ; i--) {
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
