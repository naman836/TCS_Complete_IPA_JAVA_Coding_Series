
// Write a java program to check whether a number is perfect square or not

// Condition : Input will only be a positive integer and will not have any decimal or special characters.

// Input: 9
// Output: TRUE

package TCS_IPA;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double result = Math.sqrt(num);
        if((int) result == result){
            System.out.println("TRUE");
        } else{
            System.out.println("FALSE");
        }
    }
}
