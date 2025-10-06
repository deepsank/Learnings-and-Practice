package a2ojLadder.ladder11;

import java.util.Scanner;

public class SupercentralPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean hasLeft = false, hasRight = false, hasUp = false, hasDown = false;
            int x = points[i][0], y = points[i][1];

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int x2 = points[j][0], y2 = points[j][1];

                if (y2 == y && x2 < x) hasLeft = true;
                if (y2 == y && x2 > x) hasRight = true;
                if (x2 == x && y2 > y) hasUp = true;
                if (x2 == x && y2 < y) hasDown = true;
            }

            if (hasLeft && hasRight && hasUp && hasDown) {
                count++;
            }
        }

        System.out.println(count);

    }
}
