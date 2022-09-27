public class Exercise3_19 {
     public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompts user to enter three edges for triangle
        System.out.println("Enter the three edges for triangle: ");
        System.out.print("Edges 1: ");
        double edges1 = input.nextDouble();
        
        System.out.print("Edges 2: ");
        double edges2 = input.nextDouble();
        
        System.out.print("Edges 3: ");
        double edges3 = input.nextDouble();
        
        // Compute the perimeter and dislpay result
        if (edges1 + edges2 > edges3 && edges1 + edges3 > edges2 && edges2 + edges3 > edges1) {
            System.out.println("Perimeter is = " + (edges1 + edges2 + edges3));
        } else 
            System.out.println("the Input is Invalid.");
        /*    
        OR  // Compute the perimeter and dislpay result
        if (edges1 < edges2 + edges3 && edges2 < edges1 + edges3 && edges3 < edges2 + edges1) {
        double perimeter = edges1 + edges2 + edges3;
            System.out.println("Perimeter is = " + perimeter);
        } else 
            System.out.println("the Input is Invalid. ");
       */
    }
}
