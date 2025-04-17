package Learning.patternsPractice;

import java.util.Scanner;

/*

      Z
     Y Z
    X Y Z
   W X Y Z
  V W X Y Z
 U V W X Y Z
T U V W X Y Z

* */
public class Pattern74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            char ch= 'Z';
            ch-=i-1;
            for (int j = 1; j <=rows ; j++) {
                if(j<=rows-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(ch++ + " ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
