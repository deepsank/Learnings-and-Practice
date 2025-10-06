package a2ojLadder.ladder11;

import java.util.*;

import static java.util.Arrays.binarySearch;

public class Contest2126_C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] heightArray = new int[n];
            int max = 0;

            TreeSet<Integer> heightSet = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                heightArray[i] = sc.nextInt();
                max = Math.max(max, heightArray[i]);
                heightSet.add(heightArray[i]);
            }

            int waterLevel = 1;
            int currHeight = heightArray[k - 1];
            boolean success = false;

            while (currHeight < max) {
                int target = currHeight + (currHeight - waterLevel + 1);
                Integer next = heightSet.floor(target); // Greatest ≤ target

                if (next == null || next <= currHeight) {
                    break; // Cannot move forward
                }

                waterLevel += (next - currHeight);
                currHeight = next;
            }

            if (currHeight >= max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

//        while(t-->0){
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int heightArray[] = new int[n];
//            int max=0;
//            for (int i = 0; i < n; i++) {
//                heightArray[i] = sc.nextInt();
//                if(max<heightArray[i]){
//                    max = heightArray[i];
//                }
//            }
//            int waterLevel = 1;
//            int currHeight = heightArray[k-1];
////            Arrays.sort(heightArray);
//            Set<Integer> heights = new HashSet<>();
//            for (int i = 0; i < n; i++) {
//                heightArray[i] = sc.nextInt();
//                max = Math.max(max, heightArray[i]);
//                heights.add(heightArray[i]);
//            }
//            while (currHeight<max) {
//                int elementSeach = currHeight + currHeight - waterLevel + 1;
//                while (elementSeach > currHeight) {
//                    if (!heights.contains(elementSeach)) {
//                        elementSeach--;
//                    } else {
//                        break;
//                    }
//                }
//                if (elementSeach>currHeight){
//                    waterLevel = waterLevel+elementSeach - currHeight;
//                    currHeight = elementSeach;
//                }
//                else if(elementSeach==currHeight){
//                    break;
//                }
//
//
//            }
//            if(currHeight==max){
//                System.out.println("YES");
//
//            }
//            else {
//                System.out.println("NO");
//            }
//        }
    }
}
