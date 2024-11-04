// Write main method in the class. In main method, read five values for an integer array. The main method should print
// the sum of odd numbers from the array of integers only if the sum values is greater than 8 and less than 50. Else it
// should print "NA".

// Input : 1 2 3 5 7
// Output: Sum of odd numbers:16

// Input: 1 2 3 4 8
// Output: NA

package TCS_IPA;
import java.util.*;
public class PrintSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0){
                sum = sum + arr[i];
            }
        }
        if(sum > 8 && sum < 50){
            System.out.println("Sum of odd numbers:"+sum);
        } else{
            System.out.println("NA");
        }
    }
}
