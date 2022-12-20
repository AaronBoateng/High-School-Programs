//******************************************
// Exp_ATB.java
//
// Aaron Boateng
//
// 4-4-2021
//
// Program reverse engineers the program
// EXP.BAS and translates it from BASIC to
// Java.
//******************************************
import java.util.Scanner;
public class Exp_ATB
{
   public static void main (String[] args)
   {
   
      Scanner scan = new Scanner(System.in);
      
      double base,exp;
      int digit = 1000, carry,temp,sig = digit-1;
            
      System.out.print("<><><> Program Exp <><><>\n");
      
      // Creating an array
      int[]sum = new int[digit];
      sum[0]=1;
      
      // Prompting and checking the base
      
      System.out.print("Enter base? ");
      base = scan.nextDouble();
      
      while (base<0) {
         System.out.print("Invalid base!");
         System.out.print("\nEnter base? ");
         base = scan.nextDouble();
      }
      
      // Prompting and checking the exponent
      
      System.out.print("Enter exponent? ");
      exp = scan.nextDouble();
      
      while(exp<0) {
         System.out.println("Invalid exponent!");
         System.out.print("Enter exponent?");
         exp = scan.nextDouble();
      }
      
      if (base==0 && exp==0) {
         System.out.print("\n\nZero to the power zero is undefined!");
      }
      
      else if (exp>0 && base==0) {
         System.out.print("\n\n" + (int)base + " to the power " + (int)exp + " is: " +
            (int)base);
      }
      else if (base>0 && exp==0) {
         System.out.print("\n\n" + (int)base + " to the power " + (int)exp + " is: 1");
      }
      
      else {
         for (int i=1;i<sum.length;i++) {
            sum[i]=0;
         }
      
         for (int t=1;t<sum.length;t++) {
            carry=0;
            temp = (sum[t] * (int)base) + carry;
            sum[t] = (temp%10);
            carry = (temp/10);
         }
      
      }
      while (sum[sig]==0) {
         sig-=1;
      }
      System.out.print((int)base + " to the " + (int)exp + " power is: ");
      
      for (int u=sig;u>=0;u--) {
      
         System.out.print(sum[u]);
      
         if (u>0 && ((u%3)==0)) {
            System.out.print(",");
         }
      }
   }
}
  
