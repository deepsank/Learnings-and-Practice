package a2ojLadder.ladder11;

import java.util.Scanner;

public class DimaFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalFingers = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            totalFingers+=temp;
        }

        int countResult = 0;
        for (int i = 1; i <= 5 ; i++) {
            if((totalFingers+i) % (n+1) != 1){
                countResult++;
            }
        }

        System.out.println(countResult);
    }
}
