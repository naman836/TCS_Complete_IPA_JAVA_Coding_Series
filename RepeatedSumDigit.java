
// Calculate the sum of digits of a number. If the sum is greater than 9 then again sum the digits. The sum is
// continuing until the sum becomes one digit.

// Input: 195
// Output: 6

// Explanation : 1+9+5 = 15>9, so 1+5=6

package TCS_IPA;
import java.util.Scanner;

public class RepeatedSumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 9){
            System.out.println(num);
        }
        else{
            int sum = Sum(num);
            System.out.println(sum);
        }
    }
    public static int Sum(int num){
        int div = num;
        int sum = 0;
        while(div > 0){
            int rem = div % 10;
            sum += rem;
            div /= 10;
        }
        if(sum > 9){
            return Sum(sum);
        }
        return sum;
    }
}
