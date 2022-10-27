package day08stringmanipulationloops;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy, Java is OOP";
        System.out.println(str);

        String str1 = str.replaceFirst("Java", "Apex");
        System.out.println(str1);

        String str2 = str.replace("Java","Apex");
        System.out.println(str2);

  /*
            Example 1:  String shirtPrice = "$12.99";
                        String bookPrice = "$35.99";
                        Type code to find the sum of the shirt and book prices.
         */
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String newShirt = shirtPrice.replace("$","");
        String newBook = bookPrice.replace("$","");

        //valueOf() method converts String data type to numeric data type.
        //Note; to be able to use valueOf() method, String must be in numeric format
        Double shirtDouble  = Double.valueOf(newShirt);
        Double bookDouble = Double.valueOf(newBook);

        System.out.println("Total price is : $" + (shirtDouble + bookDouble));

        /*
        Example 2: Swap the integers
                a = 12  b = 23 =>   a=23    b= 12
         */

        int a = 12, b=23, temp;
        System.out.println(a + "-" + b);
        //1st Way:
        temp = b;
        b = a;
        a = temp;
        System.out.println(a + "-" + b);

        //2nd Way: Without using third variable
        int x =14, y= 24;
        System.out.println(x + "-" + y);
        y = y-x;
        x = y+x;
        y = x-y;
        System.out.println(x + "-" + y);










    }
}
