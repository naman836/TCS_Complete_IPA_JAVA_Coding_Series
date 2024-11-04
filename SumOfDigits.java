
// Take an integer as input and calculate the sum of its digits.
// If the sum is divisible by 3, the print True, else print False.

// Input: 123
// Output: TRUE

// Input: 1234
// Output: FALSE


package TCS_IPA;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, x;
        while(n != 0)
        {
            x = n % 10;
            sum = sum + x;
            n = n / 10;
        }

        if(sum % 3 == 0)
        {
            System.out.println("TRUE");
        } else{
            System.out.println("FALSE");
        }
    }
}
