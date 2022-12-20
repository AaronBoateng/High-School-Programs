//*************************************
// F2C.java
//
// Aaron Boateng 9/26/2019
//
//Program asks user for a temperature in 
//Fahrenheit. The program then converts the
//amount into Celsius with three decimal places.
//*************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class F2C_ATB
{
   public static void main (String []args)
   {
   Scanner scan = new Scanner(System.in);
   double f,c;
   
   System.out.print("Program F2C: Converts Fahrenheit to Celsius");
   System.out.println();
   System.out.println();
   
   System.out.print("Enter the temperature in Fahrenheit: ");
   f = scan.nextDouble();
   System.out.println();
   
   c = ((f - 32) * 5 / 9);
   
   DecimalFormat dec = new DecimalFormat ("0.000");
   
   System.out.print("A temp of " + dec.format(f) + " F is " + dec.format(c) + " C.");

   
   }
}