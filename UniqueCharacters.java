
// Write a java program to print the unique characters present in the given string in the same sequence as they
// appear (the first occurrence) in the input.

// Note: All the characters should be in lowercase only.
// Input: xperience
// Output: xperinc

package TCS_IPA;
import java.util.*;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String unique = "";
        for(int i = 0; i < str.length(); i++){
            if(!unique.contains(Character.toString(str.charAt(i)))){
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
