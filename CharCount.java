
// Find the occurrence of a character in a string

// Input: Naman
//      : a

// Output: 2

package TCS_IPA;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.nextLine();
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == ch.charAt(0)){
                count++;
            }
        }
        if(count > 0){
            System.out.println(count);
        } else{
            System.out.println("NA");
        }
    }
}
