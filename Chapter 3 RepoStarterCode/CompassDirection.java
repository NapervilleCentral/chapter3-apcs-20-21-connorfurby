 
import java.util.Scanner;
/**
   Prints the compass direction N,NE,E,SE,S,SW,W,NW
   Given an angle as input.
*/
public class CompassDirection
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the direction the compass is pointing " +
          " (in degrees from North (0..360): ");
      double degrees = in.nextDouble();

      System.out.print(degrees + " Degrees is ");
      
      if (degrees >= 337.5 || degrees < 22.5)
          System.out.print("North");
          
      else if (degrees >= 22.5 && degrees < 67.5)
          System.out.print("Northeast");
          
      else if (degrees >= 67.5 && degrees < 112.5)
          System.out.print("East");
          
      else if (degrees >= 112.5 && degrees < 157.5)
          System.out.print("Southeast");
          
      else if (degrees >= 157.5 || degrees < 202.5)
          System.out.print("South");
          
      else if (degrees >= 202.5 && degrees < 247.5)
          System.out.print("Southwest");
          
      else if (degrees >= 247.5 && degrees < 292.5)
          System.out.print("West");
          
      else if (degrees >= 292.5 && degrees < 337.5)
          System.out.print("Northwest");
      
      // Calculate the direction and print the rest
      // of the line here




   }
}
