package a2ojLadder.ladder11;

import java.util.Scanner;

public class StonesOnTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int minimumRemoval = 0;

        int i=0;
        int j=1;

        while(i<j && j<n){
            if(str.charAt(i)==str.charAt(j)){
                j++;
                minimumRemoval++;
            }
            else{
                i=j;
                j++;
            }
        }

        System.out.println(minimumRemoval);

        sc.close();
    }
}
