package a2ojLadder.ladder11;

import java.util.Scanner;

public class PetrAndBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumTotal = 0 ;
        int lastNotZero = 0;
        int[] numPagesDay = new int[7];
        for (int i = 0; i < 7; i++) {
            numPagesDay[i] = sc.nextInt();
            sumTotal+=numPagesDay[i];
            if(numPagesDay[i]!=0){
                lastNotZero = i+1;
            }
        }



        int remainder = n%sumTotal;
        if(remainder==0){
            System.out.println(lastNotZero);
            return;
        }
        int i = 0;
        for (; i < 7; i++) {
            if(numPagesDay[i]>=remainder){
                System.out.println(i+1);
                return;
            }
            remainder-=numPagesDay[i];
        }

        System.out.println(i);
    }
}
