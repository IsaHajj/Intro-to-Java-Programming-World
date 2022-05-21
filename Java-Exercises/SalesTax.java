// Displays the sales tax with two digits after the decimal point

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
       Scanner top = new Scanner(System.in);
        
       System.out.println("Enter purchaseAmount amount: ");
       double purchaseAmount = top.nextDouble();
        
       double tax = purchaseAmount * 0.09;
       System.out.println("SalesTax is # " + (int) (tax * 100) / 100.0);
    }
}
