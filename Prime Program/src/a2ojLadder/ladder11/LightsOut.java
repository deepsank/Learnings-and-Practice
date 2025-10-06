package a2ojLadder.ladder11;

import java.util.Scanner;

public class LightsOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];  // Proper allocation
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        char[][] resultChar = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultChar[i][j] = '1';
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(grid[i][j]>0 && grid[i][j]%2!=0){
//                    toggleSides();
                    if(resultChar[i][j]=='1'){
                        resultChar[i][j]='0';
                    }
                    else{
                        resultChar[i][j]='1';
                    }

                    if(i-1>=0 && resultChar[i-1][j]=='1'){
                        resultChar[i-1][j]='0';
                    }
                    else if(i-1>=0 && resultChar[i-1][j]=='0'){
                        resultChar[i-1][j]='1';
                    }

                    if(i+1<3&& resultChar[i+1][j]=='1'){
                        resultChar[i+1][j]='0';
                    }
                    else if(i+1<3 && resultChar[i+1][j]=='0'){
                        resultChar[i+1][j]='1';
                    }

                    if(j-1>=0 && resultChar[i][j-1]=='1'){
                        resultChar[i][j-1]='0';
                    }
                    else if(j-1>=0 && resultChar[i][j-1]=='0'){
                        resultChar[i][j-1]='1';
                    }

                    if(j+1<3&& resultChar[i][j+1]=='1'){
                        resultChar[i][j+1]='0';
                    }
                    else if(j+1<3 && resultChar[i][j+1]=='0'){
                        resultChar[i][j+1]='1';
                    }
                }
            }
        }

        System.out.println(resultChar[0]);
        System.out.println(resultChar[1]);
        System.out.println(resultChar[2]);

        sc.close();
    }
}
