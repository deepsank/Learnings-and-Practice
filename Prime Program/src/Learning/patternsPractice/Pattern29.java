package Learning.patternsPractice;


import java.util.Scanner;

/*

0000000
0100000
0020000
0003000
0000400
0000050
0000006

* */
public class Pattern29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows ; j++) {
                if(i==j){
                    System.out.print(i-1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
