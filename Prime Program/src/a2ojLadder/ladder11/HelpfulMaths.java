package a2ojLadder.ladder11;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] numsArray = Arrays.stream(str.split("\\+")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numsArray);

        for (int i = 0; i < numsArray.length; i++) {
            System.out.print(numsArray[i]);
            if(i < numsArray.length-1)
                System.out.print("+");
        }

    }
}
