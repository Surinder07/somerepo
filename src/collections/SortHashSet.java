package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortHashSet {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(420);
        set.add(20);
        set.add(320);
        set.add(40);

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);
        System.out.println(list);

        // NOTE : You can not directly sort a hashset
        // but you can add it to another collection and then sort it
    }
}
