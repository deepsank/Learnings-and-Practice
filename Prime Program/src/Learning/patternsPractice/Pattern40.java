package Learning.patternsPractice;

import java.util.Scanner;

/*
1 2 3 4 5 6 7 8 9
2 3 4 5 6 7 8 9 1
3 4 5 6 7 8 9 1 2
4 5 6 7 8 9 1 2 3
5 6 7 8 9 1 2 3 4
6 7 8 9 1 2 3 4 5
7 8 9 1 2 3 4 5 6
8 9 1 2 3 4 5 6 7
9 1 2 3 4 5 6 7 8
* */
public class Pattern40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 0; j < rows ; j++) {
                if(i+j<=rows){
                    System.out.print((i+j) + " ");
                }
                else {
                    System.out.print((i + j) % 10 + 1+ " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
