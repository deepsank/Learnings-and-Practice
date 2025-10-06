package a2ojLadder.ladder11;

import java.util.Scanner;

public class Contest2125_C_CountGoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- >0){
            long l = sc.nextLong();
            long r = sc.nextLong();
            long result = 0;

            result = countOfGoodNum(r) - countOfGoodNum(l-1);
            System.out.println(result);

        }
    }

    public static long countOfGoodNum(long n){
     return n - n/2 -n/3 - n/5 -n/7 + n/6+n/15+n/35+n/10+n/14+n/21-n/30-n/105-n/42-n/70+n/210;
    }
}
