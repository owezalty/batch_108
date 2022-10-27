package day17listsandpassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //VERY IMPORTANT *** Interview QUESTION
        //Example 1: Type code to make all elements in a List unique
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(6);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        System.out.println(a);

        List<Integer> b = new ArrayList<>();

        for(Integer w: a){

            if(!b.contains(w)){
                b.add(w);
            }

        }

        System.out.println(b);

        //Example 2: Ask user to enter a letter, if the letter exists inside the list,
        //convert the element to "Got it"
        //otherwise add the element into the list
        //[A, K, R, S]==> User --> K ==> [A, Got it, R, S]
        //[A, K, R, S]==> User --> P ==> [A, K, R, S, P ]

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        String str = scanner.next().toUpperCase();

        ArrayList<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");


            if (c.contains(str)) {
                c.set(c.indexOf(str), "Got it!");//indexOf() method gives you the index of first occurence of a specific element
                c.add(str);
            }

            System.out.println(c);

        //indexOf() method returns -1 for non-existing elements

        List<String> d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int index = d.indexOf("Rs");
        System.out.println(index);

        int f = d.indexOf("xy");
        System.out.println(f);

        //Note: How can you understand the existence of a specific element in a List?
        //      i) Use indexOf() method if the result is "-1" it means the element does not exist.
        //      If the result is not "-1" it means the element exists.
        //      ii) Use contains() method;

        int lastIdx = d.lastIndexOf("Rs");//lastIndexOf() method gives you the index of last occurrence of a specific element
                                             //lastIndexOf() returns "-1" for non-existing elements
        System.out.println(lastIdx);


    }
}
