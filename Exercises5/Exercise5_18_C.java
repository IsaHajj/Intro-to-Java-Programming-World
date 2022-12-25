/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
*/
public class Exercise5_18_C {
   public static void main(String[] args) {
      // Display pattern C
      int lines = 6;
      System.out.println("Pattern C");
      for (int rows = 1; rows <= lines; rows++) {
	   for (int s = lines - rows; s >= 1; s--) {
		System.out.print("  ");
	   }
	   for (int col = rows; col >= 1; col--) {
		System.out.print(col + " ");
	   }
		System.out.println();
       }
   }
}
