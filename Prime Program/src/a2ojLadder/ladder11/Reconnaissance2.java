package a2ojLadder.ladder11;


import java.util.Scanner;

public class Reconnaissance2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int heights[] = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int minHeight = 1000;
        int resultFirst = 0;
        int resultSecond = 0;
        for (int i = 0; i < n; i++) {
            int heightDiff = Math.abs(heights[i] - heights[(i + 1) % n]);
            if(heightDiff < minHeight){
                minHeight = heightDiff;
                resultFirst = i+1;
                resultSecond = (i+1) %n +1;
            }
        }
        System.out.println(resultFirst + " " + resultSecond);

    }
}
