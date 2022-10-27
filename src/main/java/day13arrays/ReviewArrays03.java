package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewArrays03 {

    public static void main(String[] args) {

        //Example 1: Let user enter student names into the application
        // (Create an Array together with the user)

        Scanner scan = new Scanner(System.in);

        //1st Step: Create an Array

        System.out.println("Enter number of students you want to enter");
        int numOfStudents = scan.nextInt();

        String names[] = new String[numOfStudents];

        for(int i=0; i<numOfStudents; i++){
            System.out.println("Enter the " + (i+1) + ". student name");
            String nameOfStud = scan.next();

            if(!nameOfStud.equalsIgnoreCase("Q")){
                names[i] = nameOfStud;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(names));








    }
}
