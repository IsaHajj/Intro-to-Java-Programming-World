/*
This program obtains minutes and remaining seconds from an amount of time
in seconds. For example, 500 seconds contains 8 minutes and 20 seconds.
*/

import java.util.Scanner; 

public class DisplayTime {
    public static void main(String[] args) { 
       Scanner scan = new Scanner(System.in);
       // Prompt the user to enter an integer for input
       System.out.println("Enter an integer for seconds: ");
       int seconds = scan.nextInt();
       
       // Find minutes in seconds 
       int munites = seconds / 60; 
       // Find Seconds remaining
       int remainingSeconds = seconds % 60; 
       
       // Display result
       System.out.println(seconds + " seconds is " + munites + " munites and " + remainingSeconds + " seconds ");
   } 
}
