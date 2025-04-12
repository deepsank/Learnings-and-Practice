package Learning.patternsPractice;

import java.util.Scanner;

/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
* */
public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enther the middle rows in the pattern:--- ");
        int midRow= sc.nextInt();

        for (int i = 1; i <=midRow ; i++) {
            for (int j = 1; j <=midRow ; j++) {
                if(j>=i){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = midRow-1; i >0 ; i--) {
            for (int j = 1; j <=midRow ; j++) {
                if(j>=i){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
