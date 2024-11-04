
// Given an array of strings words, return the first palindromic string in the array. If there is no such string
// then return an empty string "".
// A String is palindromic if it reads same forward and backward.

// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"

package TCS_IPA;
import java.util.Scanner;

class FirstPalindromicString {
    public String firstPalindrome(String[] words) {
        for(String str: words){
            if(isPalindrome(str)){
                return str;
            }
        }
        return "";
    }

    boolean isPalindrome(String str){
        int left =0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < words.length;i++){
            words[i] = sc.nextLine();
        }
        FirstPalindromicString fps = new FirstPalindromicString();
        String result = fps.firstPalindrome(words);
        if (!result.isEmpty()) {
            System.out.println("First palindrome: " + result);
        } else {
            System.out.println("No palindrome found.");
        }

    }
}
