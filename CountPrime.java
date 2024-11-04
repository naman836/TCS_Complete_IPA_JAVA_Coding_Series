
// Count the number of prime digits in a Number
// Input: "254786135"
// Output: 5

package TCS_IPA;
import java.util.*;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            int p = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(isPrime(p) == true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int n){
        int c = 0;
        for(int i = 2; i < n; i++){
            if(n%i==0){
                c++;
            }
        }
        if(c == 0 && n > 1){
            return true;
        } else{
            return false;
        }
    }
}
