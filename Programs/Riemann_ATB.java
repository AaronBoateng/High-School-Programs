//*******************************************
// Riemann_ATB.java
//
// Aaron Boateng
//
// 1-13-2020
//
// Program asks the user for the diameter and
// x-increment (both in cm), then calculates 
// the area of a circle by dividing a quadrant
// into rectangles and adding them together
//*******************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Riemann_ATB
{
   public static void main (String[] args) 
   {
      // Setting up the Scanner class and Decimal Format class
      Scanner scan = new Scanner(System.in);
      DecimalFormat dec = new DecimalFormat("#.000");
      double r;
      double y;
      double x = 0.0;
      double quad = 0.0;
      double circle;
      double area;
     
      System.out.print("0-0-0-0-0-0 Program Riemann 0-0-0-0-0-0\n");
      // Prompts user for the diameter and the x-increment(dx)
      System.out.print("\nEnter diameter (cm): ");
      double di = scan.nextDouble();
      r = di/2.0;
      System.out.print("\nEnter x-increment (cm): ");
      double dx = scan.nextDouble();
      // While loop that finds the area of a quadrant by finding
      // the area of each rectangle using the Pythagorean Theorem
      while ( x < r ) {
         y = Math.sqrt((r*r) - (x*x));
         area = (y * dx);
         quad += area;
         x += dx;
      }
      // Multiplying the calculated quadrant by 4 to get the 
      // area of the entire circle
      circle = (quad * 4.0);
      // Using Decimal Format to round the area to the nearest
      // thousandth
      System.out.print("\nThe area of a circle with a diameter of " + 
         dec.format(di) + " cm is " + dec.format(circle) + " cm^2.");
  
   }
}
