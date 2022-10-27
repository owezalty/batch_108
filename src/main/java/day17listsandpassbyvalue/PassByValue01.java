package day17listsandpassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
        1) When you use a variable inside a method, Java creates the copy of
        the variable and uses it inside the method.
            Java does that to protect the original value of the variables.
            If in every method usage, the value changes, it creates very big problems

          2) Some programming languages do not use "Pass by value" they use "Pass by reference"
          If you use "Pass by reference" original will change in every method usage.
         */
        int price = 20;
        System.out.println(price);

        price = change(price);
        System.out.println(price);

    }

    public static int change(int a){

        return a*2;
    }

}
