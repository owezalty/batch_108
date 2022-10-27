package day08stringmanipulationloops;

public class ForLoop02 {

    public static void main(String[] args) {

        //1st Example: Put "*" between 2 consecutive characters and to the end in a String.
        //For example ==> Java ==> J*a*v*a*


        String str = "Java";
        for(int i=0; i<str.length(); i++){
            String strnew = str.charAt(i)+ "*";
            System.out.print(strnew);
        }

        System.out.println();
        //2nd Example: Type code to print unique characters in a String. Hello => Heo

        //1st Way:
        String s = "Hello";
        for (int i=0 ; i<s.length(); i++){
            int firstOccurenceIdx = s.indexOf(s.charAt(i));
            int lastOccurenceIdx  = s.lastIndexOf(s.charAt(i));
            if (firstOccurenceIdx==lastOccurenceIdx){
                System.out.print(s.charAt(i));
            }

        }



    }
}
