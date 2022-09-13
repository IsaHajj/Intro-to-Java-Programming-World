/*
(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition question
with two integers less than 100.
*/

public class Exercise3_10
{ 
   public static void main(String[] args)
   {
      // Generate a muntiplication with two integer less than 1000
      int num1 = (int) (Math.random() * 35);  
      int num2 = (int) (Math.random() * 35); 
      
      // Swap num1 with num2 if num1 < num2
      if (num1 < num2) {
          int temp = num1;
              num1 = num2;
              num2 = temp;
       }
       
       // Create a Scanner
       java.util.Scanner input = new java.util.Scanner(System.in);
       
       // Prompt user to answer " What is num1 * num2? "
       System.out.print("What is " + num1 + " * " + num2 + " ? ");
       int answer = input.nextInt();
       
       // Calculate and display result
       if (num1 * num2 == answer) 
          System.out.println("Your answer is Correct. ");
          
       else 
          System.out.println("Your answer is Wrong! ");  
          System.out.println(num1 + " * " + num2 + " Should be " + (num1 * num2));
    }
}        
