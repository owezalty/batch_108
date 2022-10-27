package day02typecastingscanner;


public class WrapperClass01 {

    public static void main(String [] args){

        /*
        Wrapper Class
        Non-Primitives have "methods" together with values.
        We can do many actions by using "methods", this is good.
        But Primitives do not have any "methods" because of that we cannot do any actions in primitives
        Java created a new structure which has "primitive value" and "methods" together
        that new structure is called "Wrapper Class"


         */

        int i = 12;// There is no method
        Integer k = 13; //There are many methods

        char c = 'A';
        Character d = c;

        //Autoboxing : To convert "primitive" to "wrapper class"
        byte b = 23;
        Byte wb = b;


        //Unboxing : To convert "wrapper class" to its "primitive data"

        Short ws =34;
        short s = ws;

        //How to get the min and max values
        Integer max = Integer.MAX_VALUE;
        System.out.println(max);

        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);



    }

}
