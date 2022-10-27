package day13arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays01 {

    /*
    When we create byte, short, int, long, float, double, char, boolean containers we can store just a single value
    in them.
    Sometimes we need to store multiple values in a single container.
    To be able to store multiple values Java created a new structure, its name is "Array".

    Note: Arrays are to store multiple data in single data type.
          You can not store different data types in an array.

     */

    public static void main(String[] args) {

        //How to create an Array
        String names[] = new String[5];

        //How to print an Array
        System.out.println(Arrays.toString(names));//[null, null, null, null, null]

        //How to put elements into an array
        names[1] = "Tom";
        names[names.length-1] = "Mark";
        names[0] = "Jim";
        names[2] = "Mary";
        names[3] = "Susan";
        System.out.println(Arrays.toString(names));

        //How to print a specific element in an Array
        System.out.println(names[3]);//Susan

        //Example 1: Create an integer array and print the sum of the first and the last elements on the console

        int arr[] = new int[7];

        System.out.println(Arrays.toString(arr));

        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 25;
        arr[3] = 14;
        arr[4] =17;
        arr[5] = 12;
        arr[6] = 14;
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0] + arr[arr.length-1]);



        //Example 2: Create a double array and find the sum of all elements in the array
        //[1.2, 2.3, 5.0, 4.51]

        double array[] = new double[3];
        array[0] = 1.2;
        array[1] = 2.3;
        array[2] = 5.0;
       // array[3] = 4.51;

        System.out.println(Arrays.toString(array));

        //1st Way:
        double sum=0;
        for(int i = 0; i<array.length; i++){
            sum +=array[i];
        }
        System.out.println(sum);

        //2nd Way; We will use for-each-loop for this task
        // for-each-loop can be used with Arrays and Collections

        double sum2 = 0;
        for(double w : array){
            sum2 +=w;

        }
        System.out.println(sum2);









    }
}
