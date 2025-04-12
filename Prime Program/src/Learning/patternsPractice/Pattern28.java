package Learning.patternsPractice;


import java.util.Scanner;

/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
* */
public class Pattern28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern:-- ");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows ; j++) {
                if((i+j)<=rows){
                    System.out.print(1);
                }
                else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
