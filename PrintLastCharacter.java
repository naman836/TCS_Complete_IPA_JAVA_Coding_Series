
// Write a Program to print the last character of every word in a String.

// Conditions: Ignore all the digits and whitespaces
// Input: Hey3 Java Learners
// Output: as

package TCS_IPA;
import java.util.Scanner;
public class PrintLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++)
        {
            String word = arr[i];
            char ch = word.charAt(word.length()-1); //Just Change char ch = word.charAt(0) to print first character.
            if(Character.isDigit(ch))
            {
                continue;
            }
            System.out.print(ch);
        }
    }
}
