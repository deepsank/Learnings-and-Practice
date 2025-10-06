package a2ojLadder.ladder11;

import java.util.Scanner;

public class EvenOdds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if((n+1)/2<k){  // This implies that k is greater than total
            // number of odd numbers(which come first in arrangement), hence, the answer is from Even numbers, so we calculate
            // kth number by removing all odd from k and then multiplying it by 2 i.e. --> 2*(k`), where k`= k-(n+1)/2
            System.out.println(2*(k-(n+1)/2));
        }
        else { // This condtion means the answer is an odd number only
            System.out.println(2*k -1);
        }
    }
}
