package day13arrays;

import java.util.Arrays;

public class ReviewArrays01 {

    public static void main(String[] args) {

        //How to create an Array
        String arr[] = new String[5];

        //How to print an Array
        System.out.println(Arrays.toString(arr));

        //How to put elements into an array
        arr[0] = "Mark";
        arr[1] = "Tom";
        arr[2] = "Mehmet";
        arr[3] = "Ali";
        System.out.println(Arrays.toString(arr));

        //How to print a specific element in an Array
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        //Example 1: Create an integer array and print the sum of the first and the last elements on the console
        int arr02[] = new int[4];
        arr02[0] = 15;
        arr02[1] = 13;
        arr02[2] = 18;
        arr02[3] = 25;
        System.out.println(arr02[0] + arr02[arr02.length-1]);



        //Example 2: Create a double array and find the sum of all elements in the array
        //[1.2, 2.3, 5.0, 4.51]
        double doubleArray[] = new double[4];
        doubleArray[0] = 1.2;
        doubleArray[1] = 2.3;
        doubleArray[2] = 5.0;
        doubleArray[3] = 4.51;
        //1st Way:

        double sum =0;
        for(int i = 0; i<doubleArray.length; i++){
            sum = sum + doubleArray[i];
        }
        System.out.println(sum);


        //2nd Way; We will use for-each-loop for this task
        // for-each-loop can be used with Arrays and Collections

        double sumOfNumbers = 0;
        for(double z : doubleArray){

            sumOfNumbers += z;

        }

        System.out.println(sumOfNumbers);


    }


}
