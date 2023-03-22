/*
(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings.
*/
import java.util.Scanner;

public class Exercise5_51 {
    public static void main(String[] args) {
        // Create a Scanner
	Scanner input = new Scanner(System.in);

	// Prompt the user to enter two strings
	System.out.print("Enter the first string: ");
	String str1 = input.nextLine();
	System.out.print("Enter the second string: ");
	String str2 = input.nextLine();

	int index = 0;	        // Initialize index to 0
	String prefix = "";	// Initialize prefix as empty string

	// Get the largest commmon prefix of the two strings
	while (str1.charAt(index) == str2.charAt(index)) {
	       prefix += str1.charAt(index);
	       index++;
	}

	// Display the result
	if (prefix.length() > 0)
	    System.out.println("The commmon prefix is " + prefix);
	else
	    System.out.println(str1 + " and " + str2 + " have no commmon prefix");
    }
}
