package Learning.patternsPractice;

import java.util.Scanner;

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1


* */
public class Pattern11 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want the pattern to be of:-- ");
        int rows= sc.nextInt();

        for (int i = 1 ;i <=rows;i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }

            for (int j = i-1; j >0 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        sc.close();
    }
}
