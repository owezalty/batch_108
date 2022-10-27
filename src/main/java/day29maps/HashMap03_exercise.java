package day29maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03_exercise {

    public static void main(String[] args) {
        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like to move it, move it do you like it?" ==> I=1, like=2, to=1, move=2, it=3, do=1, you=1

        String str = "I like to move it, move it do you like it?";
        str = str.replaceAll("\\p{Punct}","");

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occurrenceMap = new HashMap<>();

        for(String w : words){

            Integer occurrence = occurrenceMap.get(w);

            if(occurrence==null){
                occurrenceMap.put(w, 1);
            }else{
                occurrenceMap.put(w, occurrence+1);
            }

        }

        System.out.println(occurrenceMap);
    }
}
