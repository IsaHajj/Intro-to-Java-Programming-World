/*
(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
*/
import java.util.Scanner;

public class Exercise5_38 {
   public static void main(String[] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in); 

      // Prompt the user to enter a decimal integer
      System.out.print("Enter a decimal integer: "); 
      int decimal = input.nextInt();

      // Convet decimal to octal
      String octal = "";      // Hold octal value
      for (int i = decimal; i > 0; i /= 8) {
	   octal = i % 8 + octal;
      }

      // Display results
      System.out.println("The octal of " + decimal + " is " + octal);
    }
}
