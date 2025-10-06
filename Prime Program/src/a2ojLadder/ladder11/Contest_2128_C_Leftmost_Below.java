package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest_2128_C_Leftmost_Below {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long small = Integer.MAX_VALUE;
            boolean ans = true;

            while (n-->0){
                long x = sc.nextInt();

                if(x >= 2*small){
                    ans=false;
                }
                small = Math.min(small,x);
            }
//            sc.nextLine();


            if (ans) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}


