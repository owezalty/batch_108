package day30maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {

    /*
    todo: We have for-loop, while-loop, do-while-loop and for-each=loop
        for-each-loop is better to use because it is easier to use and its performance is better than the other
        performance means less time complexity. Works faster
        But by using for-each-loop it is impossible to remove or modify a collection
        Therefore, Java created a new structure to be able to remove some elements from a Collection
        or modify a collectionThe new structure is called "Iterators".
        There are 2 iterators:
        i) Iterator: Has one direction, from right to left.
        ii) List Iterator: Has two directions, from right to left and from left to right.
        "for-each-loop" and "iterators" have same performance but iterators are the best to remove elements or to modify elements in a collection
     */
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);


        //Example 1: Update every element by putting "!" mark to the end
        //1st Way: for-each loop could not update the collection without using set() method.
        for(String w: list1){

            list1.set(list1.indexOf(w), w + "!");
        }

        System.out.println(list1);

        //2nd Way: Use iterator
        Iterator<String> itr1 = list1.iterator();

        while (itr1.hasNext()){

            String el = itr1.next();

            itr1.remove();
        }

        System.out.println(list1);



    }
}
