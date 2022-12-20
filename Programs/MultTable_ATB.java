//*****************************************
// MultTable_ATB.java
//
// Aaron Boateng
//
// 12-10-2019
//
// Program creates an evenly formatted
// multiplication table that ranges
// from 1x1 to 10x10 
//*****************************************
public class MultTable_ATB
{
   public static void main (String []args) 
   {
   
   
   System.out.print(" x    1  2  3  4  5  6  7  8  9  10\n\t -------------------------------\n");
        
   //Nested For loop that performs the calculations for the table
   for (int num=1; num < 11; num++) {
   
     if (num == 10) {
     System.out.print(num + " |");
     }
        else {
        
        System.out.print(" " + num + " |");
        }
       
       int x=num;
      
      for (int num2=1; num2<11; num2++) {
           int mult=x*num2;
           
           if (num2 == 10) {
           System.out.printf(" %3d",mult);
           }
               else {
               System.out.printf("%3d",mult);
               }
        }
        System.out.print("\n");      
      }
      
   }
}