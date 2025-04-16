package Learning.patternsPractice;

import java.util.Scanner;

/*
1 2 3 4
5 6 7
8 9
10
* */
public class Pattern32 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the pattern= ");
        int rows = sc.nextInt();
        int num = 1;
        for (int i = rows; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num+" ");

                num++;
            }

            System.out.println();
        }

        sc.close();
    }
}
