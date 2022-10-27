package day04nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    //Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



do {
    System.out.println("Enter the first number...");
    double firstNum = scanner.nextDouble();

    System.out.println("Enter the second number...");
    double secondNum = scanner.nextDouble();

    System.out.println("Enter the operation among +, -, *, /, %...");
    char operation = scanner.next().charAt(0);
    switch (operation) {
        case '+':
            System.out.println(firstNum + secondNum);
            break;
        case '-':
            System.out.println(firstNum - secondNum);
            break;
        case '*':
            System.out.println(firstNum * secondNum);
            break;
        case '/':
            System.out.println(firstNum / secondNum);
            break;
        case '%':
            System.out.println(firstNum % secondNum);
            break;
        default:
            System.out.println("You typed wrong character");


    }scanner.close();

}while (true);



    }
}
