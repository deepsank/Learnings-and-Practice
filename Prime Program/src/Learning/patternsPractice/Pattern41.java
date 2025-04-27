package Learning.patternsPractice;

import java.util.Scanner;

/*
9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9
9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9
9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9
9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9
9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9
9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9
9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9
9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9
9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9
9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9
9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9
9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9
9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9
9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9
9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9
9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9
9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9
* */
public class Pattern41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            int num=rows;
            for (int j = 1; j <=2*rows -1; j++) {
                if (j<i){
                    System.out.print(num-- +" ");
                }
                else if (j>=i && j<=2*rows-i-1){
                    System.out.print((rows-i+1) + " ");
                }
                else {
                    System.out.print((num++)+ " ");
                }

            }
            System.out.println();
        }

        for (int i = rows-1; i >=1 ; i--) {
            int num=rows;
            for (int j = 1; j <=2*rows -1; j++) {
                if (j<i){
                    System.out.print(num-- +" ");
                }
                else if (j>=i && j<=2*rows-i-1){
                    System.out.print((rows-i+1) + " ");
                }
                else {
                    System.out.print((num++)+ " ");
                }

            }
            System.out.println();
        }

        sc.close();
    }
}
