//****************************************************
// Quadratic.java
//
// Aaron Boateng 10-15-2019
//
// Program asks the user for the three coefficients of a
// quadratic formula. The program will then solve for any 
// roots, real or imaginary, and display them.
//
//*****************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Quadratic_ATB {
   public static void main (String []args) {
   
   DecimalFormat dec = new DecimalFormat("0.###");
   Scanner scan = new Scanner(System.in);
   double a,b,c,disc;
   
   System.out.println("*** Quadratic Equation Solver ***");
   System.out.println();
   System.out.print("Enter a: ");
   a = scan.nextDouble();
   System.out.print("Enter b: ");
   b = scan.nextDouble();
   System.out.print("Enter c: ");
   c = scan.nextDouble();
   System.out.println();
   
   disc = (b * b) - 4 * (a * c);
   String i;
   if ( disc > 0 ) {
   double x1 = ((-1 * b) + Math.sqrt(disc)) / (2*a);
   double x2 = ((-1 * b) - Math.sqrt(disc)) / (2*a);
   System.out.print("Two real roots:\nx1 = " + dec.format(x1) + "\nx2 = " + dec.format(x2));
   }
   
   if ( disc == 0 ) {
   double x = (-1 * b) / (2 * a);
   System.out.print("One real root:\nx =  " + dec.format(x));
   }
   
   if ( disc < 0 ) {
   
   double x1 = (-1 * b) / (2 * a);
   double x2 = Math.sqrt(-disc) / (2 * a);
   System.out.print("Two complex roots:\nx1 = " + x1 + " + i" + dec.format(x2) + "\nx2 = " + x1 + " - i" + dec.format(x2));
   }
   
   
   
   }
}
   
   
   