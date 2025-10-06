//package a2ojLadder.ladder11;

import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minCapacity=0;
        int net=0;
        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();

            net+= (bi-ai);
            if(minCapacity<net){
                minCapacity=net;
            }
        }
        System.out.println(minCapacity);
    }
}
