/*
(Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the
ISBN number as a string.
*/
import java.util.Scanner;

public class Exercise4_19 {
   public static void main(String[] args) {
       // Create a Scanner
       Scanner input = new Scanner(System.in);
       
       // Prompt the user to enter the first 9 digits 
       System.out.print("Enter the first 9 digits of a ISBN: ");
       String isbn = input.nextLine();

       // Extract the digits of the ISBN
       int dig1 = Integer.parseInt(isbn.substring(0, 1));
       int dig2 = Integer.parseInt(isbn.substring(1, 2));
       int dig3 = Integer.parseInt(isbn.substring(2, 3));
       int dig4 = Integer.parseInt(isbn.substring(3, 4));
       int dig5 = Integer.parseInt(isbn.substring(4, 5));
       int dig6 = Integer.parseInt(isbn.substring(5, 6));
       int dig7 = Integer.parseInt(isbn.substring(6, 7));
       int dig8 = Integer.parseInt(isbn.substring(7, 8));
       int dig9 = Integer.parseInt(isbn.substring(8));

       // Compute dig10
       int dig10 = (dig1 * 1 + dig2 * 2 + dig3 * 3 + dig4 * 4 + dig5 * 5 + dig6 * 6 + dig7 * 7 + dig8 * 8 + dig9 * 9) % 11;

       // Display the 10-digit ISBN
       System.out.println("The ISBN-10 number is " + isbn + ((dig10 == 10) ? "X" : dig10));
   }
}
