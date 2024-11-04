
// Enter a String and print all the Vowels as it is which is available in the string at 0th index.

// Input: Hello I am a Student
// Output: Iaa

package TCS_IPA;
import java.util.Scanner;
public class PrintVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split(" ");
        for(int i = 0; i < temp.length; i++)
        {
            String word = temp[i];
            char ch = word.charAt(0);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch =='E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
            || ch == 'u' || ch == 'U')
            {
                System.out.print(ch);
            }
        }
    }
}
