package Learning.patternsPractice;

import java.util.Scanner;

/*

G F E D C B A
G F E D C B
G F E D C
G F E D
G F E
G F
G

* */
public class Pattern70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            char ch= 'A';
            ch+= (char) rows-1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
