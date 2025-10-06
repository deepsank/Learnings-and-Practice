package a2ojLadder.ladder11;

import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String tmeep = sc.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
//            strs[i] = sc.nextLine();
            strs[i] = sc.next();
            int length = strs[i].length();
            if(length>10){
                strs[i]= strs[i].charAt(0)+"" +(length-2) +strs[i].charAt(length-1);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(strs[i]);
        }
    }
}
