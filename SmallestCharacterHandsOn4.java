
// Write a java program to print the minimum valued character(as per alphabet and ASCII sequence) in a string.

// Input: HellO
// Output: H

// Important: Answer is not "e". Since "H" has lower ASCII value than "e".

package TCS_IPA;
import java.util.Scanner;

public class SmallestCharacterHandsOn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char min = str.charAt(0);
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(min > ch){
                min = ch;
            }
        }
        System.out.println(min);
    }
}
