//**************************************************************
// HiLo_ATB.java
//
// 1-6-2020
//
// Aaron Boateng
//
// Program randomly generates a number between 1 and 100
// (inclusive) and the user tries to guess what that 
// number is. After however many tries it takes the 
// user to guess correct, the program says how many times
// it took the user to guess and asks if they want to play again.
//***************************************************************
import java.util.Scanner;
import java.util.Random;

public class HiLo_ATB
{
   public static void main (String []args)
   {
      // Implementing Random and Scanner class
      Random generator = new Random();
      Scanner scan = new Scanner(System.in);
      // Generating a number from the Scanner class 
      // that the user will try to identify
      int comp = generator.nextInt(99) + 1;
      int user,guess = 0;
      char play = 'y';
      System.out.print("====== Program HiLo ======\n");
      // Nested Do While Loop that asks user to guess for the 
      // unknown number
      do { 
      
         System.out.print("\nI'm thinking of a number between 1 and 100 (inclusive) ...\n");
         System.out.print("\nYour guess? ");
         user = scan.nextInt();
        
         if ( user == comp ) {
            System.out.print("You got it! My number was " + comp + ". It took you only one guess! Play again (y/n)? ");
            play = scan.next().charAt(0);
         }
         // If Statment that generates a new
         // number if they want to play again
         if ( play == 'y' ) {
            comp = generator.nextInt(99) + 1;
         }
      
      
         do {  
            // While Loop inside the Do While to make 
            // sure the Do is still going until the
            // number is found
            while ( user != comp ) {
            
               if ( user < comp ) {
                  System.out.print("Too low! Your guess? ");
                  user = scan.nextInt();
                  guess++;
               }
               else if ( user > comp ) {
                  System.out.print("Too high! Your guess? ");
                  user = scan.nextInt();
                  guess++;
               }
            
            }
         
            if ( user == comp ) {
               guess++;
               System.out.print("You got it! My number was " + comp + ". It took you " + guess + " guesses. Play again (y/n)? ");
               play = scan.next().charAt(0);
               guess = 0;
            }
         
         } while ( user != comp );
      
      }  while( play == 'y');
      
        
   }
   
}
   
   
