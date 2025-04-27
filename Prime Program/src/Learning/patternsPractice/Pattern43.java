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
public class Pattern43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows ; j++) {
                if(j<=i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
