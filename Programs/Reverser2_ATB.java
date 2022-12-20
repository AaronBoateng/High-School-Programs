//***************************************************
// Reverser2_ATB.java
//
// Aaron Boateng
//
// 2-12-2020
//
// This program asks the user for a number of values
// that they will enter. The user then enters the numbers
// and the program displays the numbers in forward, reverse, 
// and random order in which they were given.
//***************************************************
import java.util.Scanner;
import java.util.Random;
public class Reverser2_ATB
{
   public static void main (String []args)
   {
   // Initializing the Scanner and Random class, respectively.
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      int numval;
      System.out.print("/\\/\\/\\ Program Reverser /\\/\\/\\");
      System.out.print("\n\nNumber of values: ");
      numval = scan.nextInt();
   
   // Creating an array for the values
      double val[] =  new double[numval];
   
   // For loop that asks for the amount of each 
   // value from the number of values the user submitted
      for (int i=0; i < val.length; i++) {
         System.out.print("Enter value #" + (i + 1) + ": ");
         val[i] = scan.nextDouble();
      }
      System.out.println();
      System.out.println();
      System.out.print("In forward order ...\n");
   // For loop that prints the values in the order
   // they were submitted by the user
      for (int i=0; i < val.length; i++) {
         System.out.print(val[i] + " ");
      }
      System.out.println();
      System.out.println();
      System.out.print("In reverse order ...\n");
   // For loop that prints the values in the opposite
   // order that was submitted by the user
      for(int i=val.length; i > 0; i--) {
         System.out.print(val[(i-1)] + " ");
      }
      System.out.println();
      System.out.println();
      System.out.print("In random order ...\n");
    // For loop that prints the values in a random
   // order using the Random class
      for(int i=0; i < val.length; i++) {
         int r = generator.nextInt(numval); 
         double temp = val[i];
         val[i] = val[r];
         val[r] = temp;         
      }
      for (int i=0; i < val.length; i++) {
         System.out.print(val[i] + " ");
      }
   
   }
}