package a2ojLadder.ladder11;

import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int luckDigitCount = 0;

        for(int i=0; i< num.length(); i++){
            if(num.charAt(i)=='4' || num.charAt(i)=='7'){
                luckDigitCount++;
            }
        }

        if (luckDigitCount==4 || luckDigitCount==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();

    }
}
