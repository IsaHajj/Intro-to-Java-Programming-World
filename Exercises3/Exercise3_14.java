import java.util.Random;
public class Exercise3_14 {
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner hp = new java.util.Scanner(System.in);
        Random random = new Random();
        
        // Generate a random with integer 0, 1,
        int c = random.nextInt(2);
        
        // Prompts the user to guess whether it is head or tail
        System.out.print("Coin Flip. Enter 1 for head, 0 for Tail: ");
        int coinFlip = hp.nextInt();
        
        // Compute and display result
        if (coinFlip == c)
            System.out.println("You are Correct. ");
        else 
            System.out.println("You are Wrong! ");
    }
}
