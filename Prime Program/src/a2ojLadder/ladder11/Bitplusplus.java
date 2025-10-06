package a2ojLadder.ladder11;

import java.util.Scanner;

public class Bitplusplus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x=0;
        String str =null;
        for(int i =0; i<n; i++){
            str = sc.next();

            if(str.charAt(0)=='+' || str.charAt(1)=='+' || str.charAt(2)=='+'){
                x++;
            }
            else {
                x--;
            }
        }

        System.out.println(x);
    }
}
