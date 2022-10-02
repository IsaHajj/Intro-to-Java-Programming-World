/*
(Geometry: point in a circle?) Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0)
with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
circle, as shown in Figure 3.7a.
*/

public class Exercise3_22 {
    public static void main(String[] args) {
        //import and Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompts the user to enter a point with two coodinates
        System.out.print("Enter a point with two coodinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        // Check whether the point is within the circle
        boolean withinCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <=10);
        
        // Display result
        System.out.println("Point (" + x + ", " + y + ") is" + ((withinCircle) ? " in " : " Not in ") + "the Circle");
    }
}
