package a2ojLadder.ladder11;

import java.util.Scanner;

public class PetyaStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toUpperCase();
        String s2 = sc.nextLine().toUpperCase();

        for (int i = 0; i < s1.length(); i++) {
            if((s1.charAt(i)-s2.charAt(i))==0 || (s1.charAt(i)-s2.charAt(i))==32){
                continue;
            } else if ((s1.charAt(i)-s2.charAt(i))>0 ) {
                System.out.println("1");
                return;
            }
            else if ((s1.charAt(i)-s2.charAt(i))<0) {
                System.out.println("-1");
                return;
            }
        }

        System.out.println("0");
    }
}
