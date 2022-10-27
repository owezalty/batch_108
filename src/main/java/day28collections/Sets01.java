package day28collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /*
        1) Sets are for storing multiple non-primitive data in the same data type.
        2) Sets are for storing unique data.
        3) There are 3 different Sets: i)HashSet: Uses "Hashing Technique"
                                                  It does not put the elements in any order.
                                                  HashSet accepts just a single "null" as element
                                       ii)LinkedHashSet: Puts the elements in "Insertion Order"
                                       iii)TreeSet: Puts the elements in "Natural Order"
                                       (Ascending Order in numbers, Alphabetical Order in Strings)
                                            TreeSet is so slow in adding elements.
        Question: If you need to store "unique elements" in "natural order"
        which collection do you use?
        Answer: TreeSet
        Question: As you know, TreeSet is so slow in adding elements,
        how can you improve your code?
        i) Create a HashSet
        ii) Add elements into the HashSet
        iii) Convert HashSet to TreeSet
     */

    public static void main(String[] args) {

        //HashSet
        HashSet<String> emails = new HashSet<>();
        System.out.println(emails);//[]

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");//When you try to add repeated data, Java does not give
        //any error and last data will be overwritten to the previous data
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.remove("Fig");
        System.out.println(emails);

//        emails.clear();//Deletes all elements from the HashSet
//        System.out.println(emails);//[]

        //When you use clone() method, you can make data type "Object"
        Object emails2 = emails.clone();
        System.out.println(emails2);

        HashSet<String> emails3= (HashSet<String>) emails.clone();
        System.out.println(emails3);

        //LinkedHash Set:
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        ssn.add(null);
        System.out.println(ssn);


        //TreeSet
        Long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();
        //1st Way: Using TreeSet

        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
//        try {
//            nums1.add(null);//Tree Set does not accept "null" as element
//        }catch (NullPointerException e){
//            System.out.println("Tree set does not accept " + e.getMessage());
//        }
        //nums1.add(null);//Tree Set does not accept "null" as element
        System.out.println(nums1);//[-5, 5, 17, 23, 41, 67]

        Long middle = LocalTime.now().toNanoOfDay();

        //2nd Way: Using HashSet
        HashSet<Integer> nums2 = new HashSet<>();

        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);

        TreeSet<Integer> treeSet = new TreeSet<>(nums2);
        //treeSet.addAll(nums2);
        System.out.println(treeSet);

        Long ending = LocalTime.now().toNanoOfDay();


        System.out.println("1st Way: " + (middle-starting));
        System.out.println("2nd Way: " + (ending-middle));
    }
}
