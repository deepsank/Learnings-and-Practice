package Learning.patternsPractice;


import java.util.Scanner;

/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
* */
public class Pattern27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows ; j++) {
                System.out.print((j+i+1)%2);
            }
            System.out.println();
        }

        sc.close();
    }
}
