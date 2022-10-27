package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        //Example 1: Print the elements which have "a" from a 2 dimensional String array.
        // {{"learn","java","it"},{"is","easy"}};

        String[][] arr = {{"learn","java","it"},{"is","easy"}};
        System.out.println(Arrays.deepToString(arr));

        for(String[] w : arr){

            for(String z : w){

                if(z.contains("a")){
                    System.out.println(z);
                }
            }
        }

        //Example 2: Create an integer multidimensional array then find the sum of the elements
        int brr[][] = {{12, 54}, {3, 2, 7}, { 21 }};
        int sum = 0;
        for(int[] w : brr){

            for(int a : w){

                sum += a;
            }
        }

        System.out.println(sum);




    }


}
