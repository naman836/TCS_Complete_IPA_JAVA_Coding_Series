
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Input: s = "anagram" t = "nagaram"
// Output: true

// Input: s = "rat" t = "cat"
// Output: false

package TCS_IPA;
import java.util.*;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean result = isAnagram(s,t);
        if(result){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}
