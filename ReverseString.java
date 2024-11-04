
// Write a Java Program to reverse a given String.
// Condition: The reverse string should be printed in lower case only.

// Input: Welcome
// Output: emoclew

package TCS_IPA;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
