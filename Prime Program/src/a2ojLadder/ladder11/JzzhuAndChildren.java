package a2ojLadder.ladder11;

import java.util.Scanner;

public class JzzhuAndChildren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

       /* Solution:-1:-- Found by myself, but very complex logic, not ideal */
        /*
       int maxDivisor = -1;
        int remainder = 100;
        int indexResult = 101;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp/m > maxDivisor ){
                indexResult = i;
                maxDivisor = temp/m;
                remainder = temp%m;
            } else if ((temp/m == maxDivisor && (temp%m!=0 || temp%m >= remainder)) || (temp/m == maxDivisor-1 && remainder==0 && temp%m!=0)) {
                indexResult = i;
                maxDivisor = temp/m;
                remainder = temp%m;
            }
        }

        if(indexResult==101){
            System.out.println(n);
        }
        else {
            System.out.println(indexResult+1);
        }
        */

        /*Solution:2-- calculate turns for each input with ceil[a[i]] and then checking and upadting*/
        int maxTurns = 0;
        int lastChild = 0;

        for (int i = 0; i < n; i++) {
            int ithChild = sc.nextInt();
            int turns = (ithChild + m-1)/m;

            if(turns>=maxTurns){
                lastChild = i+1;
                maxTurns = turns;
            }
        }

        System.out.println(lastChild);
    }
}
