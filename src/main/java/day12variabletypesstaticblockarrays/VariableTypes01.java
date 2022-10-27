package day12variabletypesstaticblockarrays;

public class VariableTypes01 {

    //name is "Non-static" or "object" or "instance" variable
    public String name;

    //"age" is "static" or "class" variable
    public static int age = 13;

    //local variable
    //If you create a variable inside a method it is local variable

    //Note: When you create a "local variable" it is mandatory to assign a value.
    //      If you try to use a local variable without assigning a value it complains

    //Note: Local variables can be used just inside the method
    //      If you try to use it outside the method it will give error.

    //Note: If the return type is different from "void"
    //you have to use "return" keyword inside the method

    //Note: When you create a method use the "return" keyword in the last line
    //      You cannot type any code after "return" keyword
    public int add(int a, int b){
        int x = 0;//local variable
        return a+b;
    }

    //Create a method to do multiplication

    public int multiplication(int x, int z){
        String s = "Java";//local variable
        int sum = x*z;
        return sum;
    }

    public static void multi(int k, int m){
        System.out.println(k*m);
    }



}
