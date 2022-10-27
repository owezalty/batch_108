package day18datetimeclassvarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class DateTime02 {

    public static void main(String[] args) {

        //Type the code that find out how many months Ali lived. Dob of Ali is 4th of June 1997

        //LocalDate dob = LocalDate.of(1997, Month.JUNE,4);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        //long numOfMonths = ChronoUnit.MONTHS.between(dob, currentDate);
        //System.out.println(numOfMonths);

        LocalDate dobMrt = LocalDate.of(1994,04,01);
        System.out.println(dobMrt);
        long numOfYears = ChronoUnit.YEARS.between(dobMrt,currentDate);
        System.out.println("Years: " +numOfYears);
        long numOfMonths = ChronoUnit.MONTHS.between(dobMrt,currentDate);
        System.out.println("Months: " +numOfMonths);
        long numOfDays = ChronoUnit.DAYS.between(dobMrt, currentDate);
        System.out.println("Days: " + numOfDays);


        //Example 2: Tom was born 45 years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type code the code to calculate the exact date of birth of Ali and Veli.
        //Type code to check if the date of birth of Ali and Veli is the same or not.

        LocalDate dobTom = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dobTom);//1969-07-04

        LocalDate dobVeli = LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobVeli);//1969-07-04

        boolean isEqual = dobTom.equals(dobVeli);
        System.out.println(isEqual);

        //Example 3: Type code to find the time difference in hours
        //between Japan time zone and Germany time zone.

        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime timeInGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInJapan);
        System.out.println(timeInGermany);

        int hourInJapan = timeInJapan.getHour();
        System.out.println(hourInJapan);
        int hourInGermany = timeInGermany.getHour();
        System.out.println(hourInGermany);

        int difference = hourInJapan-hourInGermany;
        System.out.println(difference);










    }
}
