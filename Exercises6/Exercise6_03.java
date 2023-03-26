/*
(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
*/
import java.util.Scanner;

public class Exercise6_03 {
    public static void main(String[] args) {
        // Create a Scanner
	Scanner input = new Scanner(System.in); 

	// Prompt the user to enter an integer
	System.out.print("Enter an integer: ");
	int number = input.nextInt();

	// Report whether the integer is a palindrome.
	System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
    }

	// Method isPalindrome returns true if number is a palindrome
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	// Method reverse returns the reversal of an integer
	public static int reverse(int number) {
	        // Holds reversed number
		String reverse = ""; 
		// Convert number to string	
		String n = number + ""; 
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
		     reverse += n.charAt(i);
		}
		// Return reversed integer
		return Integer.parseInt(reverse); 
	}
}
