/*
(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week.
*/

public class Exercise3_21 {
    public static void main(String[] args) {
        //import and Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt user to enter year, month, day of the month
        System.out.print("Enter Year: e.g. 2012: ");
        int year = input.nextInt();
        System.out.print("Enter Month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the Day of the Month: 1-31: ");
        int dayOfMonth = input.nextInt(); 
        
        // Convert january and february to month 13 and 14 of the previours year
        if (month == 1 || month == 2) {
            month = (month == 1) ? 13 : 14;
            year--;
        }
            
         // Calculate the day of the week
         int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
         
        // Display result
        System.out.print("Day of the Week is ");
        switch (dayOfWeek) {
                case 0: System.out.println("Saturday"); break;
                case 1: System.out.println("Sunday"); break;
                case 2: System.out.println("Monday"); break;
                case 3: System.out.println("Tuesday"); break;
                case 4: System.out.println("Wednesday"); break;
                case 5: System.out.println("Thursday"); break;
                case 6: System.out.println("Friday");
        }    
    }
}
