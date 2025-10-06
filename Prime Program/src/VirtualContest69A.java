import java.util.Scanner;

public class VirtualContest69A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int xTotal = 0;
        int yTotal = 0;
        int zTotal = 0;
        while(t-- > 0){
            xTotal+= sc.nextInt();
            yTotal+= sc.nextInt();
            zTotal+= sc.nextInt();
        }

        if(xTotal==0 && yTotal==0 && zTotal==0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
