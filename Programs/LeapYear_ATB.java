//**********************************************************
// LeapYear_ATB.java
//
// Aaron Boateng
//
// 11-25-2019
//
// Program asks user to enter a year, which the program then 
// calculates whether or not that year is a leap year, or if it 
// is invalid.
//**********************************************************
import java.util.Scanner;
public class LeapYear_ATB
{
   public static void main(String[]args)
   {
   
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Enter year: ");
   int year = scan.nextInt();
   
   if ( year < 1582 ) {
   System.out.print("\n" + year + " is invalid.");
   }
    else if ( year % 4 == 0 && year % 100 != 0 ) {
    System.out.print("\n" + year + " is a leap year.");
    }
    else if ( year % 400 == 0 ) {
    System.out.print("\n" + year + " is a leap year.");
    }
    else {
    System.out.print("\n" + year + " is NOT a leap year.");
    }
    
   }
}
    