package day17listsandpassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class denemeLists01 {

    public static void main(String[] args) {

        //VERY IMPORTANT *** Interview QUESTION
        //Example 1: Type code to make all elements in a List unique
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(6);
        a.add(3);
        a.add(6);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();

        for(Integer w : a){
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
        String letter = scanner.next();

        ArrayList<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        if(c.contains(letter)){
            c.set(c.indexOf(letter), "Got it!");
        }else{
            c.add(letter);
        }
        System.out.println(c);


        //indexOf() method returns -1 for non-existing elements

        List<String> d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");


    }
}
