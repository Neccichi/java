package java24hours;

import java.time.*;
import java.time.temporal.*;

class Clock{
    public static void main(String[] arguments){
        LocalDateTime now= LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        if(hour<12){
            System.out.println("Good morning!\n ");
        }else if(hour<17){
            System.out.println("Good day!\n");
        }else{
            System.out.println("Good evening!\n");
        }
        
        System.out.println("Now: ");
        
        //hours
        System.out.println(hour);
        System.out.println( (hour != 1 & hour !=21)?
                "hour (hours)" : "hour");
        
        //minutes
        System.out.println(minute);
        System.out.println((minute != 1 & minute !=21 &
                minute != 31 & minute != 41 & minute != 51)?
                "minutes" : "minute");
        
        //number of month
        System.out.println("\n" + day + " ");
        
        //name of month
        switch (month){
            case 1:
               System.out.println("January");
               break;
            case 2:
               System.out.println("February");
               break;
            case 3:
               System.out.println("March");
               break;
            case 4:
               System.out.println("April");
               break;
            case 5:
               System.out.println("May");
               break;
            case 6:
               System.out.println("June");
               break;
            case 7:
               System.out.println("July");
               break;
            case 8:
               System.out.println("August");
               break;
            case 9:
               System.out.println("September");
               break;
            case 10:
               System.out.println("October");
               break;
            case 11:
               System.out.println("November");
               break;
            case 12:
               System.out.println("December");
               break;
        }
        
        //display year
        System.out.println(", " + year);
    }
}

