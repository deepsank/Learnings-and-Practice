package a2ojLadder.ladder11;

import java.util.Scanner;

public class PanoramixsPrediction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int primeCount=0;
        for (int i = n+1; i < m; i++) {

            if(isPrime(i)){
                System.out.println("NO");
                return;
            }
        }
        if (isPrime(m)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        sc.close();


    }

    public static boolean isPrime(int num){
        int numFactors = 0;
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                return false;
            }
        }


            return true;

    }
}
