package day29maps;

import java.util.*;

public class HashMap01 {

    /*
        1)Maps have key - value structure
        2)Keys are unique but values are not
        3)Every element in a Map is called as "Entry"
        4)All elements are called as "EntrySet"
        5)Key cannot be null in maps except "HashMap" but value can
        6)HashMaps put the entries in random order, because of that it is super fast
     */

    public static void main(String[] args) {

        //How to create a HashMap
        HashMap<String, Integer> stdAges = new HashMap();

        //How to put entries into a HashMap
        stdAges.put("Ali Can",13);
        stdAges.put("Tom Hanks", 46);
        stdAges.put("Brad Pitt", 55);
        stdAges.put("Angelina Jolie", 48);

        System.out.println(stdAges);//{Tom Hanks=46, Brad Pitt=55, Angelina Jolie=48, Ali Can=13}

        //How to get just keys from a Map
        Set<String> keys = stdAges.keySet();
        System.out.println(keys);//[Tom Hanks, Brad Pitt, Angelina Jolie, Ali Can]

        //How to get just values from a Map
        Collection<Integer> ages = stdAges.values();
        System.out.println(ages);//[46, 55, 48, 13]

        //Can I put null into key?
        //Yes you can use null "just" in HashMap key.
        stdAges.put(null,23);
        System.out.println(stdAges);

        //Can I put null into value?
        //Yes you can
        stdAges.put("Ajda Pekkan", null);
        stdAges.put("unknown", null);
        System.out.println(stdAges);

        //What happens if you use same key repeatedly?
        //Java accepts the final value for the key(overwriting)
        stdAges.put("Angeline Jolie", 23);
        System.out.println(stdAges);

        //How to get a value of a key?
        Integer tomAge = stdAges.get("Tom Hanks");
        System.out.println(tomAge);//46

        //If the key does not exist when you use get() method what happens?
        //It returns null for non-existing keys
        Integer unknownAge = stdAges.get("Abc xyz");
        System.out.println(unknownAge);//null

        //stdAges.getOrDefault("Abc xyz", 0); method returns the value of "Abc Xyz" if Abc Xyz exists among the keys.
        //method returns the values of second parameter if Abc Xyz does not exist among the keys.
        Integer unknownAge2 = stdAges.getOrDefault("Abc xyz", 0);
        System.out.println(unknownAge2);

        //I want to put an entry if it does not exist, if the entry exists I will not put it.
        stdAges.putIfAbsent("Cuneyt Arkin", 44);
        System.out.println(stdAges);//{null=23, Tom Hanks=46, Brad Pitt=55, Angelina Jolie=48, Angeline Jolie=23, Cuneyt Arkin=44, Ajda Pekkan=null, Ali Can=13, unknown=null}

        //How to update the value of a key
        stdAges.replace("Tom Hanks", 56);
        System.out.println(stdAges);//{null=23, Tom Hanks=56, Brad Pitt=55, Angelina Jolie=48, Angeline Jolie=23, Cuneyt Arkin=44, Ajda Pekkan=null, Ali Can=13, unknown=null}

        //How to update the value of a key after checking key and the existing value
        stdAges.replace("Tom Hanks", 56, 66);
        System.out.println(stdAges);

        //How to remove an entry from a Map
        stdAges.remove("unknown");
        System.out.println(stdAges);//{null=23, Tom Hanks=66, Brad Pitt=55, Angelina Jolie=48, Angeline Jolie=23, Cuneyt Arkin=44, Ajda Pekkan=null, Ali Can=13}

        stdAges.remove("Ajda Pekkan",null);
        System.out.println(stdAges);//{null=23, Tom Hanks=66, Brad Pitt=55, Angelina Jolie=48, Angeline Jolie=23, Cuneyt Arkin=44, Ali Can=13}

        Set<Map.Entry<String,Integer>> entries = stdAges.entrySet();

        for(Map.Entry<String,Integer> w : entries){

            System.out.print(w +  "! ");

        }





    }
}
