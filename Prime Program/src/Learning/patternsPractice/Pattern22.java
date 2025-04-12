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

*/
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows in the pattern you want to have:-- ");
        int rows = sc.nextInt();

        for (int i = 1; i <=rows; i++) {
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


   /*
   int result = 10 + 5; // ✅ Field initialization (non-executable) -- stored in Heap memory

    // ❌ Executable in class body--- stored in Stack Memory
    if (result > 0) {
        System.out.println("Positive");
    }
    */
}
