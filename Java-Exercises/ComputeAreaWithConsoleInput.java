/*
This statement reads a number from the keyboard and assigns the number to radius.
*/

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
   public static void main(String [] args) {
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
   
      // Prompt the user to enter a radius
      System.out.print("Enter the number for radius: ");
      double radius = input.nextDouble();
   
      // Compute area
      if (radius < 1) {
         System.out.println("Incorrect input");
      }
      else {
      double area = radius * radius * 3.14159;
      
      // Display result
      System.out.println("The area for the circle of radius " + radius + " is " + area);
       }
      }
   }
