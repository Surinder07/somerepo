package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIteratorDemo {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator<Integer> listIterator = list.listIterator();

        // next iterator
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Previous iterator");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
