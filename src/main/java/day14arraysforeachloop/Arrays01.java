package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0, 0, 0]

        int arr[] = {0, 2, 3, 0, 12, 0};

        int brr[] = new int[arr.length];

        int idx = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]!=0){

                brr[idx] = arr[i];

                idx++;
            }

        }
        System.out.println(Arrays.toString(brr));

        //Example 2: Type code to check if a specific element exists in an array or not
        //          int crr[] = {-12,23,5}; check if 23 exists in the array or not

        int crr[] = {-12,12,5,34,23,23};

        int counter = 0;
        int element = 23;

        for(int w: crr){

            if(w==element){
                counter++;
            }
        }

        if(counter==0){
            System.out.println("It does not exist");
        }else{
            System.out.println("There are " + counter + " times " + element);
        }








    }
}
