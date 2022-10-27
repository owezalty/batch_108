package day15multidimensionalarraylists;

import java.util.Arrays;

public class denemeMulti03 {

    public static void main(String[] args) {

        //Example 1: Convert multidimensional array to one dimensional array
        // {{"learn","java","it"},{"is","easy"}} ==> {"learn","java","it","is","easy"}

        String[][] arr = {{"learn","java","it"},{"is","easy"}};

        //1st Step: Find the total number of elements in the multidimensional array
        int sum = 0;

        for(String []w : arr){

            sum+=w.length;
        }
        System.out.println(sum);

        String[] brr = new String[sum];

        int idx = 0;

        for(String []w : arr){

            for(String z : w){

                brr[idx] = z;
                idx++;
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(brr));


    }
}
