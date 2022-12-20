//******************************************
// Program: Distance3D
//
// Name: Aaron Boateng
//
// Date: 9-30-2019
//
// Description: The program asks for the x,y, and z coordinates for two points.
// The program then calculates the distance between two points in
// 3D space.
//******************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Distance3D_ATB
{
   public static void main (String []args)
   {
   
   Scanner scan = new Scanner(System.in);
   DecimalFormat abc = new DecimalFormat ("0.###");
   int x1,y1,z1;
   int x2,y2,z2;
   
   System.out.println("Program Distance3D: Calculates the distance between two points in 3D space.");
   System.out.println();
   
   System.out.print("Enter x1: ");
   x1 = scan.nextInt();
   System.out.print("Enter y1: ");
   y1 = scan.nextInt();
   System.out.print("Enter z1: ");
   z1 = scan.nextInt();
   System.out.println();
   
   System.out.print("Enter x2: ");
   x2 = scan.nextInt();
   System.out.print("Enter y2: ");
   y2 = scan.nextInt();
   System.out.print("Enter z2: ");
   z2 = scan.nextInt();
   System.out.println();
   
   double dist = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) + (z1-z2) * (z1-z2));
   
   System.out.print("The distance between (" + x1 + "," + y1 + "," + z1 + ") and (" + x2 + "," + y2 + "," + z2 + ") is: " + abc.format(dist));
   
   }
}  
   