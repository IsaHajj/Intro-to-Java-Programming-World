/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.
*/
import java.util.Scanner;

public class Exercise3_05 {
   public static void main(String[] args) {
       // Create a scanner
       java.util.Scanner input = new java.util.Scanner(System.in);
       
       // Prompt user to enter today's day
       System.out.print("Enter today's day: ");
       int day = input.nextInt();
       
       // Prompt user to enter number of days elapsed since today
       System.out.print("Enter the number of days elapsed since today: ");
       int daysElapsed = input.nextInt();
       
       // Calculate the future day
       int futureDay = (day + daysElapsed) % 7;
       
       System.out.print("Today is ");
       switch (day) {
       case 0: System.out.print("Sunday"); break;
       case 1: System.out.print("Monday"); break;
       case 2: System.out.print("Tuesday"); break;
       case 3: System.out.print("Wednesday"); break;
       case 4: System.out.print("Thursday"); break;
       case 5: System.out.print("Friday"); break;
       case 6: System.out.print("Saturday"); 
       }
       
       System.out.print(" and the future day is ");
       switch (futureDay) {
       case 0: System.out.println("Sunday"); break;
       case 1: System.out.println("Monday"); break;
       case 2: System.out.println("Tuesday"); break;
       case 3: System.out.println("Wednesday"); break;
       case 4: System.out.println("Thursday"); break;
       case 5: System.out.println("Friday"); break;
       case 6: System.out.println("Saturday");
       }
       
   }
}
