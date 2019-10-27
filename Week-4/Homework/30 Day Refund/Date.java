import java.util.*;
/**
 * This class provides utilities for date verification. 
 * 
 * @author      Kai Richardson <kairichardson2000@gmail.com>
 * @version     25/10/2019
 */
public class Date
{
    int dateDay;
    int dateMonth;
    int dateYear;

    /** <constructors> */

    /** 
    + Date( int month, int day, int year ) 
     * construct a Date object with the given state.  
     * If any of the parameter values are invalid, throw an IllegalArgumentException.  
     * Make sure that the exception contains a message specific to the problem.
     */
    public Date(int month, int day, int year){
        // Year validation - The year must be 1600 or later
        if(year > 1600){
            // Month validation - The day and month must be legal for the year 
            if (month == 2) {
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 28){
                    dateDay = day;
                } else {
                    throw new IllegalArgumentException("Must be a valid day of selected month"); 
                }
                dateMonth = month;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 30){
                    dateDay = day;
                } else {
                    throw new IllegalArgumentException("Must be a valid day of selected month"); 
                }
                dateMonth = month;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 
            || month == 8 || month == 10 || month == 12){
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 31){
                    dateDay = day;
                } else {
                    throw new IllegalArgumentException("Must be a valid day of selected month"); 
                }
                dateMonth = month;
            } else {
                throw new IllegalArgumentException("Must be a valid month of selected year");
            }
            dateYear = year;
        } else {
            throw new IllegalArgumentException("Must be valid year after 1600"); 
        }

    } 

    /** <static methods> */

    /*
    + boolean isLegal( int month, int day, int year )  
     * returns true if these 3 values make up a valid date, false otherwise.  
     * Leap years are handled correctly.
     */
    public static boolean isLegal( int month, int day, int year ){
        // Year validation - The year must be 1600 or later
        if(year > 1600){
            // Month validation - The day and month must be legal for the year 
            if (month == 2) {
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 28){
                    return true;
                } else {
                    return false; 
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 30){
                    return true; 
                } else {
                    return false;  
                }
            } else if (month == 1 || month == 3 || month == 5 || month == 7 
            || month == 8 || month == 10 || month == 12){
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 31){
                    return true; 
                } else {
                    return false;  
                }
            } else {
                return false; 
            }
        } else {
            return false;  
        }

    }

    /** <accessor methods> */

    /**
    + int getDay()
     * returns the day of this Date
     */
    public static int getDay(){
        return 
    }

    /*
    + int getMonth()
     * returns the numeric value of the month of this Date
     */
    public static int getMonth(){
    }

    /*
    + String getMonthName()
     * returns the name of the month of this Date. 
     * The name starts with a capital letter, such as April or June.
     */
    public static String getMonthName(){
    }

    /*
    + int getYear() 
     * returns the year of this Date
     */
    public static int getYear() {
    }

    /*
    + String toString() 
     * returns this Date as a String of the form: mm/dd/yyyy.  
     * An example would be 02/20/1974  or 10/11/2020
     */
    public static String toString() {
    }

    /*
    + Date daysFromDate( int days ) 
     * returns a new Date that is "days" in the future from this Date.  
     * A valid parameter is in the range [1, 31].  
     * Throw an IllegalArgumentException if the parameter is invalid.
     */
    public static Date daysFromDate( int days ) {
    }

    /** <mutator methods> */ 

    /*

    + void setDay( int day) 
     * update the day of this Date. 
     * If the parameter value is invalid, throw an IllegalArgumentException. 
     */
    public static void setDay( int day) {
    }

    /*
    + void setMonth( int mth) 
     * update the month of this Date.  
     * If the parameter value is invalid, throw an IllegalArgumentException. 
     */
    public static void setMonth( int mth) {
    }

    /*
    + void setYear( int yr) 
     * update the year of this Date. 
     * If the parameter value is invalid, throw an IllegalArgumentException. 
     */
    public static void setYear( int yr) {
    }
}