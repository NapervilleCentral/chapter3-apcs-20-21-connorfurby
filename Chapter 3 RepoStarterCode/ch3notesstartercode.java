/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;


public class ch3notesstartercode
{
public static void main (String [] args)
{

        Scanner keyboard = new Scanner(System.in);
        int num;
        String school; 
        
/**
        System.out.println("Enter a number");
        num = keyboard.nextInt();
        //
       // if (num > 0)
        //{   
            
            // extended if statements equal to OR
            if (num < 10)
            {
                keyboard.nextLine();//clear buffer
                System.out.println("What Grade School did you attend?");
                school = keyboard.nextLine();
                if (school.equals("May Whitney"))
                    System.out.print("GO! Lions!!!");
                else if (school.equals("Steeple Run"))
                    System.out.print("Go! Super Stars!!!");
            }
            else if (num < 13) // this must resolve to a boolean
                    System.out.println("You go to JRH");
            else if(num < 20)
                System.out.println("You go to HS");
            else if (num < 55)
                System.out.println("You are younger and most likely better looking than Mr. Hayes");
            // else if (num > 0)
            System.out.println("Welcome to the World");
        //}
**/
    
/**
    String word1 = "apple";
    String word2 = "cat";
    String word3 = "dog";

    if(word1.compareTo(word2)<0)//;end a statement BAD BAD simicolen
    {
        System.out.println(word2 +" is before " + word1  );
        System.out.println("and cats are evil" );
    }//ctrl M - will match brackets
    else
        System.out.println(word1 +" is before " + word2  );

    if(word3.compareTo(word2)<0)//;( semicolen
        System.out.println(word3 +" is before " + word2  );
**/
/*

      int num = 5, num1 =10, num2 = 4;  // standard hours in a work week

      System.out.print ("Enter a number ");
      num = Keyboard.nextInt();

       System.out.print ("Enter a  second number ");
       num1 = Keyboard.nextInt();

       System.out.print ("Enter a  third number ");
       num2 = Keyboard.nextInt();

      System.out.println ();
*/


boolean a = true, b = false, c = false,d;
//System.out.println(a  );
//c =(a = true) || (b = true); // the || aka the or comparator short circuits on true
//System.out.println(a  );
//System.out.println(a + "-" + b + "-" + c);


//c = (a = false) || (b = true);
//System.out.println(a + "-" + b+ "-" + c);

//c =(a = false) && (b = true); // the && aka the and copmparator needs all to be true otherwise false
//System.out.print(a + "-" + b+ "-" + c);

//c = (a = true) && (b = false);
//System.out.print(a + "-" + b + "-" + c);

//d =!(a = true) || (b = true) && (c = true);
//System.out.print(a + "-" + b + "-" + c+ "-" + d);


/**/
double wallet = 1 * .01 + 2 + 0.5 + 3 + 0.10 + 4 + 0.25;
if (wallet == 1.41)
    System.out.println("Correct");
else
    System.out.println("Add much?");
 



}//end of main


}//end of class









