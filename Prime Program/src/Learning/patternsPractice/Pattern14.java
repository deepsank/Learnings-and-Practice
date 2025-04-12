package Learning.patternsPractice;

import java.util.Scanner;

/*

            1
          2 1
        3 2 1
      4 3 2 1
    5 4 3 2 1
  6 5 4 3 2 1
7 6 5 4 3 2 1

* */
public class Pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");

        int rows=sc.nextInt();
        for (int i = 1; i <= rows ; i++) {
            for (int j = rows; j >=1 ; j--) {
                if(j>i){
                    System.out.print("  ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
