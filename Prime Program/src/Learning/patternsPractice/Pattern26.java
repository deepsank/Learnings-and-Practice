package Learning.patternsPractice;


import java.util.Scanner;

/*
1
10
101
1010
10101
101010
1010101
* */
public class Pattern26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j%2);
            }
            System.out.println();
        }

        sc.close();
    }
}
