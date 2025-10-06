package a2ojLadder.ladder11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Contest_2128_B_DequeProcess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            Deque<Integer> pArr = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                pArr.offerLast(sc.nextInt());
            }

            boolean small = true;
            StringBuilder str = new StringBuilder();
            while (!pArr.isEmpty()){
                if(small){
                    if(pArr.peekFirst()<pArr.peekLast()){
                        str.append("L");
                        pArr.pollFirst();
                    }
                    else {
                        str.append("R");
                        pArr.pollLast();
                    }
                }
                else {
                    if(pArr.peekFirst() > pArr.peekLast()){
                        str.append("L");
                        pArr.pollFirst();
                    }
                    else {
                        str.append("R");
                        pArr.pollLast();
                    }
                }
                small = !small;
            }

            System.out.println(str.toString());
        }

        sc.close();
    }
}
