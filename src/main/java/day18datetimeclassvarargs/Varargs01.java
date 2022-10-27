package day18datetimeclassvarargs;

public class Varargs01 {

    /*
        1) If you want to make number of parameters flexible in a method, use "varargs"
        2) To create a varargs " Data Type + ... + space + a name for the varargs"
        3) "Varargs" use Arrays behind. When you work with varargs you may think you are working with Arrays.
        4) "Varargs" can accept zero or more elements
        5) Can I use another regular parameter after "varargs"? No, impossible. We can't use any parameter after varargs.
        Because varargs cannot be made full, second parameter will be unreachable, it will give error.
        "Varargs" must be last parameter everytime.

        6) We can use another parameter before "varargs".

        7) Can I use multiple "varargs" parameter in a method?
            No, it is impossible. We cannot go to the second parameter. Varargs must be the last parameter in a method

     */

    public static void main(String[] args) {

        System.out.println(addition(3,5,2,3,45,5));
        add(5,5);


    }


    //Create a method adds n integers

    public static int addition(int b, int ...a){
    int sum = 0 ;

    for(int w : a){

        sum = sum+w;
    }
        return sum;
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }




}
