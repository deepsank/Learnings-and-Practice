package a2ojLadder.ladder11;

import java.util.Scanner;

public class QueueAtSchool {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        StringBuilder result = new StringBuilder(s);
        for (int k = 1; k <= t; k++) {
            for (int i = 0; i < n; i++) {
                    if(i<n-1 && result.charAt(i)=='B' && result.charAt(i+1)=='G'){
                        char temp = result.charAt(i);
                        result.setCharAt( i, result.charAt(i+1));
                        result.setCharAt(i+1,temp);
                        i++;
                    }

            }
        }

        System.out.println(result.toString());

        sc.close();
    }
}
