import java.util.Scanner;
/**
 * This class implements 2 static methods
 * 1. validate that a String represents a valid 5-digit zip code.
 * 2. validate that a String represents a valid 10-digit phone number.
 * 
 * @author      Kai Richardson <kairichardson2000@gmail.com>
 * @version     1.0                 
 * @since       1.0      
 */
public class Validations
{
    /**
     * Validates that a String represents a valid 5-digit zip code
     * @param zip, the String to work with -- must be 5 char long
     * @throws new IllegalArgumentException if length of zip != 5
     * @throws new IllegalArgumentException if the loop finds a letter in zip
     * @returns primitive int of the provided zip code
     */
    public static String validateZipCode(String zip) {
        if (zip.length() != 5 ){
            throw new IllegalArgumentException("A zip code must have 5 numbers");
        } else {
            for (int i = 0; i < zip.length(); i++ )
            {
                if(Character.isLetter(zip.charAt(i))){
                    throw new IllegalArgumentException("zip codes can only contain numbers");
                }
            }
            return zip;
        }
    }

    /**
     * Validates that a String represents a valid 10-digit phone number
     * @param num, the String to work with -- must be 12 char long, formated: NPA-NXX-XXXX
     * @throws new IllegalArgumentException if num length != 12
     * @throws new IllegalArgumentException if index 3 or 7 != '-'
     * @throws new IllegalArgumentException if num contains any letters
     * @throws new IllegalArgumentException if N != between 2 and 9
     * @throws new IllegalArgumentException if P != between 0 and 8
     * @throws new IllegalArgumentException if index 4 and 5 both == 1
     * @returns primitive int of the provided zip code
     */
    public static String validatePhoneNumber(String num) {
        if (num.length() != 12 || num.charAt(3) != '-' || num.charAt(7) != '-'){
            throw new IllegalArgumentException("Please use number format: XXX-XXX-XXXX");
        } else  {
            String newNum = num.replace("-", "");
            for (int i = 0; i < newNum.length(); i++ )
            {
                if(Character.isLetter(newNum.charAt(i))){
                    throw new IllegalArgumentException("Phone numbers can only contain numbers");
                }
            }

            if (newNum.charAt(0)>'2' || newNum.charAt(0)<'9' || newNum.charAt(3)>'2' || newNum.charAt(3)<'9'){
                throw new IllegalArgumentException("The 1st and 4th number must start with a digit between 2 and 9");
            } else if (newNum.charAt(1) > '0' || newNum.charAt(1) < '8'){
                throw new IllegalArgumentException("The 2nd number must be a digit between 0 and 8");
            } else if (newNum.charAt(4) == '1' && newNum.charAt(5) == '1'){
                throw new IllegalArgumentException("The 5th and 6th number cannot both be 1");
            } else {
                return num;
            }
        }
    }
}