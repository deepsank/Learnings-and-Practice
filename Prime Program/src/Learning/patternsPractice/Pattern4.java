package Learning.patternsPractice;


import java.util.Scanner;

/*
7 7 7 7 7 7 7
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1

     */
public class Pattern4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want the pattern to be of:--- ");
        int rows= sc.nextInt();

        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        sc.close();
    }


}
