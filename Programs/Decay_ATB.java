//*******************************************
// Decay_ATB.java
// 
// Aaron Boateng
//
// 11-25-2019
//
// The program asks the user for the inital
// count rate, the final count rate, and the
// elasped time (years). The program then
// calculates the Decay Constant(Lambda) and
// the Half-Life, and provides a Half-Life 
// table up to 10  years(inclusive).
//*******************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Decay_ATB 
{
   public static void main (String []args) 
   {
   
   Scanner scan = new Scanner(System.in);
   DecimalFormat dec = new DecimalFormat("0.00");
   
   System.out.print("<=><=><=> Radioactive Decay <=><=><=>");
   System.out.println();
   System.out.print("\nEnter intial count rate (cpm): ");
   double icr = scan.nextInt();
   System.out.print("Enter final count rate (cpm): ");
   double fcr = scan.nextInt();
   System.out.print("Enter elapsed time (years): ");
   int yr = scan.nextInt();
   
   double dc = Math.log(icr / fcr) / yr;
   double hl = Math.log(2) / dc;
   
   System.out.print("\nLambda:      " + dec.format(dc) + " years^-1");
   System.out.print("\nHalf-Life:   " + dec.format(hl) + " years\n");
   System.out.print("\n Time      Activity\n(years)      (cpm)\n-------    --------\n");
   
  
   for (int t=0; t <= 10; t++) {
  
   double cr = icr * Math.pow(Math.E, (-1 * dc * t));
   System.out.printf( "  %2d         %4.0f\n", t, cr);
   
   }
   
   
   
   
   
   
   
   
   }
}