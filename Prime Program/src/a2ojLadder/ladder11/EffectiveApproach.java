package a2ojLadder.ladder11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EffectiveApproach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arrNum = new int[n+1];
        Map<Integer,Integer> posMap = new HashMap<>();
        for(int i=1;i<=n;i++){
            arrNum[i] = sc.nextInt();
            posMap.put(arrNum[i],i );
        }
        int m = sc.nextInt();
        long vasyaTotal = 0;
        long petyaTotal = 0;

        for (int i = 0; i < m; i++) {
            int queryInput = sc.nextInt();
            int positionOfQuery = posMap.get(queryInput);
            vasyaTotal+=positionOfQuery;
            petyaTotal+=(n-positionOfQuery + 1);
        }

        System.out.println(vasyaTotal + " "+ petyaTotal);

    }
}
