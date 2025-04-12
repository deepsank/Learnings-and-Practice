package Learning.patternsPractice;


import java.util.Scanner;

/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
* */
public class Pattern30Tricky {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows you want to have in the pattern:-- ");
        int rows = sc.nextInt();
        int lastElement= rows*(rows+1)/2; // Each row is having that number of element
        // as the row number itself, hence total elements is sum of all of these which
        // form an A.P. Hence, Summation of AP formula --- n*(n+1)/2
        for (int i = 1; i <=rows ; i++) {
            int count=0; // To count how many elements are printed in the row till now
            for (int j = i; count<i ; j=j+rows-count) { // Each column is having gap decreased by the factor  ----(rows-count), and overall new column value becomes -- newCol= prevCol+ (rows-count)
                System.out.print(j+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
