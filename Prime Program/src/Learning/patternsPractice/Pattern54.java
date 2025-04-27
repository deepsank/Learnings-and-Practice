package Learning.patternsPractice;


import java.util.Scanner;

/*


*
* *
*   *
*     *
*       *
*         *
* * * * * * *


 * */
public class Pattern54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j==1 || j==i || i==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

