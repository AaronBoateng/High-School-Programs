//***********************************
// BarGraph2_ATB.java
//
// 3-5-20
//
// Aaron Boateng
//
// Program that asks the user for int values from
// 1-100, then displays a bar graph in the form of
// asterisks that show the # of values in each set
// of 5 e.g. 1-5, 6-10, 96-100, etc.
//************************************
import java.util.Scanner;
public class BarGraph2_ATB
{
   public static void main (String []args) 
   {
      int val;
      Scanner scan = new Scanner(System.in);
      System.out.print("|*|*|*| Program BarGraph2 |*|*|*|\n\n");
   // Creating an array to print the # of stars 
      int num[] = new int[20];
      int n=1;
      int m=5;
   // Do While loop that prompts the user for each value,
   // and stops when the user enters 0
      do {
         System.out.print("Enter value between 0 and 100 (0 to end): ");
         val = scan.nextInt();
      // If Statement that records the # of stars needed
      // for each set of 10
         if (val != 0) {
            num[(val-1)/5]++;   
         }
      }  while (val != 0);
      int k=0;
       // For loop that prints the sets of 10 using printf
      for (int j=0; j < 20;j++) {
         System.out.println();
         System.out.printf("%2d - %3d | ",n,m);
      // If Statement that uses a For loop to print the stars 
            for (int q=0;q < num[j];q++) {
               System.out.print("#");
            }
      // Adding 10 to m and n to increase the sets and make
      // the graph accurate
         m+=5;
         n+=5;
      
      }
   }
}
