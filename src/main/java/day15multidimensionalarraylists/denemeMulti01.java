package day15multidimensionalarraylists;

import java.util.Arrays;

public class denemeMulti01 {

    public static void main(String[] args) {

        //How to create multidimensional array in short way:
        String brr[][] = {{"Tom" , "Jim"}, {"Angie"},{"Carl", "Chris", "Ali"}};

        System.out.println(Arrays.deepToString(brr));

        //How to print a specific element from a multidimensional array
        System.out.println(brr[2][1]);
        System.out.println(brr[0][0]);

        //How to print a specific element from outer array
        System.out.println(Arrays.toString((brr[2])));

        //Example 1: Type code to find the number of elements in a multidimensional array
        String crr[][] = {{"Tom" , "Jim", "Mert"}, {"Angie"},{"Carl", "Chris", "Ali"}};

        int sum = 0;

        for(String w[] : crr){

            sum+= w.length;

        }

        System.out.println(sum);

    }
}
