package Learning.patternsPractice;

import java.util.Scanner;

/*
1AAAAAA
12BBBBB
123CCCC
1234DDD
12345EE
123456F
1234567
* */
public class Pattern39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern you want to have:-- ");
        int rows = sc.nextInt();
        char alpha='A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows ; j++) {
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(alpha);
                }
            }
            System.out.println();
            alpha++;
        }

        sc.close();
    }
}
