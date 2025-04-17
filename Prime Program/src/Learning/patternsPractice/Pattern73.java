package Learning.patternsPractice;

import java.util.Scanner;

/*

      A
     B A
    C B A
   D C B A
  E D C B A
 F E D C B A
G F E D C B A

* */
public class Pattern73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            char ch= 'A';
            ch+=i-1;
            for (int j = 1; j <=rows ; j++) {
                if(j<=rows-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(ch-- + " ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
