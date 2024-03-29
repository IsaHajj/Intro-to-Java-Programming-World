/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
*/

public class Exercise3_02
{
   public static void main(String[] args)
   { 
       // Create a scanner
       java.util.Scanner input = new java.util.Scanner(System.in);
       
      // Generate three single-digit integers
      int digit1 = (int) (Math.random() * 10);
      int digit2 = (int) (Math.random() * 10);
      int digit3 = (int) (Math.random() * 10);
      
      // Prompt user to enter the multipilication of these three integer
      System.out.print("What is " + digit1 + " * " + digit2 + " * " + digit3 + " ? ");
      
      int answer = input.nextInt();
      System.out.println(digit1 + " * " + digit2 + " * " + digit3 + " = " + answer + " is " + (digit1 * digit2 * digit3 == answer));
   }
}
