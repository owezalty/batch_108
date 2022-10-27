package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ReviewArrays02 {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print date like
        //"Month: 09        Day: 20         Year: 2022"

        String date = "09/20/2022";

        //split() method returns Array
        String dates[] = date.split("/");
        System.out.print("Month: " + dates[0] + " Day:  " + dates[1] + "  Year:  " + dates[2]);

        System.out.println("");
        //Example 2: Get string from user and type code to find the number of words in the String.
        //           "I like to move it, move it" ==> 7
        String str = "I like to move it, move it";
        String words[] = str.split(" ");
        System.out.println(words.length);


        //Example 3: Count the number of words starts with "a" in the String
        String s = "Ahmet brought some people to an Arsenal amateur match";

        String arr[] = s.split(" ");

        int count = 0;
        for(String w : arr){
            if(w.startsWith("a")|| w.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);


        //Example 4: Type code to find the longest word in the sentence

        String sentence = "Ronaldinho scored a goal in the match";
        String word[] = sentence.split(" ");

        Arrays.sort(word, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(word));
        System.out.println("The longest word is: " + word[word.length-1]);

        Arrays.sort(word, Comparator.comparing(String::length).reversed());
        System.out.println("The longest word is: " + word[0]);



    }
}
