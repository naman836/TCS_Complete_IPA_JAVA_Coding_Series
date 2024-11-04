
// Take a number. If it odd then reverse it, otherwise print "Can not reverse"

// Input: 123
// Output: 321

// Input: 234
// Output: Can not reverse

package TCS_IPA;
import java.util.Scanner;

public class OddReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Can not reverse");
        }
        else{
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum = sum*10 + rem;
                num /= 10;
            }
            System.out.println(sum);
        }
    }
}
