package a2ojLadder.ladder11;

import java.util.Scanner;

public class LittleElephantAndRozdil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minDistance = 1000000001;
        int minCount = 0;
        int resultIndex = -1;
        for (int i = 0; i < n; i++) {
            int inputIth = sc.nextInt();
            if(inputIth<minDistance){
                minDistance=inputIth;
                resultIndex=i+1;
                minCount=0;
            } else if (inputIth==minDistance) {
                minCount++;

            }
        }

        if(minCount>0){
            System.out.println("Still Rozdil");
        }
        else {
            System.out.println(resultIndex);
        }

        sc.close();

    }
}
