package misc.pointers;

import java.util.HashMap;

public class Pointer {
    public static void main(String[] args) {
        //lesson on pointers
        //The concept on pointers will be used extensively throughout the lessons on data structures.
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        map3.put("value", 57);
        map2 = map3;

        System.out.println("map3 = " + map3);
        System.out.println("map2 = " + map2);
        map1 = map2;

        //What happens to the original value of map1 map1.put("value", 11);?
        //Java cleans up the unassigned value through a process called garbage collection.
        System.out.println("map1 = " + map1);
    }
}
