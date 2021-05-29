package craftsman;

import java.util.*;

/**
 * NextDate is a function of three variable: month, day, and year. It returns the date of the day
 * after the input date.
 *
 * The month, day, and year variables have numerical values:
 *  1 <= month <= 12
 *  1 <= day <= 31
 *  1812 <= year <= 2021
 */
public class NextDateImpl {

    public class Date {
        private int month;
        private int day;
        private int year;
        public Date(int month, int day, int year){
            this.month = month;
            this.day = day;
            this.year = year;
        }
        public String toString(){
            List<String> months = Arrays.asList("January" , "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
            return months.get(month-1)+" "+day+", " + year;
        }
    }

    private int LAST_MONTH_DAY = 31;
    private int DAY_BEFORE_LAST_MONTH_DAY = 30;
    private int LAST_FEBRUARY_DAY = 29;
    private int DAY_BEFORE_LAST_FEBRUARY_DAY = 28;


    private Date today;
    private Date tomorrow;

    public NextDateImpl(int month, int day, int year){
        today = new Date(month, day,year);
    }

    public Date nextDay(){
        tomorrow = today;
        switch (today.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (today.day < LAST_MONTH_DAY){
                    tomorrow.day += 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (today.day < DAY_BEFORE_LAST_MONTH_DAY){
                    tomorrow.day += 1;
                }
                else {
                    tomorrow.day = 1;
                    tomorrow.month += 1;
                }
                break;
            case 12:
                if ( today.day < LAST_MONTH_DAY){
                    tomorrow.day += 1;
                }
                else {
                    tomorrow.day = 1;
                    tomorrow.month = 1;
                    if (today.year == 2021){
                        System.out.println("2021 is over");
                    }
                    else {
                        tomorrow.year += 1;
                    }
                }
                break;
            case 2:
                if ( today.day < DAY_BEFORE_LAST_FEBRUARY_DAY ){
                    tomorrow.day += 1;
                }
                else if ( today.day == DAY_BEFORE_LAST_FEBRUARY_DAY) {
                    // Leap year
                    if ( (today.year % 4 == 0) && ( today.year % 400 != 0)) {
                        tomorrow.day = 29;
                    }
                    else { // Common year
                        tomorrow.day = 1;
                        tomorrow.month = 3;
                    }
                }
                else if ( today.day == LAST_FEBRUARY_DAY){
                    tomorrow.day = 1;
                    tomorrow.month = 3;
                }
                else {
                    System.out.println("Cannot have Feb. " + today.day) ;
                }
                break;
            default:
                System.out.println("error invalid month");
                break;
        }
        return tomorrow;
    }

}
