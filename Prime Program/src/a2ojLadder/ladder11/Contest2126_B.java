package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest2126_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int maxPeaks = 0;
            int i = 0;
            int j = 0;
            int arrWeather[] = new int[n];
            for (int l = 0; l < n; l++) {
                arrWeather[l] = sc.nextInt();
            }
            while(j<n){

                if(arrWeather[j]==1){
                    j = j+1;
                    i=j;
                }else if((j-i)==(k-1)){
                    maxPeaks++;
                    j = j+2;
                    i=j;
                }
                else{
                    j++;
                }
            }

            System.out.println(maxPeaks);
        }
    }
}
