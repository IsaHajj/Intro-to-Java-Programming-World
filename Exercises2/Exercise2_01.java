/**
(Convert mile to kilometer) Write a program that reads a mile in a double value
from the console, converts it to kilometers, and displays the result. The formula
for the conversion is as follows:
1 mile = 1.6 kilometers
*/
import java.util.Scanner; 

public class Exercise2_01 {
   public static void main(String[] args) {
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter miles
      System.out.print("Enter miles: ");
      double miles = input.nextDouble();
      
      // Compute kilometers
      double kilometers = miles * 1.6;
      
      // Displays results
      System.out.println((int)miles + " miles is " + (int)(kilometers * 100) / 100.0 + " kilometers");
   }
}
