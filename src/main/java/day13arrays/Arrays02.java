package day13arrays;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Create a String Array and print the elements in alphabetical order on the console in different lines

        String arr[] = new String[4];
        arr[0] = "Ali";
        arr[1] = "Zack";
        arr[2] = "Mert";
        arr[3] = "Jack";

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(String w: arr){
            System.out.println(w);
        }

        //Note: To get the number of characters from a String use "length()"
        //      To get the number of elements from an Array use "length"

        //Example 2: Create a String Array and print the elements whose length is less than 8
        //Short way to create an array and add elements into the array
        String cities[] = {"Tokyo", "Berlin", "Os", "Jacksonville", "London"};

        System.out.println(Arrays.toString(cities));

        for(String x : cities){
            if(x.length()<8){
                System.out.println(x);
            }
        }

        System.out.println("=====");
        //Example 3: Create a String Array and print the elements before "Tom"
        String students[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        System.out.println(Arrays.toString(students));

        for (String w : students){
            if(w.equals("Tom")){
                break;
            }
            System.out.println(w);

        }

        System.out.println("==========");
        //Example 4: Create a String Array and print the elements before "Tom" and "Tom"
        for(String z : students){
            System.out.println(z);

            if(z.equals("Tom")){
                break;
            }

        }
        System.out.println("");
        //Example 5: Create a String Array and print the elements different from "Tom"
        String students1[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w: students1){
            if(w.equals("Tom")){
                continue;
            }
            System.out.println(w);
        }







    }
}
