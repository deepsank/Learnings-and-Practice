package Learning.patternsPractice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enther the number:--- ");
        int num = sc.nextInt();
        int numFactorsCount = 0;
        for (int i = num; i >=1 ; i--) {
            if(num%i==0){
                numFactorsCount++;
            }
        }

        if(numFactorsCount==2){
            System.out.println("The number "+num+" is a prime number");
        }
        else {
            System.out.println("The number "+num+" is not a prime number");

        }
    }
}
