
// Count the sum of prime digits in a given number

// Input: 2345678910
// Output: 17
// Explanation: 2+3+5+7 = 17

package TCS_IPA;
import java.util.Scanner;

public class SumOfPrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            if(isPrime(num.charAt(i))){
                sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
        }
        if(sum > 0){
            System.out.println(sum);
        } else{
            System.out.println("No prime digits found");
        }
    }
    public static boolean isPrime(char c){
        int n = Integer.parseInt(String.valueOf(c));
        if(n < 2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
