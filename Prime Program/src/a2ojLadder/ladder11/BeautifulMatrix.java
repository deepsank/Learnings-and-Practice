package a2ojLadder.ladder11;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i =1,j=1;
        int matrixInput = -1;
        int minSwaps = 0;
        for (i = 1;  i<=5 ; i++) {
            for(j=1; j<=5; j++){
                matrixInput = sc.nextInt();
                if(matrixInput==1){
                    minSwaps = Math.abs(j-3) + Math.abs(i-3);
                    System.out.println(minSwaps);
                    return;
                }
            }

        }

        sc.close();

    }
}
