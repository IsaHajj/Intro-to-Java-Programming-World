/*
(Financial application: monetary units) Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.
*/
import java.util.Scanner;

public class Exercise3_07 {
   public static void main(String [] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Receive the amount
      System.out.print("Enter the amount in double, for example 11.56: ");
      double amount = input.nextDouble();
      
      int remainingAmount = (int)(amount * 100);
      
      // Find the number of one dollars
      int numberOfOneDollars = remainingAmount / 100;
      remainingAmount = remainingAmount % 100;
      
      // Find the number of quarters in the remaining amount
      int numberOfQuarters = remainingAmount / 25;
      remainingAmount = remainingAmount % 25;
      
      // Find the number of dime in the remianing amount
      int numberOfDimes = remainingAmount / 10;
      remainingAmount = remainingAmount % 10;
      
      // Find the number of nickel in the remaining amount
      int numberOfNickels = remainingAmount / 5;
      remainingAmount = remainingAmount % 5;
      
      // Find the number of penny in the remaining amount
      int numberOfPennies = remainingAmount;
      
      // Display resultd
      System.out.println("Your amount " + amount + " consist of");
      System.out.println(" " + numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar" : " dollars"));
      System.out.println(" " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
      	System.out.println(" " + numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes"));
      	System.out.println(" " + numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));
      	System.out.println(" " + numberOfPennies + (numberOfPennies == 1 ? " penny" : " pennies"));
   }
}
