
// In the main method, read a String and print all consonant characters(in lower case) in the sequence as they appear
// in the input String value.

// Sample Input: DATABase
// Output: dtbs

package TCS_IPA;
import java.util.*;
public class PrintConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = str.toLowerCase();
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == 'a' || ans.charAt(i) == 'e' || ans.charAt(i) == 'o' || ans.charAt(i) == 'i'
            || ans.charAt(i) == 'u'){
                continue;
            } else{
                System.out.print(ans.charAt(i));
            }
        }
    }
}
