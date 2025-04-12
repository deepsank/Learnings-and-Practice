package Learning.patternsPractice;


import java.util.Scanner;

/*
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7

* */
public class Pattern21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern you want to have:-- ");
        int rows = sc.nextInt();

        for (int i = rows; i >0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= rows; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
