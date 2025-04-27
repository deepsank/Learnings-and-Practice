import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Contests2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        List<int[]> output = new ArrayList<>();

        while(t--> 0){
            int n = sc.nextInt();
            int[] numbers = new int[n];
            int[] out = new int[2*n];
            int[][] grid = new int[n][n];
            // Read grid properly - each row gets its own array
            for (int i = 0; i < n; i++) {
                grid[i] = new int[n];  // Create new array for each row
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }


            // Fill out array safely
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int index = i + j+1;
                    if (index < out.length) {
                        out[index] = grid[i][j];
                    }
                }
            }
            int expectedSum = 2*n * (2*n + 1) / 2;
            int actualSum = 0;
            for (int num : out) {
                actualSum += num;
            }
            out[0]=expectedSum - actualSum;

//            System.out.println(Arrays.toString(out));
            output.add(out);

        }



        for (int i = 0; i < output.size(); i++) {
            for (int j = 0; j < output.get(i).length; j++) {
                System.out.print(output.get(i)[j]+" ");
            }

//            System.out.println(Arrays.toString(output.get(i)));
            System.out.println();

        }



        sc.close();
    }
}
