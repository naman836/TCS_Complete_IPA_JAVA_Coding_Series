
// Find the characters at odd position in a string which are consonant

// Input: Arijit Ghosh
// Output: hs

package TCS_IPA;
import java.util.Scanner;

public class ConsonantAtOddPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i+=2){
            char ch = str.charAt(i);
            if(ch == ' ' || ch == 'a'|| ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I'
            || ch == 'o'|| ch == 'O' || ch == 'u' || ch == 'U'){
                continue;
            } else{
                System.out.print(ch);
            }
        }
    }
}
