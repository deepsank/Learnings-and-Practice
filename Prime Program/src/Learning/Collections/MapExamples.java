package Learning.Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExamples {


    public static void main(String[] args) {

        Map<Integer,String> map= new HashMap<>();
        map.put(12,"Stream");
        map.put(1,"PADDU");
        map.put(3,"SADDE");
        System.out.println( map.put(2,"SANKY"));  //null

        System.out.println(map.get(5));


    }
}
