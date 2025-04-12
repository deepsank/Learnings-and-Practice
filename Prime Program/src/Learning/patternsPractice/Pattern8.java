package Learning.patternsPractice;

import java.util.Scanner;

/*

7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

*/
public class Pattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows that you want the pattern to be of:-- ");
        int rows= sc.nextInt();



        for (int i = rows; i >0 ; i--) {

            for (int j = i; j >= 1 ; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();

        }

        sc.close();
    }
}
