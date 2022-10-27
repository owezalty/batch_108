package day16lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1: Type code to remove the first occurrence of a specific element
        //from  a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]

        //To remove first occurrence Java created a method which is "remove()"
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        a.remove("Shoes");//remove() method can be used with element
        System.out.println(a);

        List<String> b = new ArrayList<>();
        b.add("Shoes");
        b.add("Laptop");
        a.removeAll(b);

        System.out.println(a);

        //Example 3: Type code to remove an element at a specific index
        //          ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"] remove the 5th element
        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("TV");
        c.add("Radio");
        c.add("Laptop");
        c.add("Shoes");
        c.add("Book");
        c.add("Shoes");

        c.remove(4);// remove() method can be used with the index
        System.out.println(c);

        //Example 4: Create an Integer list, then remove the 4th element
        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);

        e.remove(3);
        System.out.println(e);

        //Example 5: Create an Integer list, then remove the first occurrence of 4
        List<Integer> f = new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);
        f.add(4);

        f.remove(Integer.valueOf(4));
        System.out.println(f);

        //Note: If you use Integer list element directly inside the remove() method
        //like remove(4), Java will accept it as index, Because indexes are primitive
        //when you put 4, it will be accepted as primitive and it will be index.
        //Lists use non-primitives as list elements, therefore you have to convert
        //primitive int to Integer. To do that, use Integer.valueOf() method from Integer wrapper classes.

        //Note: You will see "valueOf()" method in many classes.
        //      valueOf() method changes the data type without changing the value

        //Example 6: Type code to check if a specific element exists in the list or not
        List<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);
        Double element = 5.44;

        //My Way:
        if(g.contains(element)){
            System.out.println(element + " is in the list");
        }else{
            System.out.println(element + " is not in the list");
        }
        //TechPro Way:
        boolean isExist = g.contains(element);
        System.out.println(isExist);

        //Example 7: Type code to change the element at index 1 to 9.99
        List<Double> h = new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        System.out.println(h);

        h.set(1,9.99);//set() method is for updating an element by using index.
        System.out.println(h);

        //Example 8: Type code to increase all salaries 10 percent in an Integer List
        //          [5000, 6000, 4500, 3900, 7200]
        List<Double> k = new ArrayList<>();
        k.add(5000.0);
        k.add(6000.0);
        k.add(4500.0);
        k.add(3900.0);
        k.add(7200.0);
        System.out.println(k);

        for(int i=0; i<k.size(); i++){

            k.set(i, k.get(i)*1.1);

        }

        //How to check if two lists are same or not
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //equals() method checks if the same elements are in the same position
        //If same elements are in the same position, equals() method returns true, otherwise it returns false.
        if(m.equals(n)){
            System.out.println("The lists are same");
        }else{
            System.out.println("The lists are not same");
        }

        //How to check if a list contains multiple elements
        //[12, 23, 32, 14, 24, 56] ==> Check if the list has 23, 56 and 24
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(32);
        list.add(14);
        list.add(24);
        list.add(56);

        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(24);
        list2.add(56);

        boolean exist = list.containsAll(list2);
        if(exist){
            System.out.println("The list has specific elements");
        }else{
            System.out.println("The list does not have specific elements");
        }








    }
}
