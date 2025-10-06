package a2ojLadder.ladder11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        int resultYear = year+1;
        boolean next = true;
        while (next){
            String str = String.valueOf(resultYear);
            if(hasDistinctDigits(str)){
                break;
            }
            resultYear++;
        }

        System.out.println(resultYear);

        sc.close();
    }

    public static boolean hasDistinctDigits(String num){
        Set<Character> seenDigits = new HashSet<>();
        for(char ch : num.toCharArray()){
            if(seenDigits.contains(ch)){
                return false;
            }
            seenDigits.add(ch);
        }
        return true;
    }
}
