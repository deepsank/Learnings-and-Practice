package a2ojLadder.ladder11;


import java.util.Scanner;

public class Contest2125_A_DifficultContest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            String str = sc.next();
            int[] freqArray = new int[26];
            for(char ch : str.toCharArray()){
                freqArray[ch-65]++;
            }
            StringBuilder resultStr = new StringBuilder();
            while (freqArray[19]-->0){
                resultStr.append('T');
            }
            for (int i = 0; i < 26; i++) {
                while (freqArray[i]-->0){

                    resultStr.append((char)(i+65));
                }
            }

            System.out.println(resultStr.toString());
        }
    }
}
