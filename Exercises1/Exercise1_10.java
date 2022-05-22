/*
(Average speed in miles) Assume that a runner runs 15 kilometers in 50 minutes
and 30 seconds. Write a program that displays the average speed in miles per hour.
(Note that 1 mile is 1.6 kilometers.)
*/

public class Exercise1_10 {

    public static void main(String[] strings) {
    
        double kilometers = 15.0;
        double miles = kilometers / 1.6;

        double rate = (50.0 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = miles / rate;

        System.out.println(milesPerHour);
    }
}
