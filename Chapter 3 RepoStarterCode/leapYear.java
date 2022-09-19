/**
 * Names: Alex Ung & Connor Furby
 * Date: 9/16/22
 * Program Title: leapYear
 * Description: determines if an inputted year is a leap year
 */
import java.util.Scanner;

public class leapYear
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int year;
        
        //asks for user input on what year it is
        System.out.print("What year is it? ");
        year = sc.nextInt();
        System.out.println();
        
        //checks if the year follows the pattern for a leap year
        if (year % 4 == 0 && year >= 1582)
            if (year % 100 == 0)
                if (year % 400 == 0)
                    System.out.println("It is a leap year.");
                else 
                    System.out.println("It is not a leap year.");
            else 
                System.out.println("It is a leap year.");
        //checks inputted year is within the Gregorian calendar
        else if (year < 1582)
            System.out.println("The Gregorian calendar was not adopted yet.");
        else 
            System.out.println("It is not a leap year.");
    }
}
