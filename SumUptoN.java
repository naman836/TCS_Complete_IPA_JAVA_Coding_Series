
// find the sum up-to given integer number n

// Input: 5
// Output: The sum up-to 5th numbers are: 15

package TCS_IPA;
import java.util.Scanner;

public class SumUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n*(n+1)/2;
        System.out.println("The sum up-to "+n+"th numbers are: "+result);
    }
}
