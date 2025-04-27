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

* */
public class Pattern47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of midRow in the pattern:-- ");
        int midRow = sc.nextInt();
        for (int i = 1; i <= midRow; i++) {
            for (int j = 1; j <= midRow; j++) {
                if(j<i){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();

    }
}
