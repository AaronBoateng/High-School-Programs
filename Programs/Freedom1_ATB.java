//******************************************************************
// Freedom1_ATB.java
//
// Aaron Boateng
//
// 1-17-2020
//
// Program prompts user for the # of streams 
// they have acquired on the music streaming
// apps Spotify, Google Play, and Apple Music.
// The program then calculates the amount of revenue
// from each streaming service, calculates the the percent
// of total revenue and streams, and calculates the revenue
// from the streams altogether.
//*******************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Freedom1_ATB
{
   public static void main (String[] args) 
   {
   // Implementing the Scanner class and Decimal Format class
      Scanner scan = new Scanner(System.in);
      DecimalFormat dec = new DecimalFormat("0.####");
   // Initializing the amount of $$ per stream
   // from each streaming service into variables
      double spot = 0.0032;
      double spotrev = 0;
      double spotstr;
      double spotstrp;
      double spotrevp;
      double app = 0.0056;
      double appstr;
      double apprev = 0;
      double appstrp;
      double apprevp;
      double goo = 0.0055;
      double goostr;
      double goorev = 0;
      double goostrp;
      double goorevp;
      double allstr;
      double allrev;
   // Prompting user for the # of streams from each streaming service
      System.out.print("#-#-#-#-#-# Streams #-#-#-#-#-#");
      System.out.print("\n\nHow many streams from Spotify? ");
      spotstr = scan.nextDouble();
      System.out.print("\nHow many streams from Apple Music? ");
      appstr = scan.nextDouble();
      System.out.print("\nHow many streams from Google Play? ");
      goostr = scan.nextDouble();
      allstr = spotstr + appstr + goostr;
   // For Loops that calculated the amount of revenue from 
   // each streaming service
      for (int i = 0; i < spotstr; i++) {
         spotrev += spot;
      }
      for (int i = 0; i < appstr; i++) {
         apprev += app;
      }
      for (int i = 0; i < goostr; i++) {
         goorev+= goo;
      }
      allrev = spotrev + apprev + goorev;
   // If-Else that calculates the percentage of total revenue
   // and streams from each streaming service
      if (allstr == 0) {
         spotstrp = 0;
         appstrp = 0;
         goostrp = 0;
         spotrevp = 0;
         apprevp = 0;
         goorevp = 0;
      }
      else {
         spotstrp = (spotstr / allstr) * 100;
         appstrp = (appstr / allstr) * 100;
         goostrp = (goostr / allstr) * 100;
         spotrevp = (spotrev / allrev) * 100;
         apprevp = (apprev / allrev) * 100;
         goorevp = (goorev / allrev) * 100;
      }
   // Displaying the calculations in an organized format using \n
      System.out.print("\n----------------------------------------------\nSpotify\n");
   // Using DecimalFormat to find the specific amount of revenue
      System.out.print("\nEstimated revenue: $" + dec.format(spotrev));
      System.out.print("\n" + dec.format(spotstrp) + "% of total streams");
      System.out.print("\n" + dec.format(spotrevp) + "% of total revenue");
      System.out.print("\n----------------------------------------------");
      System.out.print("\nApple Music\n");
      System.out.print("\nEstimated revenue: $" + dec.format(apprev));
      System.out.print("\n" + dec.format(appstrp) + "% of total streams");
      System.out.print("\n" + dec.format(apprevp) + "% of total revenue");
      System.out.print("\n----------------------------------------------");
      System.out.print("\nGoogle Play\n");
      System.out.print("\nEstimated revenue: $" + dec.format(goorev));
      System.out.print("\n" + dec.format(goostrp) + "% of total streams");
      System.out.print("\n" + dec.format(goorevp) + "% of total revenue");
      System.out.print("\n----------------------------------------------");
      System.out.print("\n\nTotal # of streams: " + dec.format(allstr));
      System.out.print("\nTotal estimated revenue: $" + dec.format(allrev));
   
   
   }
}