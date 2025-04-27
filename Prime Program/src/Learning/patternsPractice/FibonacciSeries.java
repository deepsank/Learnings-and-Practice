package Learning.patternsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int fibonacciMemoization(int n, int[] memo){
        if(n<=1){
            return n;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n]= fibonacciMemoization(n-1, memo) + fibonacciMemoization(n-2,memo);
        return memo[n];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the fibonacci series:-- ");
        int n = sc.nextInt();
        /* Approach-1- Iterative-- Most optimal -- TC=O(n) and SC=O(1) */
        /*int[] fibSeq = new int[n];
        fibSeq[0]=0;
        fibSeq[1]=1;
        for (int i = 2; i <n ; i++) {
            fibSeq[i]=fibSeq[i-1]+fibSeq[i-2];
        }

        System.out.println(Arrays.toString(fibSeq));*/

        /* Approach-2- Recursive-- -- TC=O(2^n) and SC=O(n) */
        /*System.out.println("Fibonacci Series:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }*/

        /* Approach-3- Recursion with Memoization-- -- TC=O(n) and SC=O(n) */
        /*System.out.println("Fibonacci Series:- ");
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciMemoization(i,memo) + ", ");
        }*/

        /* Approach-4- DP-- -- TC=O(n) and SC=O(1) */
        System.out.println("Fibonacci Series:- ");
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(dp[i]+ " ");
        }

    }


}
