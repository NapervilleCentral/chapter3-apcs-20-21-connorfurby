/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;

import java.io.*;       //for File IO

public class ch3notes
{
    Integer one = 1;
    enum Classes  {CalculusAB, English, SpanishIII, Gym, Lunch, APCS, APush, Photo}
    enum Grades {A,B,C,D,F}
    enum Week {Monday,Tuesday,Wednesday,Thursday,Friday}

      public static void main (String [] args) throws IOException // required for File IO
   {
       
       Scanner Keyboard = new Scanner(System.in);
       DecimalFormat fmt = new DecimalFormat ("0.###");
       Integer two = 2;
    /*
       Grades mygrade = Grades.F;
       Grades yourgrade = Grades.A;
       System.out.println(mygrade);
       System.out.println(yourgrade.compareTo( mygrade) );
       String[] people = {"Deepa", "Trevor", "Murugan", "Emy",
                          "Thomas", "Charlie",
                          "heinz doofenshmirtz", "Michael",
                          "NoOne", "Bueller","Justin","David"};
                          
        */
       /*
        String number = "y";
        int num, total = 0, sum = 0;
        System.out.print("Enter a number");
        number = Keyboard.next();//"5", "q"
        
        
        
        while (!number.equals("q"))
        {
            num = integer.parseInt(number); //convert String to int; Double.parseDouble()
            num += num;
        }
       String number;
       int num,total = 0;
       for(int i = 0; i< 5; i++)
       {
           System.out.print("Enter a number");
           number = Keyboard.next();
           num = Integer.parseInt(number);
           total += num;
       }
       System.out.println(total);
       
       
        System.out.println("You scedule is:");
        // new for loop to use with iterators
        //foreach loop
        for (Classes period: Classes.values())
            System.out.println(period);

        System.out.println("Your class roster is:");
        for(String student: people)
            System.out.println(student);



*/
/*
  int wordCount = 0, characterCount = 0;
             String line, word;
             StringTokenizer tokenizer;

             System.out.println ("Please enter text");

             line = Keyboard.readString();

                tokenizer = new StringTokenizer (line,"/");


        x = Integer.parseInt(input);
        System.out.print(x);





 WHAT WILL OUTPUT?
    int k =0, j=0;

    System.out.println("k \tj");

    for(j=0; j<20; j+=k)
    {
        k++;
        System.out.println(k + "\t" + j);
    }

    System.out.println("After the loop \n k= " +k +"\tj= " +j);



    // Scanner file i/o defaults at the space
    Scanner scanFile = new Scanner(new File("speeches\\people.txt"));
    Scanner scanFile2 = new Scanner(new File("data/Debate12016.txt"));
    String data = scanFile.nextLine();
    String name, address, phone;
    
    while(scanFile.hasNext())
    {
        name = scanFile.next();
        address = scanFile.next();
        phone = scanFile.next();
        
        System.out.println(name + "---" + phone);
    }

    String name, address, phone;

    while(scanFile.hasNext())
    {
        name = scanFile.next();// up to the space, nextLine() reads until the \n
        address = scanFile.next();
        phone = scanFile.next();

        System.out.println(name + "---"+ phone);

    }
*/
/*
    String word;
    Scanner scanFile2 = new Scanner(new File("data/Debate12016.txt"));
    int total = 0;
     while(scanFile2.hasNext())
    {
        word = scanFile2.next();
        if (word.equalsIgnoreCase("Job") || word.equalsIgnoreCase("Jobs") || word.equalsIgnoreCase("Jobs.") || word.equalsIgnoreCase("Job.") || word.equalsIgnoreCase("Jobs,") || word.equalsIgnoreCase("Job,"));
            total ++;
    }
    System.out.println("Jobs was said " + total);
*/






/**/


    //Scanner scanFile = new Scanner(new File ("state of the union 2011.txt"));

    //Scanner scanFile = new Scanner
    //  (new File ("data\\obamatakebackamerica.txt"));
    //Scanner scanFile = new Scanner
    //(new File ("data\\Debate12016.txt"));
    //Scanner scanFile = new Scanner(new File ("jimmy carter a crisis of confidence.txt"));

/*
    String word;
    int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0;

    while ()
    {


        //count_words ++;

        //System.out.println(word  );



    }//end of while
*/

//_______________________basic for and scope of i________________________

        //ini
        //middle
        //body
        //last
        // ini          test     inc
        /*
    int i = 0, j = 10;
    for(;i < j;)
    {
        System.out.print("Hi " + ++i + ", " +  j-- + "\n");
    }

    System.out.print("After the Loop: " + i + "\n");
*/
//--- While loop and sentinel value

/*

    int test;
    System.out.println("Guess my favorite number \n" +
                            "it is between 1-20");
    test = Keyboard.nextInt();

    while (test != -9999)
    {
        if (test == 14)
            System.out.println
                ("it the age of my sons"+
                " Thomas and Charlie");
        else
            System.out.println("Guess again, or -9999 to end the program");

        test = Keyboard.nextInt();

    }



/*  int i =0;//#1

        while (i<10)//#2
        {
            System.out.print( "i =" + i +"\n");
            i++;//#3
        }





/*  */

   }// end of main

}// end of class









