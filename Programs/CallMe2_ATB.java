//****************************************
// Name: Aaron Boateng
// Program: CallMe2
// Date: 9-24-2019
// Description: The program prints out two random
// phone numbers, one using the Random class,
// one using the Math class.
//****************************************
import java.util.Random;
public class CallMe2_ATB 
{
   public static void main (String []args) 
   {
   Random generator = new Random();
   
   int r1 = generator.nextInt(800) + 200;
   int r2 = generator.nextInt(800) + 200;
   int r3 = generator.nextInt(10);
   int r4 = generator.nextInt(10);
   int r5 = generator.nextInt(10);
   int r6 = generator.nextInt(10);
   
   
   System.out.print("Using the \"Random\" class: " + r1 + "-" + r2 + "-" + r3 + r4 + r5 + r6);
   System.out.println();
   
   System.out.print("Using the \"Math\" class:   ");
   System.out.print((int)(Math.random() * 800 + 200) + "-");
   System.out.print((int)(Math.random() * 800 + 200) + "-");
   System.out.print((int)(Math.random() * 10));
   System.out.print((int)(Math.random() * 10));
   System.out.print((int)(Math.random() * 10));
   System.out.print((int)(Math.random() * 10));
   
   
   
   
   
   }
}