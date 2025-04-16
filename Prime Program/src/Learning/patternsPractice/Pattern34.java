package Learning.patternsPractice;

import java.util.Scanner;

/*
1
*2*
**3**
***4***
****5****
*****6*****
******7******
* */
public class Pattern34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern== ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2*i-1; j++) {
                if (j==i){
                    System.out.print(i);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
