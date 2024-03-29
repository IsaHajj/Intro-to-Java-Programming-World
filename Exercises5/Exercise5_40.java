/*
(Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.
*/

public class Exercise5_40 {
    public static void main(String[] args) {
       // Counts the number of heads, tails and coin
       int heads, tails, coin; 
       
       // Initialize heads and tails to 0; 
       heads = tails = 0;	

       // Simulate flipping a coin one millon times
       System.out.println("Fipping a coin one millon times..");
       for (int i = 0; i < 1000000; i++) {
       
       // Generate randomly 0 or 1.
       // If 0 increament heads otherwise increment tails
       coin = (int)(Math.random() * 2) == 0 ? heads++ : tails++; 
       }

       // Display results
       System.out.println("Heads: " + heads + "\nTails: " + tails);
    }
}
