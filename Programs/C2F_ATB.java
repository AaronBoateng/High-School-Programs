//********************************************
// C2F.java
//
// Aaron Boateng 9-24-2019
//
//Program asks for a temperature in Celsius.
//The program then converts the temperature to Fahrenheit.
//********************************************
import java.util.Scanner;
public class C2F_ATB
{
   public static void main (String []args)
   {
   
   Scanner scan = new Scanner(System.in);
   int c;
   int f;
  
   System.out.println("Program C2F: Converts Celsius to Fahrenheit");
   System.out.println();
   System.out.print("Enter the temperature in Celsius: ");
   c = scan.nextInt();
   System.out.println();
   
   f = 9 * (c / 5) + 32;
   
   System.out.print("A temp of " + c + "C is " + f + "F.");
   
   }
   
}
   