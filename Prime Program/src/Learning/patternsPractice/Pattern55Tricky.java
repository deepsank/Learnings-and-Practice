package Learning.patternsPractice;

import java.util.Scanner;

/*


* * * * * * *
 *         *
  *       *
   *     *
    *   *
     * *
      *


 * */
public class Pattern55Tricky {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for(int i=rows; i>=1; i--){

            for (int j = 1; j <=rows ; j++) {
                if(j<=rows-i ){ // j <= rows - i
                    System.out.print(" ");

                }
                else{  // j > rows - i  ---- to j = rows
                    if(i==rows || j==(rows-i+1) || j==rows){

                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
