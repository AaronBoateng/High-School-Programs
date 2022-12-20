//*******************************************
// RPS_ATB.java
//
// Aaron Boateng 10-23-2019
//
// Program asks for the user to choose rock,
// paper, or scissors. Then the program makes 
// a choice of its own using the random class
// and determines who won the game
//*******************************************
import java.util.Scanner;
public class RPS_ATB
{
   public static void main (String []args) 
   {
   
   Random generator = new Random();
   int compchoice = generator.nextInt(3);
   char mychoice;
   
   System.out.print("(R)(P)(S) ===> Rock-Paper-Scissors <=== (S)(P)(R)");
   System.out.println();
   
   
   System.out.print("Enter your choice (R, P, or S): ");
   mychoice = input.next().charAt(0);
   
   if (mychoice != 'r' && mychoice != 'p' && mychoice != 's') {
   while (mychoice != 'r' && mychoice != 'p' && mychoice != 's') {
   System.out.println();
   System.out.print("Invalid choice!\n");
   System.out.print("Enter your choice (R, P, or S): ");
   mychoice = input.next().charAt(0);
   }
   }
   
   if (mychoice == 'r' || mychoice == 'R') {
   if (compchoice == 0) {
   System.out.print("\nMachine's choice: Rock!\nDraw!");
   }
   else if (compchoice == 1) {
   System.out.print("\nMachine's choice: Paper!\nPaper covers rock! You lose!");
   }
   else if (compchoice == 2) {
   System.out.print("\nMachine's choice: Scissors!\nRock beats scissors! You win!");
   }
   }
   
   
   
   

   