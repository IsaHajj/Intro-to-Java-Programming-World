/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
#10,000.
2. If all digits in the user input match all digits in the lottery number, the award is
#3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is
#1,000.
*/

public class Exercise3_15 {
   public static void main(String[] args) {
      //import & Create a Scanner
      java.util.Scanner input = new java.util.Scanner(System.in);
      
      // Generate a lottery using Math.random for three digit
      int lottery = (int) (Math.random() * 1000);
      
      // Prompt user to enter three digit numbers
      System.out.print("Enter Three digit numbers: ");
      int guess = input.nextInt();
      
      // Get digits
      int d1 = lottery / 100;
      int d2 = lottery % 100 / 10;
      int d3 = lottery % 10;
      
      // Get guess
      int g1 = guess / 100;
      int g2 = guess % 100 / 10;
      int g3 = guess % 10;
      
      System.out.println("Lottery is " + lottery);
      
      // Check the guess and display result
      if (guess == lottery) 
          System.out.println("Exact Matched: You win #10,000 ");
      else if (g1 == d1 && g3 == d2 && g2 == d3 || g2 == d1 &&
               g1 == d2 && g3 == d3 || g2 == d1 && g3 == d2 &&
               g1 == d3 || g3 == d1 && g1 == d1 && g2 == d3 ||
               g3 == d1 && g2 == d2 && g1 == d3)
          System.out.println("Matched all digits: You win #3,000 ");
      else if (g1 == d1 || g1 == d2 || g1 == d3 || g2 == d1 ||
               g2 == d2 || g2 == d3 || g3 == d1 || g3 == d2 ||
               g3 == d3)
          System.out.println("Matched One digit: You win #1,000 ");
      else {
          System.out.println("Sorry, no match ");
      }
               
   }
}
