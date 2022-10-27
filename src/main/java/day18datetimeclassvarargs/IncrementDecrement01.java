package day18datetimeclassvarargs;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 12;
        int b = a++;//Post-Increment
        System.out.println(a);//13
        System.out.println(b);//12

        int x = 15;
        int y = x--;//Post Decrement
        System.out.println(x);//14
        System.out.println(y);//15

        int m = 21;//22
        int n = ++m;//22 ==> Pre Increment
        System.out.println(m);
        System.out.println(n);

        int t = 32;//31
        int u = --t;//31 //Pre Decrement
        System.out.println(t);
        System.out.println(u);

    }
}
