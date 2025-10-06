//package a2ojLadder.ladder11;

import java.util.Scanner;

public class I_love_username {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max= sc.nextInt();
        int min = max;
        int totalAmazingContests = 0;

        for (int i = 1; i < n; i++) {
            int temp = sc.nextInt();
            if (temp>max ) {
                totalAmazingContests++;
                max=temp;
            } else if (temp<min) {
                totalAmazingContests++;
                min=temp;
            }
        }

        System.out.println(totalAmazingContests);

    }
}
