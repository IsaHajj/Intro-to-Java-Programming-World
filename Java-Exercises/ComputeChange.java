/*
Here are the steps in developing the program:

1. Prompt the user to enter the amount as a decimal number, such as 11.56.
2. Convert the amount (e.g., 11.56) into cents (1156).
3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using
the cents remainder 100.
4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
cents using the remaining cents remainder 25.
5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining
cents using the remaining cents remainder 10.
6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining
cents using the remaining cents remainder 5.
7. The remaining cents are the pennies.
8. Display the result.
*/
import java.util.Scanner;

public class ComputeChange 
{
    public static void main(String[] args)
    {
       // Create a Scanner
       Scanner jet = new Scanner(System.in);
       
       // Receive the amount
       System.out.println("Enter an amount in double: ");
       double amount = jet.nextDouble();
       
       int remainingAmount = (int) (amount * 100);
       
       // Find the number of one Dollars
       int numberOfOneDollars = remainingAmount / 100;
       remainingAmount = remainingAmount % 100;
       
       // Find the number of quarters in the remaining amount
       int numberOfQuarters = remainingAmount / 25;
       remainingAmount %= 25;
       
       // Find the number of Dimes in the remaining amount
       int numberOfDimes = remainingAmount / 10;
       remainingAmount = remainingAmount % 10;
       
       // Find the number of nickels in the remaining amount
       int numberOfNickels = remainingAmount / 5;
       remainingAmount = remainingAmount % 5;
       
       // Find the number of pennies in the remaining amount
       int numberOfPennies = remainingAmount;
       
       // Display results
       System.out.println("Your amount " + amount + " consists of");
       System.out.println(" " + numberOfOneDollars + " dollars ");
       System.out.println(" " + numberOfQuarters + " quarters ");
       System.out.println(" " + numberOfDimes + " dimes ");
       System.out.println(" " + numberOfNickels + " nickels ");
       System.out.println(" " + numberOfPennies + " pennies ");
   }
}    
