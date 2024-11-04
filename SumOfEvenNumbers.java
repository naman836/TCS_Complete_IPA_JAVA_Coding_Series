
// Input array: {10, 5, 20, 8, 13}

// Output :
// Sum of even numbers: 38
package TCS_IPA;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            if(num[i] % 2 == 0)
            {
                sum = sum + num[i];
            }
        }
        System.out.println("Sum of even numbers: "+sum);
    }
}
