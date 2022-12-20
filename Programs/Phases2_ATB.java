//****************************************
// Phases2_ATB.java
//
// Aaron Boateng
//
// Date: 11-25-2019
//
// Program asks the user for the temperature in either 
// Celsius or Fahrenheit. The program then makes 
// calculations to figure out what 
// phase water would be in that temperature.
//
//****************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Phases2_ATB
{
   public static void main (String []args)
   {
   Scanner scan = new Scanner(System.in);
   DecimalFormat dec = new DecimalFormat("0.0");
   char unit;
   double temp;
   
   System.out.println("(C/F) Program Phases (F/C)");
   System.out.println();
   System.out.print("Enter Temperature units (C or F): ");
   unit = scan.next().charAt(0);
   
   if (unit != 'c' && unit != 'f' && unit != 'C' && unit != 'F') {
   while ( unit != 'c' && unit != 'f' && unit != 'C' && unit != 'F') {
   System.out.println("\nInvalid input!\n");
   System.out.print("Enter Temperature units (C or F): ");
   unit  = scan.next().charAt(0);
   }
   }
 
   System.out.print("\nEnter Temperature (degrees): ");
   temp = scan.nextDouble();
   
   if (unit == 'c' || unit == 'C') {
   double tempf = ((temp * 9) / 5 + 32);
   
   
    if (unit == 'C' && temp < 0 || unit == 'c' && temp < 0) {
   System.out.print("\nWater at " + temp + "C" + "/" + dec.format(tempf) + "F" + " is: Solid (Ice)");
   }
      else if (unit == 'C' && temp == 0 || unit == 'c' && temp == 0) {
   System.out.print("\nWater at " + temp + "C" + "/" + dec.format(tempf) + "F" + " is: Melting/Freezing!");
   }
      else if (unit == 'C' && temp > 0 && temp < 100 || unit == 'c' && temp > 0 && temp < 100) {
   System.out.print("\nWater at " + temp + "C" + "/" + dec.format(tempf) + "F" + " is: Liquid (Water)");
   }
      else if (unit == 'C' && temp == 100 || unit == 'c' && temp == 100) {
   System.out.print("\nWater at " + temp + "C" + "/" + dec.format(tempf) + "F" + " is: Boiling/Condensing!");
   }
      else if (unit == 'C' && temp > 100 || unit == 'c' && temp > 100) {
   System.out.print("\nWater at " + temp + "C" + "/" + dec.format(tempf) + "F" + " is: Gas (Steam)");
   }

   }
   
   if (unit == 'f' || unit == 'F') {
   double tempc = ((temp-32) * 5 / 9);
   
      
   if (unit == 'F' && temp < 32 || unit == 'f' && temp < 32) {
   System.out.print("\nWater at " + dec.format(tempc) + "C" + "/" + temp + "F" + " is: Solid (Ice)");
   }
      else if (unit == 'F' && temp == 32 || unit == 'f' && temp == 32) {
   System.out.print("\nWater at " + dec.format(tempc) + "C" + "/" + temp + "F" + " is: Melting/Freezing!");
   }
      else if (unit == 'F' && temp > 32 && temp < 212 || unit == 'f' && temp > 32 && temp < 212) {
   System.out.print("\nWater at " + dec.format(tempc) + "C" + "/" + temp + "F" + " is: Liquid (Water)");
   }
      else if (unit == 'F' && temp == 212 || unit == 'f' && temp == 212) {
   System.out.print("\nWater at " + dec.format(tempc) + "C" + "/" + temp + "F" + " is: Boiling/Condensing!");
   }
      else if (unit == 'F' && temp > 212 || unit == 'f' && temp > 212) {
   System.out.print("\nWater at " + dec.format(tempc) + "C" + "/" + temp + "F" + " is: Gas (Steam)");
   }

   }
   
    
    
       
   }
}
    
   