package a2ojLadder.ladder11;

import java.util.Scanner;

public class HQ9plus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (char ch: str.toCharArray()){
            if(ch=='H' || ch=='Q' || ch=='9' ){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
