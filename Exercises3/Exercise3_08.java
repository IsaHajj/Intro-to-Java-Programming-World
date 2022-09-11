/*
(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
*/

public class Exercise3_08 {
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt user to enter three integers
        System.out.print("Enter Three Integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Sort numbers
        int temp;
        if (number2 < number1) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        if (number3 < number1) {
            temp = number1;
            number1 = number3;
            number3 = temp;
        }
        
        if (number3 < number2) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.println("The Sorted Numbers are: " + number1 + " " + number2 + " " + number3);
    }
}
