// Remove duplicates characters in a string

// Input: Naman Paandey
// Output: Nam Pdey

package TCS_IPA;
import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String ch = "";
        int i,j;
        for(i = 0; i < str.length(); i++){
            for(j = 0; j < i; j++){
                if(str.charAt(i) == str.charAt(j)){
                    break;
                }
            }
            if(i == j)
            {
                ch = ch + str.charAt(i);
            }
        }
        System.out.println("New string removing Duplicates: " + ch);
    }
}
