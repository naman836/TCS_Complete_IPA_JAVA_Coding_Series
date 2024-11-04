
// Check a String is Palindrome or not

// Input: naman
// Output: Palindrome

// Input: Papa
// Output: None

package TCS_IPA;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String str = s;
        String reverse = "";
        for(int i = str.length()-1 ; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        } else{
            System.out.println("None");
        }
    }
}
