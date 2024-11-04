
// Find the maximum ascii valued character in a String.

// Input : Arijit ----> Output : t
// Input : Aa     ----> Output : a

package TCS_IPA;
import java.util.Scanner;

public class MaximumASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        for(int i = 0 ; i < str.length(); i++){
            if(ch < str.charAt(i)){
                ch = str.charAt(i);
            }
        }
        System.out.println(ch);

    }
}
