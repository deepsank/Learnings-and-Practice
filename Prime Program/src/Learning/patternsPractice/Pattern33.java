package Learning.patternsPractice;

import java.util.Scanner;

/*
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15
* */
public class Pattern33 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the pattern= ");
        int rows = sc.nextInt();
        int num=1;
        for (int i = 1; i <= rows; i++) {
            if(i%2!=0){
                for (int j = 1; j <= i; j++) {
                    System.out.print(num+" ");
                    num++;
                }
            }
            else{
                int k=num+i-1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(k+" ");
                    k--;
                }
                num=num+i;

            }

            System.out.println();
        }
        sc.close();
    }
}
