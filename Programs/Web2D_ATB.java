//**************************************************
// Draw2D_ATB.java
//
// Aaron Boateng
//
// 3-30-2020
//
// Program that asks the user for an x and y
// coordinate pair (only values of 0-10, inclusive),
// and continues doing so until the user ends the
// input by entering the sentinel value, -1. The 
// program then creates a two-dimensional graph
// using the coordinates given.
//***************************************************
import java.util.Scanner;
public class Web2D_ATB
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner(System.in);
   int x,y;
   int axis1[] = new int[11];
   int axis2[] = new int[11];
   
   System.out.print("|*|*|*| Program Draw2D |*|*|*|\n\n");
   
   do {
   System.out.print("Enter \"x\" coordinate (-1 to end): ");
   x = scan.nextInt();
   System.out.println();
      if (x != -1) {
      axis1[x]++;
      System.out.print("Enter \"y\" coordinate: ");
      y = scan.nextInt();
      System.out.println();
      axis2[y]++;
      }
       }  while (x != -1);
      
      
   }
   
}
   
   
   