package a2ojLadder.ladder11;

import java.util.Scanner;

public class Borze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String borzeCodeNum = sc.next();
        StringBuilder decodedNum = new StringBuilder();
        int n = borzeCodeNum.length();
        for (int i=0;i<n;i++){
            if(borzeCodeNum.charAt(i)=='.'){
                decodedNum.append('0');
            }
            else if(i<n-1 && borzeCodeNum.charAt(i)=='-' && (borzeCodeNum.charAt(i+1)=='.')){
                decodedNum.append('1');
                i++;
            }
            else if(i<n-1 && borzeCodeNum.charAt(i)=='-' && (borzeCodeNum.charAt(i+1)=='-')){
                decodedNum.append('2');
                i++;
            }
        }

        System.out.println(decodedNum);

        sc.close();
    }
}
