
// Input: "1234567890"
// Output: Sum of even digits: 20

package TCS_IPA;
import java.util.Scanner;

public class SumOfEvenDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        for(int i = 0 ; i < num.length(); i++){
            int k = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(k % 2 == 0){
                sum += k;
            }
        }
        System.out.println("Sum of even digits: "+sum);
    }
}
