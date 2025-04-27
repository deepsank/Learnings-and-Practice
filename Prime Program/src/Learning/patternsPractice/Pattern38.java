package Learning.patternsPractice;

import java.util.Scanner;

/*
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
1*2*3*4*5*6
1*2*3*4*5*6*7
* */
public class Pattern38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==i){
                    System.out.print(j);
                }
                else{
                    System.out.print(j+"*");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
