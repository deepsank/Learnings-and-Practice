package Learning.patternsPractice;

import java.util.Scanner;

/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
public class Pattern9 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of middle row you want the pattern to have:--- ");
        int rows=sc.nextInt();

        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        for (int i = rows-1; i >0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
