//**************************
// AT_ATB.java
//
// Aaron Boateng
//
// 4-28-2021
//
// Program simulates the flight profile
// of a projectile, while describing
// the environment, projectile and 
// launch conditions.
//**************************
import java.util.Scanner;
public class AT_ATB
{
   public static void main (String[] args)
   {
   
      Scanner scan = new Scanner(System.in);
   
      double prodia,promass,dragco,launcha,launchh,launchs,radian,veloh,velov,dh,dv;
      char detail;
   
      System.out.print("<*><*><*> Program AirTrajectory <*><*><*>\n\n");
   
   // Entering Projectile Parameters
   
      System.out.print("Enter Projectile Diameter (cm): " );
      prodia = scan.nextDouble();
   
      System.out.print("Enter Projectile Mass (g): ");
      promass = scan.nextDouble();
   
      System.out.print("Enter Drag Coefficient: ");
      dragco = scan.nextDouble();
   
   // Entering Launch Parameters
   
      System.out.println();
      System.out.print("Enter Launch Angle (degree): ");
      launcha = scan.nextDouble();
   
      System.out.print("Enter Launch Height (cm): ");
      launchh = scan.nextDouble();
   
      System.out.print("Enter Launch Speed (m/s): ");
      launchs = scan.nextDouble();
   
      System.out.println();
   
      
   // Calculating Conversions
   
      double prodia2 = prodia / 100;
      double promass2 = promass / 1000;
      double launchh2 = launchh / 100;
      radian = launcha * Math.PI / 180;
      veloh = launchs * Math.cos (Math.toRadians(launcha));
      velov = launchs * Math.sin(Math.toRadians(launcha));
   
   // Prompt user for details
   
      System.out.print("Display details (y/n)? ");
      detail = scan.next().charAt(0);
   
      System.out.print("\n\n3-2-1 ... Launch!");
      System.out.println();
      System.out.println();
   
   // Printing details (if user entered yes)
   
      if (detail == 'y') {
         System.out.println(" Time     X-Accel     X-Vel     Y-Vel " +
         "    X-Pos     Y-Pos");
         System.out.println("  (s)     (m/s^2)     (m/s)     (m/s) " +
         "     (m)       (m)");
         System.out.println("------    -------     -----     ----- " +
         "    -----     -----");
      }
   // Creating new variables from the calculations
   
      double posh = 0;
      double posv = launchh2;
      double area = Math.PI * Math.pow((prodia2/2), 2);
      double accelh = 0;
      double accelv = 0;
      double apgt = 0.0;
      double apg = posv;
    
      if (detail == 'y') {
         System.out.printf("%7.4f %10.2f %10.2f %10.2f %10.2f %9.2f %9.2f",
         0.0,accelh,accelv,veloh,velov,posh,posv);
            System.out.println();
      }
    
      double time = 0;
      double timedel = 0.1;
    
      for (double d=0.1; posv>0; d+=timedel) {
      
         dh = 0.5 * dragco * 1.162 * area * Math.pow(veloh, 2);
         dv = 0.5 * dragco * 1.162 * area * Math.pow(velov, 2);
      
      // Calculating the acceleration, change in velocity,
      // and change in position
      
         accelh = -dh / promass2;
         if (velov > 0) {
            accelv = ((-1*dv)/promass2) - 9.800;
         }
         else {
            accelv = (dv/promass2) - 9.800;
         }
      
         velov += (accelv*timedel);
         veloh += (accelh*timedel);
         posv += (velov*timedel);
         posh += (veloh*timedel);
      
         if (apg <= posv) {
            apg = posv;
            apgt = d;
         }
      
      // Printing the results
      
         if (detail == 'y') {
            System.out.printf("%7.4f %10.2f %10.2f %10.2f %10.2f %9.2f %9.2f",d,
               accelh,accelv,veloh,velov,posh,posv);
         }
         time = d;
      
      }
    
      double imps = Math.sqrt((Math.pow(veloh, 2) + Math.pow(velov, 2)));
      double impa = Math.atan(velov/veloh) * 180/Math.PI;
    
    // Printing Launch and Projectile Parameters
    
      System.out.println("\n\nProjectile Parameters ...");
      System.out.println("Diameter: " + prodia + " cm");
      System.out.println("Net Mass: " + promass+ " g");
      System.out.print("Drag Coeff: ");
      System.out.printf("%.2f" , dragco);
    
      System.out.println("\n\nLaunch Parameters ...");
      System.out.println("Launch Angle: " + launcha + " deg");
      System.out.println("Launch Height: " + launchh + " cm");
      System.out.println("Launch Speed: " + launchs + " m/s");
    
    // Printing the Flight Summary and Additional Info
    
      System.out.println("\nFlight Summary ...");
      System.out.printf("Flight Distance: %5.2f m @ %1.4f sec \n", posh, time);
      System.out.printf("Flight Apogee: %7.2f m @ %1.4f sec \n", apg, apgt);
      System.out.printf("Impact Speed: %8.2f m/s \n", imps);
      System.out.printf("Impact Angle: %8.1f deg \n", impa);
    
      double g = 9.8;
      double ad = 1.162;
      System.out.println("\nAdditional Info ...");
      System.out.printf("DELTA_T: %2.4f sec \nAir Den: %1.4f kg/m^3 \nGravity: " +
         "%1.4f m/s^2", timedel, ad, g);
   
   }
   
}
    
    
    


 
   
   
