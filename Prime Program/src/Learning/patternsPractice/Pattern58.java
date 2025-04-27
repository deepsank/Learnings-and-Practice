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
public class Pattern58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();


        System.out.println("Here is your pattern....!!!");

        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++){
                if(j==1 || j==i || i==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

        //Closing the resources

        sc.close();
    }
}
