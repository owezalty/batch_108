package day06stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Type code to see the order number of the first occurrence of the character 'a'
        //"I want to learn Java"

        String str = "I want to learn Java";
        int firstOccurrenceIdx = str.indexOf('a');
        System.out.println(firstOccurrenceIdx + 1);

        //Example 2: Type code to see the order number of the first occurrence of "Java"
        // "I like to study Java, learn Java, earn money";

        String str2 = "I like to study Java, learn Java, earn money";
        int idx = str2.indexOf("Java");
        System.out.println(idx + 1);

        //Example 3: Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios

        String word = "I like to study";

        System.out.println(word.indexOf('a')==-1 ? "There is no a" : "There is a");


        if(word.indexOf('a')==-1){
            System.out.println("There is no a");
        }else {
            System.out.println("There is a");
        }

        //Example 4: Type code to find the order number of last occurrence of "Java" in a sentence
        String str3 = "I like to study Java, learn Java, earn money";
        int lastOccurrenceIdx = str3.lastIndexOf("Java")+1;
        System.out.println(lastOccurrenceIdx);

        //Example 5: Type code to check if a character is unique in a String or not
        // "Hello" H is unique for example
        String m = "Hello";
        if(m.indexOf('l')==-1){
            System.out.println("The character does not exist");

        }else if(m.indexOf('l')==m.lastIndexOf('l')){
            System.out.println("The character is unique");
        }else {
            System.out.println("The character is not unique");
        }


      String result = m.indexOf('l')==-1? "The character does not exist": m.indexOf('l')==m.lastIndexOf('l') ? "The character is unique" : "The character is not unique";
       System.out.println(result);



    }
}
