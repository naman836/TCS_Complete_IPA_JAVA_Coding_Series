
// Write a Program to read the n numbers and print the second-largest prime number.
// The first number entered will be considered as n. Next, the program should read n numbers(no decimal values).
//Input: 6
//       1 3 17 33 44 43
// Output: 17

package TCS_IPA;
import java.util.*;

public class FindSecondLargestPrimeNumberHandsOn8 {
    public static void main(String[] args) {
        // Reading input from STDIN
        Scanner sc = new Scanner(System.in);

        // Read the first number as the 'n'(the count of numbers to be read)
        int n = sc.nextInt();
        int[] values = new int[n];

        // Reading the next n numbers
        for(int i = 0 ;i < n; i++){
            values[i] = sc.nextInt();
        }

        // Find and print the second-largest prime number
        int result = findSecondLargestPrime(values);

        // If no second-largest prime number is found, print -1
        if(result == -1){
            System.out.println("-1");
        } else{
            System.out.println(result);
        }
    }
    public static int findSecondLargestPrime(int[] values){
        // List to store prime numbers
        List<Integer> primes = new ArrayList<>();

        // Check each number in the array and add it to the list if it's prime
        for(int value: values){
            if(isPrime(value)){
                primes.add(value);
            }
        }

        // If less than 2 primes are found , return -1
        if(primes.size() < 2){
            return -1;
        }

        // sort primes in descending order
        Collections.sort(primes, Collections.reverseOrder());

        // return the second-largest prime
        return primes.get(1);
    }
    // Helper method to check if a number is prime
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;  // 0 and 1 are not prime numbers
        }
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
