package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest2126_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int x = sc.nextInt();
            int minDigit = 10;

            int rem = x%10;
            int q = x/10;
            if(minDigit > rem){
                minDigit=rem;
            }
            while(rem!=0 && q>0){

                rem = q%10;
                q = q/10;
                if(minDigit>rem){
                    minDigit=rem;
                }

            }

            System.out.println(minDigit);
        }


        sc.close();
    }
}
