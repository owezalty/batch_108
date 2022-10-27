package day02typecastingscanner;

public class IfStatement01 {

    public static void main(String[] args) {

            /*
            Note : "==" in Java checks equality like "=" in Math

            Note: "!" in Java means "not"
            !true ==> false     !false ==> true     !!true ==> true
            "!=" means "does not equal to"
             */

        //Example 2: Type code to print "Divisible by 5" if the number can
        //be divided by 5, otherwise print "Not divisible by 5" if the
        //number cannot be divided by 5.

        //1st Way:
        int a = 17;

        if(a%5==0){
            System.out.println("Divisible by 5");
        }
        if(a%5!=0){
            System.out.println("Not divisible by 5");
        }
/*


        2nd Way: In the second way Java checked just 1 condition,
        //but in the first Java is checking 2 conditions.
        //If you type the code in the second way
        //i) You will prevent repetition
        ii) You will prevent repetition
        iii) Java will execute your code faster
 */

        int k = 17;
        if(k%5 ==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }




    }


}

