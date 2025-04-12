package Learning;
import java.util.Scanner;
public class UserInputThroughScanner {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input value:- ");
        int value = sc.nextInt();
        System.out.println("The entered value is:- "+value);
        sc.close();
    }
}
