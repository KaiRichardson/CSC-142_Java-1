import java.util.*;
/**
 * This class provides utilities for date verification. 
 * 
 * @author      Kai Richardson <kairichardson2000@gmail.com>
 * @version     25/10/2019
 */
public class Date
{
    private UserWindow window;
    int day;
    int month;
    int year;

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
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Must be a valid day of selected month"); 
                }
                this.month = month;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 30){
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Must be a valid day of selected month"); 
                }
                this.month = month;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 
            || month == 8 || month == 10 || month == 12){
                // Day validation - The day must be legal for the month
                if(day > 0 && day <= 31){
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Must be a valid day of selected month"); 
                }
                this.month = month;
            } else {
                throw new IllegalArgumentException("Must be a valid month of selected year");
            }
            this.year = year;
        } else {
            throw new IllegalArgumentException("Must be valid year after 1600"); 
        }

    } 

    /** <static methods> */

    /**
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
    public int getDay(){
        return day; 
    }

    /**
    + int getMonth()
     * returns the numeric value of the month of this Date
     */
    public int getMonth(String monthString){
        int month = 0;
        switch (monthString) { 
            case "January": 
            month = 1; 
            break; 
            case "February": 
            month = 2; 
            break; 
            case "March": 
            month = 3; 
            break; 
            case "April": 
            month = 4; 
            break; 
            case "May": 
            month = 5; 
            break; 
            case "June": 
            month = 6; 
            break; 
            case "July": 
            month = 7; 
            break; 
            case "August": 
            month = 8; 
            break; 
            case "September": 
            month = 9; 
            break; 
            case "October": 
            month = 10; 
            break; 
            case "November": 
            month = 11; 
            break; 
            case "December": 
            month = 12; 
            break; 
        }
        return month; 
    }

    /**
    + int getYear() 
     * returns the year of this Date
     */
    public int getYear(){ 
        return year; 
    }

    /**
    + String toString() 
     * returns this Date as a String of the form: mm/dd/yyyy.  
     * An example would be 02/20/1974  or 10/11/2020
     */
    public String toString() {
        String dayString = "";
        String monthString = "";
        String yearString = String.valueOf(year);
        
        if (day < 10){
            dayString = "0" + day;
        } 

        if (day < 10){
            monthString = "0" + month;
        }
        String dateString = dayString + "/" + monthString + "/" + yearString;
        return dateString;
    } 

    /**
    + String getMonthName()
     * returns the name of the month of this Date. 
     * The name starts with a capital letter, such as April or June.
     */
    public String getMonthName(){
        String monthString = "";
        switch (month) { 
            case 1: 
            monthString = "January"; 
            break; 
            case 2: 
            monthString = "February"; 
            break; 
            case 3: 
            monthString = "March"; 
            break; 
            case 4: 
            monthString = "April"; 
            break; 
            case 5: 
            monthString = "May"; 
            break; 
            case 6: 
            monthString = "June"; 
            break; 
            case 7: 
            monthString = "July"; 
            break; 
            case 8: 
            monthString = "August"; 
            break; 
            case 9: 
            monthString = "September"; 
            break; 
            case 10: 
            monthString = "October"; 
            break; 
            case 11: 
            monthString = "November"; 
            break; 
            case 12: 
            monthString = "December"; 
            break; 
        }
        return monthString;
    }

    /**
    + Date daysFromDate( int days ) 
     * returns a new Date that is "days" in the future from this Date.  
     * A valid parameter is in the range [1, 31].  
     * Throw an IllegalArgumentException if the parameter is invalid.
    
    public Date daysFromDate( int days ) {
        if (days < 1 || days > 31){
            throw new IllegalArgumentException("days in the future must be between 1-31"); 
        } else {
            day = getDay();
            int futureDay = day + days;

            month = getMonth();
            int daysInMonth = 0;
            if (month == 2) {
                daysInMonth = 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }

            year = getYear();
            if(futureDay > daysInMonth){
                day = futureDay - daysInMonth;
                if (month == 12){
                    month = 1;
                    year += 1;
                } else {
                    month += 1;
                }
            }
        }
        String futureDate = day + "/" + month + "/" + year;
        return futureDate;
    }
    */

    /** <mutator methods> */ 

    /**
    + void setDay( int day) 
     * update the day of this Date. 
     * If the parameter value is invalid, throw an IllegalArgumentException. 
     */
    public void setDay( int day) {
        this.day = day;
    }

    /**
    + void setMonth( int mth) 
     * update the month of this Date.  
     * If the parameter value is invalid, throw an IllegalArgumentException. 
     */
    public void setMonth( int mth) {
        this.month = mth;
    }

    /**
    + void setYear( int yr) 
     * update the year of this Date. 
     * If the parameter value is invalid, throw an IllegalArgumentException. 
     */
    public void setYear( int yr) {
        this.year = yr;
    }
}