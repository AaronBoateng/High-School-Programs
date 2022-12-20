import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
//**************************
// Partition_ATB.java
//
// Aaron Boateng
//
// 1-24-2021
//
// Program prompts user for 
// a text file, then does a
// timed partitioning of the 
// input set
//**************************

public class Partition_ATB
{
   public static void main(String[] args) 
   {
   
      Scanner scan = new Scanner(System.in);
      DecimalFormat dec = new DecimalFormat("0.00000000");
   
      double ros;
      int n,h=0,k=0,sum=0,sum1=0,sum2=0,counter=0,counter2=0;
      String fn;
   
      System.out.print("*** P|r|o|g|r|a|m|-|P|a|r|t|i|t|i|o|n ***\n\n");
      System.out.print("Input file name: ");
      fn = scan.nextLine();
   
   // Algorithm 1
   
      System.out.print("\n############################################\n");
      System.out.print("Algorithm: EvenOdd\n");
   
      int userArray[] = readIntFile(fn);
      n = userArray.length;
   
      for (int i=0; i<userArray.length; i++) {
         sum += userArray[i];
      }
   
      System.out.println("n: " + n + ", Sum: " + sum);
      System.out.println("Partitioning ...");
   
   // Creating an array for each subset
   
      for (int i=0; i<userArray.length; i++) {
         if (userArray[i] % 2 == 0) {
            counter++;
         }
      }
   
      for (int i=0; i<userArray.length; i++) {
         if (userArray[i] % 2 == 1) {
            counter2++;
         }
      }
   
      int even[] = new int[counter];
      int odd[] = new int[counter2];
   
      long et = System.nanoTime();
   
   // Assigning variables to each subset
   
      for(int i=0; i<userArray.length; i++) {
         if (userArray[i] % 2 == 0) {
            even[h] = userArray[i];
            h++;
         }
      }
   
      for (int i=0; i<userArray.length; i++) {
         if (userArray[i] % 2 == 1) {
            odd[k] = userArray[i];
            k++;
         }
      }
   
      et = System.nanoTime() - et;
   
   // Calculating the sum of each subset
   
      for (int i=0; i<=even.length-1; i++) {
         sum1 += even[i];
      }
   
      for (int i=0; i<=odd.length-1; i++) {
         sum2 += odd[i];
      }
   
      System.out.print("Sum1: " + sum1);
      System.out.print(", Sum2: " + sum2);
   
   // Calculating the ROS
   
      if (sum1 > sum2) {
         ros = (double)sum1 / (double)sum2;
      }
      else {
         ros = (double)sum2 / (double)sum1;
      }
   
   //Converting the ROS into DecimalFormat
   
      System.out.print("\nROS: " + dec.format(ros));
      System.out.print(", ET: ");
      System.out.printf("%.2e nsecs",(double)et);
      System.out.println();
      System.out.println();
   
   // Writing the output file for each subset
   
      writeIntFile("evenodd_s1_" + fn, even);
      writeIntFile("evenodd_s2_" + fn, odd);
      System.out.print("#############################################");
   }
   
   
   public static void writeIntFile(String outFileName, int[] intArray)
   {
      File file = new File(outFileName);
   
   // open output file for writing
      System.out.println("Writing output file: " + outFileName);
      PrintWriter output = null;
      try
      {
         output = new PrintWriter(file);
      }
      catch (FileNotFoundException ex)
      {
         System.out.println("File write error, cannot create: " + outFileName);
         System.exit(1); // quit the program
      }
   
   // write the integers to the file
      for (int i=0;i<intArray.length;i++)
      {
         output.print(String.valueOf(intArray[i]) + " ");
      }
      output.close();

      
   
   } // end writeIntFile

   public static int[] readIntFile(String inFileName) {
      // open input file
      System.out.println("Reading input file: " + inFileName);
      File file = new File(inFileName);
      Scanner input = null;
      try {
         input = new Scanner(file);
      }
      catch (FileNotFoundException ex) {
         System.out.println();
         System.out.println("File read error, cannot open: " + inFileName);
         System.exit(1); // quit the program
      }
   
      // determine input file size
      int n = 0;
      while (input.hasNextInt()) {
         input.nextInt();
         n++;
      }
      input.close();
   
      // read integers from input file and store them in an array
      try {
         input = new Scanner(file);
      }
      catch (FileNotFoundException ex) {
         System.out.println("File read error, cannot open: " + inFileName);
         System.exit(1); // quit the program
      }
      int[] intArray = new int[n];
      for (int i=0;input.hasNextInt();i++) {
         intArray[i] = input.nextInt();
      }
      input.close();
      
      // return integer array to calling method
      return intArray;
   
   } // end readIntFile

}
   
   
   
   
   
   
   
   
