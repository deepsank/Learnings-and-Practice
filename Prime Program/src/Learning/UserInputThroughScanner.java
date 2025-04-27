package Learning;
import java.util.ArrayList;
import java.util.Scanner;
public class UserInputThroughScanner {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        ArrayList<String> out = new ArrayList<>();
        while(t--> 0){
            StringBuilder outTemp = new StringBuilder();
            String[] input = new String[3];
            input[0]=sc.next();
            input[1]=sc.next();
            input[2]=sc.next();

            outTemp.append(input[0].charAt(0));
            outTemp.append(input[1].charAt(0));
            outTemp.append(input[2].charAt(0));
            out.add(outTemp.toString());
        }
        for (String str:out){
            System.out.print(str);
            System.out.println();
        }


        sc.close();
    }
}
