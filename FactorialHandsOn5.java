
// Write a program to read 5 numbers and print the factorial of each.
// (Final answer should be non-decimal numbers)

// Input : 2 3 4 6 5
// Output: 2 6 24 720 120

package TCS_IPA;
import java.util.*;
import java.math.*;

public class FactorialHandsOn5 {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i = 0; i < 5; i++){
            num[i] = sc.nextInt();
            String res = factorial(num[i]);
            System.out.println(res);
        }
    }
    public static String factorial(int n){
        BigInteger fact = new BigInteger("1");
        for(int i=1;i<=n;i++){
            fact = fact.multiply(new BigInteger(i+""));

        }
        return fact.toString();
    }
}
