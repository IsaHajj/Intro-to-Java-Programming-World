/*
A constant must be declared and initialized in the same statement. The word final is a
Java keyword for declaring a constant. By convention, all letters in a constant are in uppercase, e.g PI.
*/
import java.util.Scanner; 

public class ComputeAreaWithConstant {

   public static void main(String [] args) {
   
      final double PI = 3.14159;
      
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter a radius
      System.out.print("Enter the number for radius: ");
      double radius = input.nextDouble();
      
      // Compute area
      double area = radius * radius * PI;
      
      // Display result
      System.out.println("The area for the circle of radius " + radius + " is " + area);
   }
}
