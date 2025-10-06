package a2ojLadder.ladder11;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] chars = str.toCharArray();

        if(str.length()>0){
            if(chars[0]>='a' && chars[0]<='z'){
                chars[0]= (char)(chars[0]-32);
            }
        }
        String result = new String(chars);
        System.out.println(result);

        sc.close();
    }
}
