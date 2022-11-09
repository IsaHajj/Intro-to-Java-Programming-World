/*
(Find the Unicode of a character) Write a program that receives a character and
*/
import java.util.Scanner;

public class Exercise4_09 {
   public static void main(String[] args) {
     // Creata a Scanner
     Scanner input = new Scanner(System.in);
    
     // Prompt the user to enter a character
     System.out.print("Enter a character: ");
     String s = input.nextLine();
     char ch = s.charAt(0);

     // Display Unicode of character
     System.out.println((int)ch);
  }
}
