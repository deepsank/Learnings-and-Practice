package a2ojLadder.ladder11;

import java.util.Scanner;

public class BoyorGirl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean[] setArray = new boolean[26];
        int countDistinct = 0;

        for (char ch: input.toCharArray()){
            if(!setArray[ch-97]){
                countDistinct++;
                setArray[ch-97]=true;
            }
        }

        if(countDistinct%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }

    }
}
