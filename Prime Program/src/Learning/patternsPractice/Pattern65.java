package Learning.patternsPractice;


import java.util.Scanner;

/*

 *                         *
 * *                     * *
 * * *                 * * *
 * * * *             * * * *
 * * * * *         * * * * *
 * * * * * *     * * * * * *
 * * * * * * * * * * * * * *
 * * * * * *     * * * * * *
 * * * * *         * * * * *
 * * * *             * * * *
 * * *                 * * *
 * *                     * *
 *                         *


 */
public class Pattern65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of the middle row in the pattern-- ");
        int midRow = sc.nextInt();
        for (int i = 1; i <= midRow ; i++) {
            for (int j = 1; j <= 2* midRow ; j++) {
                if(j<=i || j>=2*midRow-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = midRow-1; i >= 1 ; i--) {
            for (int j = 1; j <= 2* midRow ; j++) {
                if(j<=i || j>=2*midRow-i+1){
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
