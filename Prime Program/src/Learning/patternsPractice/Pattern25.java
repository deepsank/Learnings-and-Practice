package Learning.patternsPractice;


import java.util.Scanner;

/*
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
* */
public class Pattern25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the middle row in the pattern:-- ");
        int midRow = sc.nextInt();

        for (int i = 1; i <= midRow ; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=midRow; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        for (int i = midRow-1; i > 0 ; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=midRow; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
