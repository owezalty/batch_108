package day12variabletypesstaticblockarrays;

public class Runner {

    public static void main(String[] args) {

        //To access a non-static variable you have to create object
        VariableTypes01 obj = new VariableTypes01();

        //To access a static variable no need to create object
        //Just class name is enough
        System.out.println(obj.name);
        System.out.println(VariableTypes01.age);

        System.out.println(obj.add(3,5));

        System.out.println(obj.multiplication(2,2));

        VariableTypes01.multi(4,4);

    }
}
