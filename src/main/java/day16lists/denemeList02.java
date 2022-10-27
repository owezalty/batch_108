package day16lists;

import java.util.ArrayList;
import java.util.List;

public class denemeList02 {

    public static void main(String[] args) {

        //Example 1: Type code to remove the first occurrence of a specific element
        //from  a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book", "Shoes"]

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        a.remove("Shoes");
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
        c.remove(4);
        System.out.println(c);

        List<String> list01 = new ArrayList<>();
        list01.add("Shoes");
        c.removeAll(list01);
        System.out.println(c);


        //Example 4: Create an Integer list, then remove the 4th element
        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);

        e.remove(e.size()-1);
        System.out.println(e);



        //Example 5: Create an Integer list, then remove the first occurrence of 4
        List<String> f = new ArrayList<>();
        f.add("12");
        f.add("4");
        f.add("13");
        f.add("25");
        f.add("432");
        f.add("4");
        System.out.println(f);

        f.remove(String.valueOf(4));
        System.out.println(f);

//        f.remove(Integer.valueOf(4));
//        System.out.println(f);



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
        Double element = 5.99;

        boolean isExist = g.contains(element);
        System.out.println(isExist);

        //Example 7: Type code to change the element at index 1 to 9.99
        List<Double> h = new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);

        h.set(0, 9.99);
        System.out.println(h);

        //Example 8: Type code to increase all salaries 10 percent in an Integer List
        //          [5000, 6000, 4500, 3900, 7200]
        List<Double> k = new ArrayList<>();
        k.add(5000.0);
        k.add(6000.0);
        k.add(4500.0);
        k.add(3900.0);
        k.add(7200.0);


        for(int i=0; i<k.size(); i++){
            k.set(i, k.get(i)*1.1);
        }
        System.out.println(k);

        //How to check if two lists are same or not
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('z');
        n.add('z');

        boolean isEqual = m.equals(n);
        if(isEqual==true){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
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
        list2.add(56);
        list2.add(24);

        if(list.containsAll(list2)){
            System.out.println("List has all expected elements");
        }else{
            System.out.println("The list does not have all expected elements");
        }


    }
}
