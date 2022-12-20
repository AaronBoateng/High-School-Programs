//*****************************************
// Flowchart.java
//
// Aaron Boateng 10/08/2019
//
// Program asks if something moves and asks 
// a follow up question with if should it move.
// Based on the answer given, an if-else statement 
// is used to answer both these questions and
// gives a final answer at the end.
//*****************************************
import java.util.Scanner;
public class Flowchart_ATB 
{
   public static void main (String []args) 
   {
   
   Scanner scan = new Scanner(System.in);
   
   char move,stop;
   
   System.out.println("<><><><><><> Engineering Flowchart <><><><><><>");
   System.out.println();
   
   System.out.print("Does it move? ");
   move = scan.next().charAt(0);
   
      if ( move == 'y'|| move == 'Y' ){
      System.out.print("Should it? ");
      stop = scan.next().charAt(0);
      
         if ( stop == 'y'|| stop == 'Y' ){
         System.out.print("\nNo Problem! ");
         }
         if ( stop == 'n'|| stop == 'N' ){
         System.out.print("\nDuct Tape! ");
         }
      }
      
      if ( move == 'n' || move == 'N' ){
      System.out.print("Should it? ");
      stop = scan.next().charAt(0);
         if (stop == 'n'|| stop == 'N' ){
         System.out.print("\nNo problem! ");
         }
         if (stop == 'y'|| stop == 'Y' ){
         System.out.print("\nWD-40!");
         }
         
      }
         
         
         
      }
      
}
      
   
   