package a2ojLadder.ladder11;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int lowerCaseNum = 0;
        int uppperCaseNum = 0 ;

        for(char ch : str.toCharArray()){
            if(ch>='A' && ch<='Z'){
                uppperCaseNum++;
            }
            else{
                lowerCaseNum++;
            }
        }
        if(lowerCaseNum>=uppperCaseNum){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }

        sc.close();
    }


}
