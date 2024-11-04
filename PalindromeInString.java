
// Find the palindrome words from the sentence and print them and also count

// Input: My Name is naman and I can speak malayalam

// Output: The palindrome are :
// naman
// I
// malayalam
// The number of palindrome words: 3


package TCS_IPA;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] pal = findPalindrome(s);
        if(pal != null){
            System.out.println("The palindrome are :");
            for(int i = 0; i < pal.length; i++){
                System.out.println(pal[i]);
            }
            System.out.println("The number of palindrome words: "+pal.length);
        }
        else{
            System.out.println("No such palindrome words");
        }
    }
    public static boolean isPalindrome(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static String[] findPalindrome(String s){
        String[] arr = s.split(" ");
        String[] pal = new String[0];
        for(int i = 0; i < arr.length; i++){
            if(isPalindrome(arr[i]))
            {
                pal = Arrays.copyOf(pal,pal.length+1);
                pal[pal.length-1] = arr[i];
            }
        }
        if(pal.length > 0){
            return pal;
        }
        return null;
    }
}
