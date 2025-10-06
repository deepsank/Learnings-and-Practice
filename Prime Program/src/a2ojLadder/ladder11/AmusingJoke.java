package a2ojLadder.ladder11;

import java.util.Scanner;

public class AmusingJoke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        int[] freqArray = new int[26];
        for (char ch : s1.toCharArray()) {
            freqArray[ch-65]++;
        }
        for (char ch : s2.toCharArray()) {
            freqArray[ch-65]++;
        }
        for (char ch : s3.toCharArray()) {
            freqArray[ch-65]--;
        }

        for (int i=0;i<26;i++) {
            if(freqArray[i]!=0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
