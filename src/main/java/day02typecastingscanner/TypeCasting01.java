package day02typecastingscanner;

public class TypeCasting01 {

    public static void main(String[] args) {

        //Example 1: Create 2 integer variables and 1 String variable.
        int num1 = 12, num2 = 14;
        String x = "Ali";

        System.out.println(num1 + num2 + x);

        System.out.println(x + num1*num2);

        /*
        Order of Operations in Math
         */

        //Type Casting
        /*
        small to big => Auto Widening
        Java can put small data types into large data types automatically
When you put small data type into a large data type, you are widening the small data type
AutoWidening

        big to small ones => Explicit Narrowing
         */

        //Auto Widening AW
        int m = 14;
        System.out.println(m);
        double d = m;
        System.out.println(d);

        /*
            Java does not put large data types into small data types.
         */
        //Explicit Narrowing
        int n = 15;
        byte b = (byte) n;

        long f  = 14L;
        int num01 = (int) f;








    }

}
