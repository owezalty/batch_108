package day06stringmanipulations;

import java.util.Arrays;

public class StringManipulations01 {

    public static void main(String[] args) {
        //1st Example: Print the first and the last character of the given String on the console. "Java is easy" ==>
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a sentence");
//        String str = scanner.nextLine();
//
//        //1st Way: By using charAt();
//        char firstChar = str.charAt(0);
//        char lastChar = str.charAt(str.length()-1);
//        System.out.println(firstChar+ lastChar); //195 => Note: If you use "char" data type in a math operation, Java uses ASCII values not characters
//        System.out.println("" + firstChar + lastChar);//Jy => Note: When you put "" at the beginning it will be concatenation operation, you will get String
//
//        //2nd Way: By using substring()
//        String firstCharacter = str.substring(0,1);
//        String lastCharacter =str.substring(str.length()-1);
//        System.out.println(firstCharacter + lastCharacter);

        //2nd Example: Print just the animal names from the String: "I like lion, horse, laptop and cat"
        String animals = "I like lion, horse, laptop and cat";
        String lion = animals.substring(7,11);
        String horse = animals.substring(13,18);
        String cat = animals.substring(31);
        System.out.println(lion + " " + horse + " " + cat);

        //3rd Example: Type code to get initials of the first name and the last name of a given name.

        String name = "Tom Hanks";
        String firstInitial = name.substring(0,1);

        //1st Way:
        String initialLast = name.split(" ")[1].substring(0,1);

        //2nd Way:
        String lastInitial = name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2);
        System.out.println(firstInitial+initialLast);

        //4th Example: Type code to find the number of words in a String: "I like to move it, move it" ==> 7
        String str = "I like to move it, move it";

        //1st Way:

        //Note: If you use "length" after split() method do not use parenthesis
        int numOfWords = str.split(" ").length;
        System.out.println(numOfWords);
        //2nd Way:
        String[] words = str.split(" ");
        System.out.println(words.length);


    }
}
