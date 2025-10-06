package a2ojLadder.ladder11;

import java.util.*;

public class Contest_2128_A_Recycling_Cylinder {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            List<Integer> aArr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                aArr.add(sc.nextInt());
            }
            int good = 0 ;
            aArr.sort(Comparator.naturalOrder());
            while (!aArr.isEmpty()){
                if(aArr.get(aArr.size()-1) > c){
                    good++;
                    aArr.remove(aArr.size()-1);
                }
                else {

                    aArr.remove(aArr.size()-1);
                    aArr.replaceAll(x -> x * 2);
                }
            }

            System.out.println(good);


        }

        sc.close();
    }
}
