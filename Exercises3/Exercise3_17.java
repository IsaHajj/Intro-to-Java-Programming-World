/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.
*/

public class Exercise3_17 {
    public static void main(String[] args) {
        //impot & Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Create a random integer of 0, 1, 2,
        int book = (int) (Math.random() * 3);
        
        // Prompts user to enter number 0, 1, or 2,
        System.out.print("Scissor (0), Rock (1), Paper (2): ");
        int pen = input.nextInt();
        
        System.out.print("The Book is ");
        if (book == 0) 
            System.out.print("Scissor.");
        else if (book == 1) {
                 System.out.print("Rock.");
        }
        else if (book == 2) {
                 System.out.print("Paper.");
        }
        System.out.print(" You are ");
        if (pen == 0) 
            System.out.print("Scissor");
        else if (pen == 1) {
                 System.out.print("Rock");
        }
        else if (pen == 2) {
                 System.out.print("Paper");
        }
        
        // Display result
        if (book == pen)
            System.out.println(" too. It is a draw");
        else { 
        boolean win = (pen == 0 && book == 2) || (pen == 1 && book == 0) || (pen == 2 && book == 1);
        if (win)
            System.out.println(". You Won");
        else
            System.out.println(". You Lose");
        }
        
    }
}
