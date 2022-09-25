/**
(Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in pounds).

                        | 3.5, if 0 < w < = 1
                        | 5.5, if 1 < w < = 3
                 c(w) = |
                        | 8.5, if 3 < w < = 10
                        | 10.5, if 10 < w < = 20
                        
Write a program that prompts the user to enter the weight of the package and
displays the shipping cost. If the weight is negative or zero, display a message
“Invalid input.” If the weight is greater than 20, display a message “The package
cannot be shipped.” 
*/                     
public class Exercise3_18 
{
    public static void main(String[] args)
    {
        //import and Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt the user to enter the weight of the package
        System.out.print("Enter The Weight of the Package: ");
        double weight = input.nextDouble();
        
        // Calculate the cost and display the result
        if (weight > 20)
            System.out.println("The Package cannot be shipped. ");
          
        else {
            double costPerPound;
        if (weight < 0 && weight <= 2)
            costPerPound = 2.5;
        else if (weight <= 4)
            costPerPound = 4.5;
        else if (weight <= 10)
            costPerPound = 7.5;
        else
            costPerPound = 10.5;
            System.out.println("Shipping cost of Package is #" + costPerPound * weight); 
       }
    }
}
