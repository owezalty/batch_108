package day15multidimensionalarraylists;

import java.util.Arrays;

public class denemeMulti02 {

    public static void main(String[] args) {

        //Example 1: Print the elements which have "a" from a 2 dimensional String array.
        // {{"learn","java","it"},{"is","easy"}};==> [learn, java, easy]

        String[][] arr = {{"learn","java","it"},{"is","easy"}};

        for(String[] w: arr){

            for(String z : w){

                if(z.contains("a")||z.contains("A")){
                    System.out.println(z);
                }

            }

        }





        //Example 2: Create an integer multidimensional array then find the sum of the elements
        int array[][] = {{3,4},{5,5,1},{4,5,1}};

        int sum = 0;
        for(int w[]: array){

            for(int t : w){
                sum += t;

            }
        }

        System.out.println(sum);




    }
}
