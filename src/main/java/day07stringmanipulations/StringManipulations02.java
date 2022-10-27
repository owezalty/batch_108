package day07stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String str = "Java is OOP";

        String result1 = str.replace('O', '*');
        System.out.println(result1);

        String result2 = str.replace("Java", "*");
        System.out.println(result2);

        String st = "Ali is 13 years old, I think he seems _15!.";
        System.out.println(st);

        //Example 1: Change all digits to "*" in the given String
        String newSt = st.replaceAll("[aeiou]","*");
        System.out.println(newSt);
        /*
        Regex means "Regular Expression2
        Regex represents a group of data.
        All digits ==> [0-9] [\\d: all digits] [\\D: except digits]
        All lowercase ==> [a-z]
        All uppercase ==> [A-Z]
        All lowercase and uppercase ==> [a-zA-Z]
        All lower upper cases and digits ==> [a-zA-Z0-9]
        Some multiple characters like a, e, i, o, u : [aeiou]
        All spaces ==> [\\s] [\\S : Except spaces]

        All characters different from digits: [^0-9]
        All characters different from letters :[^a-zA-Z]
        All characters different from vowels : [^aeiou]
         */

        /*
        Example 2: Type code to check if a password is valid or not for the following conditions;
                   Password must have at least 8 characters diff from space
                   Password must have at least 1 symbol
         */

        String pwd = "!1 a23 b4 7es";

        //Password must have at least 8 characters diff from space
        boolean firstRule = pwd.replaceAll("[\\s]", "").length()>7;

        boolean secondRule = pwd.replaceAll("[\\s]","").replaceAll("[a-zA-Z0-9]","").length()>=1;
        //Following can be used to remove space as well, but it is difficult to notice
        //space we removed, because of that above is better to use
        //boolean secondRule = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>=1;
        System.out.println(pwd.replaceAll("[a-zA-Z0-9 ]",""));

        System.out.println("Is the password valid : " + (firstRule && secondRule));



    }
}
