import java.util.Scanner;
public class switch_example
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);


       // switch statement------------------------------
         char choice;

            System.out.print("What would you like to buy?\n");
            System.out.print("f) fries\n");
            System.out.print("c) cheese\n");
            System.out.print("s) small drink\n");

            choice = Keyboard.next().charAt(0);

            
            // switch works with a char, int, or sting
            switch (choice)
            {
                case 'F':
                case 'f':
                    System.out.print(".99");
                    break;
                case 'c':
                    System.out.print("1.50");
                    break;
                case 's':
                    System.out.print(".79");
                    break;
                default:
                    System.out.print("Incorrect Data");

            }


    }//endo of main

}//end of class