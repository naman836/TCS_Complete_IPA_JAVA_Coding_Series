
// Remove vowel from a string

// Input: Arijit Ghosh
// Output: rjt Ghsh

package TCS_IPA;
import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I'
                    || ch == 'o'|| ch == 'O' || ch == 'u' || ch == 'U'){
                continue;
            } else{
                result += ch;
            }
        }
        System.out.println(result);
    }
}
