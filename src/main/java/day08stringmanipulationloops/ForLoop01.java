package day08stringmanipulationloops;

public class ForLoop01 {

    public static void main(String[] args) {

        //for-loop
        //  Starting value  Condition  Increment
        for(int  i = 1    ; i<=5     ;  i++){
            System.out.println("Hi");
        }
        System.out.println("");
        //2nd Example: Type all integers from 11 to 44

        for (int i=11     ; i<=44   ; i++){
            System.out.print(i + " ");
        }

        //6th Example: Type all integers which are divisible by 4 and not divisible by 6
        //from 120 to 11 in the same line with a space between consecutive integers
        System.out.println();
        for (int i = 120 ; i>=11 ; i--){
            if(i%4==0 && i%6!=0){
                System.out.print(i+ " " );
            }
        }



    }
}
