package Learning.Collections;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3); // creates a fixed-size List backed by the original array
//        list.add(4); // Gives error as cannot add
        list.set(1,4);  // Can set an index
        System.out.println(list.subList(0,1)); // [1] -- Returns a view of the portion of this list between
        // the specified fromIndex, inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the returned list is empty.)
        System.out.println(list);
        List<Integer> list2 = List.of(1,2,3);//This creates an immutable list.
//        list2.set(1,4);  // Gives error as it's an immutable list
        System.out.println(list2.get(2));  // 3

        List<Integer> list3 = new ArrayList<>(3);
        list3.add(65);
        list3.add(43);
        System.out.println(list3.size());   //2
        list3.add(66);
        System.out.println(list3.size());   //3
        list3.add(45);
        System.out.println(list3.size());   //4
        list3.remove(Integer.valueOf(1));
        System.out.println(list3);  // [65, 43, 66, 45]
        list3.remove(1);
        System.out.println(list3);  // [65, 66, 45]

        System.out.println(list3.contains(65));  // true

        Object object = list3.toArray();
        System.out.println(object.toString());  // [Ljava.lang.Object;@8efb846
        System.out.println(list3.toArray(new Integer[0]));  // [Ljava.lang.Integer;@2a84aee7
        list3.sort(null);
//        Collections.sort(list3);
        System.out.println(list3); // [45, 65, 66]

        //Comparator
        List<String> fruits = Arrays.asList("apple","banana","mango","guava","pineapple","grapes","guavaa");
        fruits.sort(null);
        System.out.println(fruits);  // [apple, banana, grapes, guava, guavaa, mango, pineapple]
        long startingTime = System.currentTimeMillis();
        fruits.sort((a,b)-> {   // Comparator -- through lambda, compare() method;

            char[] a1= a.toCharArray();
            char[] b1 = b.toCharArray();
            int i=0;
            while(i<a.length() && i<b.length()) {
                if (b1[i] != a1[i]) {
                    return b1[i] - a1[i];
                }
                i++;
            }
                    return b.length()-a.length();
        }
        );
        System.out.println("MilliSeconds it took:-- "+ (System.currentTimeMillis()-startingTime));
        System.out.println(fruits); // [pineapple, mango, guavaa, guava, grapes, banana, apple]

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Deepak");
        linkedList1.add("Sanket");
        linkedList1.add("Deepti");
        System.out.println(linkedList1.get(1)); // Sanket
        linkedList1.addLast("Jeetu");
        linkedList1.addFirst("Pinku");
        linkedList1.add("Chhotu");
        linkedList1.add("Champu");
        linkedList1.add("Shanky");
        System.out.println(linkedList1);  // [Pinku, Deepak, Sanket, Deepti, Jeetu, Chhotu, Champu, Shanky]
        linkedList1.remove();  // returns and removes HEAD of the list
        System.out.println(linkedList1); // [Deepak, Sanket, Deepti, Jeetu, Chhotu, Champu, Shanky]
        linkedList1.remove(4);   //
        System.out.println(linkedList1); // [Deepak, Sanket, Deepti, Jeetu, Champu, Shanky]
        linkedList1.remove("Champu");
        System.out.println(linkedList1); // [Deepak, Sanket, Deepti, Jeetu, Shanky]


        System.out.println(sum(Arrays.asList(1,2.2,3.4,3)));
    }

    public static double sum(List<? extends Number> numbers){
        double sum=0;
        for (Number n : numbers){
            sum+=n.doubleValue();
        }
        return sum;
    }
}
