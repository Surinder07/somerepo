package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // usage of for loop to iterate list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for (Integer element : list){
            System.out.println(element);
        }

 //       NOTE : it will throw concurrent modification exception if we try to remove while iterating
        // remove an element from the iterator...

        Iterator<Integer> iterator1 = list.iterator();

        while (iterator1.hasNext()){

            Integer next = iterator1.next();

            // this code will throw ConcurrentModificationException
            if(next == 20){
                list.remove(new Integer(20));
            }


        }


/*
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){

            Integer next = iterator.next();

            if (next == 20) {
                iterator.remove();
            }

        }*/
        System.out.println(list);






    }
}
