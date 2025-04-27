package Learning.patternsPractice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want:---");
        int n = sc.nextInt();
        long  fact = 1L;
        for (int i = n; i >=1 ; i--) {
            fact*=i;
        }
        System.out.println("The factorial of the number "+n+" is -- "+fact);
    }
}
