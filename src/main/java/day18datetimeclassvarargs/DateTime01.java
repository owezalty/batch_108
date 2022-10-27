package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //How to get current date by typing Java code
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-09-30

        //How to get "current time" by typing Java code
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//01:05:06.726412100

        //How to get "current date and time" by typing Java code
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-09-30T01:05:06.726412100

        //How to get "current date" in another country by typing Java code
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Ashgabat"));
        System.out.println(currentDateInJapan);//2022-09-30

        //How to get "current time" in Japan by typing Java code
        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);//09:10:00.284642500

        //How to get "current date and time" in Japan by typing Java code
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-09-30T09:08:18.790611700

        //How to go future in date
        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);//2022-09-30

        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);//Method Chain
        System.out.println(cd1Next);//2025-06-28

        //How to go past in date
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);

        /*
        //HW: Type code to learn how to go future and past in time;
         */

        //How to get a specific part of the time
        LocalTime ct1 = LocalTime.now();
        int hour =  ct1.getHour();
        System.out.println(hour);//1

        int minute = ct1.getMinute();
        System.out.println(minute);//19

        //How to change the format of the date:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);//30/09/2022

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");//MMM gives you the first 3 characters of the month name
        //yy gives you the "last 2 digits" of the year
        String formattedCurrentDate2 = dt.format(cd1);
        System.out.println(formattedCurrentDate2);//30/Sep/22

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");//MMMM gives you full name of the month
        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);//30/September/2022

        //How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("HH:mm a");
        //hh uses 12 hours system, HH uses 24 hours system.
        //"a" is for to display "AM" or "PM"/
        LocalTime lt = LocalTime.now();

        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);

        //How to create specific dates
        LocalDate dob1 = LocalDate.of(2012,5,21);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY,21);
        System.out.println(dob1);
        System.out.println(dob2);

        //How to compare two dates
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is = dob2.isBefore(dob1);
        System.out.println(is);

        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);

    }
}
