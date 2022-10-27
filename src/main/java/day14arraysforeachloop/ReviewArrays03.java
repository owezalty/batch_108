package day14arraysforeachloop;

import java.util.Arrays;

public class ReviewArrays03 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in an Array or not
        String str[] = {"Ali", "Tom", "Carl", "Angie"};
        System.out.println(Arrays.toString(str));
        //1st way:

        String specificElement = "Tom";

        int counter=0;

        for(String w : str){
            if(w.equalsIgnoreCase("Tom")){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(specificElement + " exists in the array");
        }else{
            System.out.println(specificElement + " does not exist in the array");
        }



        //2nd Way: We will use binarySearch() method

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        int idx = Arrays.binarySearch(str, "Tom");

        System.out.println(idx);


    }
}
