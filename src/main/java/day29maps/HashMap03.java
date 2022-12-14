package day29maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {

    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like to move it, move it do you like it?" ==> I=1, like=2, to=1, move=2, it=3, do=1, you=1
        String sentence = "I like to move it, move it do you like it?";

        //1st Step: Remove punctuation marks
        sentence= sentence.replaceAll("[\\p{Punct}]","");
        System.out.println(sentence);

        //2nd Step: Get the words from the sentence by using split() with space
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, to, move, it, move, it, do, you, like, it]


        HashMap<String,Integer> occurrenceMap = new HashMap<>();
                            //[I, like, to, move, it, move, it, do, you, like, it]
        for(String w: words){
            Integer numOfOccurrence = occurrenceMap.get(w);

            if(numOfOccurrence==null){
                occurrenceMap.put(w, 1);
            }else{
                occurrenceMap.put(w, numOfOccurrence+1);
            }
        }

        System.out.println(occurrenceMap);

        //Example 2: Type code to print the number of occurrences of letters in a sentence





    }
}
