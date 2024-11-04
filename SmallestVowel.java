
// In the main method, write code to read a String value using Scanner and print the smallest vowel. Assume all the
// input values are in lower case.

//E.g. If the input value is "matrix" then output will be a(since there are two vowels "a" and "i" where "a" is smaller than
// "i" as per ASCII Sequence).

package TCS_IPA;
import java.util.*;

public class SmallestVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u'){
                result = result + str.charAt(i);
            }
        }
        char [] arr = result.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}

// 2nd Method:
// Scanner sc = new Scanner(System.in);
// String ans = sc.nextLine();
// String[] arr = {"a","e","i","o","u"};
// for(int i = 0; i < arr.length; i++){
//    if(ans.contains(arr[i])){
//        System.out.println(arr[i]);
//        break;
//     }
//  }