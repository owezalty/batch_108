package day18datetimeclassvarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class denemeDateTime {

    public static void main(String[] args) {

        //Type the code that find out how many months Ali lived. Dob of Ali is 4th of June 1997

        //LocalDate dob = LocalDate.of(1997, Month.JUNE,4);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        //long numOfMonths = ChronoUnit.MONTHS.between(dob, currentDate);
        //System.out.println(numOfMonths);

        LocalDate entranceToUk = LocalDate.of(2021,03,29);
        System.out.println(entranceToUk);
        long numOfYears = ChronoUnit.YEARS.between(entranceToUk,currentDate);
        System.out.println("Years: " +numOfYears);
        long numOfMonths = ChronoUnit.MONTHS.between(entranceToUk,currentDate);
        System.out.println("Months: " +numOfMonths);
        long numOfDays = ChronoUnit.DAYS.between(entranceToUk, currentDate);
        System.out.println("Days: " + numOfDays);

    }
}
