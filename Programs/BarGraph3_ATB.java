//******************************************************
// BarGraph3_ATB.java
//
// Aaron Boateng
//
// 3-27-20
//
// Program that asks the user for scores from 0 to 100.
// The program then makes a horizontal bar graph using 
// asterisks as each value given.
//******************************************************
import java.util.Scanner;
public class BarGraph3_ATB
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("|+|+|+| Program BarGraph3 |+|+|+|\n\n");
      int num[] = new int[101];
      int h=0;
      int score;
      // Do While Loop that prompts the user for a # between 0-100
      do {
         System.out.print("Enter score between 0 and 100 (-1 to end): ");
         score = scan.nextInt();
      // If Statement that increments the # of stars for the given score
         if (score != -1) {
            num[score]++;
         }
      
      } while (score != -1); 
      
      // For Loop that calculates the height of the bar graph
      // by finding the largest incremented score   
      for (int a=0;a<101;a++) {
         if (num[a] > h) {
            h = num[a];
         }
      }
      
      // Printing the y-axis of the graph
      for (int p=h; p>0; p--) {
         if (p % 5 == 0 && p <= 5) {        
            System.out.print("\n\n " + p + "-|");
         }
         else if (p % 5 == 0 && p > 5) {
            System.out.print("\n\n" + p + "-|");
         }
         else {
            System.out.print("\n\n   |");
         }
         // For Loop that prints the stars
         for (int s=0;s<101;s++) {
            if (num[s] == p || num[s] == h || num[s] < h && num[s] > p ) {
               System.out.print("*");
            }
            else {
               System.out.print(" ");
            }
         }        
      }
      
      // Printing the x-axis of the graph      
      System.out.print("\n 0-+|");
      for (int j=1; j<=10; j++) {
         System.out.print("=========|");
      }
   
      System.out.print("\n    0");
   
      for (int i=1; i<=10;i++) {
         if ( i == 10 ) {
            System.out.print("         1");   
         }
         else {
            System.out.print("         " + i);
         }
      }
   
      System.out.print("\n\t           0");
   
      for (int k=0; k<9; k++) {
         System.out.print("         0");
      }
      System.out.print("\n                                                                                                        0");                                                                              
     
   }
}