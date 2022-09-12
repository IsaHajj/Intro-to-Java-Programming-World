/*
(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other nine digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. Here are sample runs:
*/

public class Exercise3_09 {
    public static void main(String[] args) {
       // Create a Scanner
       java.util.Scanner input = new java.util.Scanner(System.in);
       
       // Prompt user to Enter the first 9 digit of an ISBN as integer
       System.out.print("Enter the First 9 digit of an ISBN: ");
       int isbn = input.nextInt();
       
       // Generate the 10 digit
       int digit9 = isbn % 10;
       int currentLength = isbn / 10;
       int digit8 = currentLength % 10;
       currentLength = currentLength / 10;
       int digit7 = currentLength % 10;
       currentLength = currentLength / 10;
       int digit6 = currentLength % 10;
       currentLength = currentLength / 10;
       int digit5 = currentLength % 10;
       currentLength = currentLength / 10;
       int digit4 = currentLength % 10;
       currentLength = currentLength / 10;
       int digit3 = currentLength % 10;
       currentLength = currentLength / 10;
       int digit2 = currentLength % 10;
       currentLength = currentLength / 10;
       int digit1 = currentLength % 10;
       currentLength = currentLength / 10;
       
       // Compute the 10 check sum and display result
       int checkSum = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
       
       boolean len = isbn < 100000000;
       
       if (checkSum == 10) {
          if (len)
              System.out.println("The ISBN-10 Number is 0" + isbn + "X");
       else 
              System.out.println("The ISBN-10 Number is " + isbn + "X");
       } else {
          if (len)
              System.out.println("The ISBN-10 Number is 0" + isbn + checkSum);
         else
              System.out.println("The ISBN-10 Number is " + isbn + checkSum);
       }
    }
}
