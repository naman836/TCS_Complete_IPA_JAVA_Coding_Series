
// Write a java program to find the first non-repeated character in a given string.

// Input String : "minimum"
// Output: "n"

package TCS_IPA;
import java.util.*;
public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j))
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
