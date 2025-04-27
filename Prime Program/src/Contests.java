
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Contests {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        ArrayList<Integer> out1 = new ArrayList<>();
        ArrayList<Integer> out2 = new ArrayList<>();
        while(t--> 0){
//            String input =sc.nextLine();
//            System.out.println(input);
            int[] numbers = new int[4];
            for (int i = 0; i < 4; i++) {
                numbers[i]=sc.nextInt();
            }
            int n= numbers[0];
            int m= numbers[1];
            int l= numbers[2];
            int r= numbers[3];

            int l1=0;
            int r1=0;
            int count=0;
            while(count<m){
                if (l1==r1 ){
                    /* Due to this inside condition missing(when r1++ is done, in case of r1=r,
                    then it got out of the range l and r, and similarly for l-- case) */
                    /*Hence, the solution didn't got submitted, as it was failing TestCase 32 of Test#-2 */
                    if(r1<r)
                    {
                        r1++;
                    } else if (l1>l) {
                        l1--;
                    }
                    else break;
                    count++;

                }
                else if (l1>l){
                    l1--;
                    count++;

                } else if (r1<r) {
                    r1++;

                    count++;
                }
                else{


                    break;
                }

            }

            out1.add(l1);
            out2.add(r1);

        }


        for (int i = 0; i < out1.size(); i++) {
//            System.out.print(out1.get(i) );
//            System.out.print(out2.get(i) );
//            System.out.println();
            System.out.printf("%d %d%n", out1.get(i), out2.get(i));
            System.out.println();

        }



        sc.close();
    }
}
