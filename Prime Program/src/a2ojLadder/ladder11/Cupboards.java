package a2ojLadder.ladder11;

import java.util.Scanner;

public class Cupboards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l1Total = 0;
        int l0Total = 0;
        int r1Total = 0;
        int r0Total = 0;
        int result = 0;
        for(int i=0;i<n;i++){
            int lTemp = sc.nextInt();
            int rTemp = sc.nextInt();
            if(lTemp==0){
                l0Total++;
            }
            else {
                l1Total++;
            }
            if(rTemp==0){
                r0Total++;
            }
            else {
                r1Total++;
            }
        }

        if(l1Total>l0Total){
            result+=l0Total;
        }
        else{
            result+=l1Total;
        }

        if(r1Total>r0Total){
            result+=r0Total;
        }
        else{
            result+=r1Total;
        }

        System.out.println(result);
    }
}
