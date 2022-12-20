//**************************************
// Triangles.java
//
// Aaron Boateng 10/10/19
//
// The program asks for the length of each 
// side of a triangle and dictates whether 
// the lengths could possibly make a triangle,
// it then checks if it could be a right triangle 
// as well (if the lengths are deemed to be a
// possible triangle).
//**************************************
import java.util.Scanner;
public class Triangles_ATB {

   public static void main (String []args) {
   
   
   Scanner scan = new Scanner(System.in);
   double s1,s2,s3;   
   
   System.out.println("(a)(b)(c) Program Triangles (c)(b)(a)");
   System.out.println();
   
   System.out.print("Enter length of side a: ");
   s1 = scan.nextDouble();
   System.out.print("Enter length of side b: ");
   s2 = scan.nextDouble();
   System.out.print("Enter length of side c: ");
   s3 = scan.nextDouble();
   System.out.println();
   
      
      
      if ( (s1 * s1) + (s2 * s2) == (s3 * s3) || (s2 * s2) + (s3 * s3) == (s1 * s1) || (s3 * s3) + (s1 * s1) == (s2 * s2) ) {
      System.out.print("It's a right triangle!");
      }
         else if ( s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {

         System.out.print("It's a triangle, but not a right triangle!");
         }
            else {
            System.out.print("Sorry! It's not a triangle!");  
            }
      
      
   }
}
      
      
   
   
   