package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays04 {

    public static void main(String[] args) {

        //Example 1: Find the maximum element in a two-dimensional array
        //           { {5, 0}, { -2, 4}, {65, -12, 23}}

        int arr[][]= { {5, 0}, { -2, 4}, {45, -12, 230}};

        //Suleyman Teacher Way:
        int max1 = arr[0][0];

        for(int w[] : arr){

            for (int z : w){

                //if(max1<z){
                //    max1 = z;
                //}
                max1 = Math.max(max1,z);//max() method selects the max. value of the given two numbers
            }
        }

        System.out.println(max1);




        //My Way:
        int sum = 0;
        for(int w [] : arr){
            sum+=w.length;
        }
        System.out.println(sum);
        int brr[] = new int[sum];
        System.out.println(Arrays.toString(brr));
        int idx = 0;
        for(int a[] : arr){
            for(int b : a){
                brr[idx] = b;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        int max = Integer.MIN_VALUE;
        for(int c : brr) {
            if (max < c) {
                max = c;
            }
        }
        System.out.println(max);


    }
}
