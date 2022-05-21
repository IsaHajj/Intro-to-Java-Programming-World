/*
Therefore, the input needed for the program is the monthly interest rate, the length of the
loan in years, and the loan amount.

The output is the monthly payment and total payment.

Implementation is also known as coding (writing the code). In the formula, you have to com-
pute (1 + monthlyInterestRate)numberOfYears * 12, which can be obtained using Math.pow(1 + monthlyInterestRate, numberOfYears * 12).
*/
import java.util.Scanner;

public class ComputeLoan { 
    public static void main(String[] args) {
        Scanner top = new Scanner(System.in);
        
        // Prompt user to enter annual interest rate in percentage
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = top.nextDouble();
        
        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        // Prompt user to enter number of years
        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = top.nextInt();
        
        //Prompt user to enter loan amount
        System.out.println("Enter loan amount: ");
        double loanAmount = top.nextDouble();
        
        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        // Display result
        System.out.println("The monthly payment is #" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is #" + (int)(totalPayment * 100) / 100.0);

    }
}
