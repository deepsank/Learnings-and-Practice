package Learning.patternsPractice;

import java.util.Scanner;

/*
******1
*****12
****123
***1234
**12345
*123456
1234567
* */
public class Pattern36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern== ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {

                    System.out.print(j);

            }
            System.out.println();
        }
        sc.close();
    }
}
