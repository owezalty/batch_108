package day07stringmanipulations;

public class StringManipulations04 {

    public static void main(String[] args) {

        String str = "       ";

        boolean isEmpty = str.isEmpty();//isEmpty() method returns true if the String does not have any character
                            //str.length==0; and isEmpty have same meaning but to check if a String is empty using isEmpty() is preferable
        System.out.println(isEmpty);

        boolean isBlank = str.isBlank();//isEmpty("")==true, isEmpty(" ")==> false
                    //isEmpty("")==true, isEmpty(" ")==> true
        System.out.println(isBlank);

        //Example 1: Check if a String has just letters and spaces in it
        String s = "Learn Java earn money!";

        boolean result = s.replaceAll("[a-zA-Z ]","").isEmpty();

        System.out.println(result);

        //Example 2: Check SSN for the following rules:
        // 1) It must have just digits
        // 2) It must have 9 digits
        String ssn = "123456789";
        // 1) It must have just digits
        boolean firstRule = ssn.replaceAll("[\\d]", "").isEmpty();
        // 2) It must have 9 digits
        boolean secondRule = ssn.length()==9;
        if (firstRule && secondRule){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }


    }
}
