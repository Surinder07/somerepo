package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        // random order , it does not follow the order of insertion
        System.out.println(set);

        set.remove(10);
        System.out.println(set);

        //set.clear();
        System.out.println(set);

        set.isEmpty();


   //     Java, you can't use a normal for loop to directly iterate over a HashSet
        //     because it doesn't provide an index-based access like an array or a list.
        for (int i = 0; i < set.size(); i++) {
            System.out.println();
        }


        // for each loop can be used normally to loop through hashset
        for (Integer element : set){
            System.out.println(element);
        }


        // iterator can also be used

        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
