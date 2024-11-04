
// Write a Program to check whether a number is PERFECT or Not

// E.g. 28 ---> PERFECT NUMBER
// Explanation: Factors are 1+2+4+7+14 = 28

// E.g. 29 ---> NOT PERFECT NUMBER

package TCS_IPA;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                ans += i;
            }
        }
        if(num==ans){
            System.out.println("PERFECT NUMBER");
        } else{
            System.out.println("NOT PERFECT NUMBER");
        }

    }
}
