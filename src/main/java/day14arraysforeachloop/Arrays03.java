package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in an Array or not
        String str[] = {"Ali", "Tom", "Carl", "Angie"};

        //1st way:
        String name = "Ali";
        int counter =0;

        for(String w: str){

            if (w.equalsIgnoreCase("Ali")){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(name + " exists in array");
        }else{
            System.out.println(name + " does not exist in the array");
        }

        //2nd Way: We will use binarySearch() method
        //         i) If the element exists binarySearch() method returns the index of the element

        Arrays.sort(str);
        System.out.println(Arrays.binarySearch(str, "Carl"));



    }
}
