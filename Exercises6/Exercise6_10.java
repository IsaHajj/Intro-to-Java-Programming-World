/*
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.
*/
public class Exercise6_10 {
    public static void main(String[] args) {
       // Counts the number of prime numbers
       int numberOfPrimes = 0;	
       
       // Find the number of prime numbers less than 10000
       for (int i = 1; i < 1000; i++) {
	    if (PrimeNumber.isPrime(i))
		numberOfPrimes++;        // Increament 
       }

       // Display result
       System.out.println("The number of prime numbers less than 10000: " + numberOfPrimes);
    }
}
