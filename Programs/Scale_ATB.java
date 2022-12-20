//**********************************************
// Scale_ATB.java
//
// 12-3-19
//
// Aaron Boateng
//
// Program asks user for a starting frequency.
// The program then calculates the frequencies
// for one octave of an ascending twelve-tone
// equally-tempered scale.
//**********************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Scale_ATB
{
   public static void main (String[]args)
   {
   
      Scanner scan = new Scanner(System.in);
      DecimalFormat dec = new DecimalFormat("0.00");
   
      double hz;
      System.out.print("<#><b><#><b> Scale <b><#><b><#>\n");
   
      System.out.print("\nEnter starting frequency (Hz): ");
      hz = scan.nextDouble();
   
      for ( int semi = 0; semi < 13; semi++) {
         System.out.print(dec.format(hz) + "\n");
         hz *= Math.pow(2,(1.0 / 12.0));
      }
   
   }
}