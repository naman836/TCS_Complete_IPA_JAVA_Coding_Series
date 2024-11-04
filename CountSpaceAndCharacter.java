
// Write a Program to compute the number of spaces and characters in a String.
// Input: Hi I am a Student
// Output: 4 13

package TCS_IPA;
import java.util.Scanner;
public class CountSpaceAndCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s_count = 0, c_count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ')
            {
               s_count++;
            } else if (ch >= 'a' || ch <= 'z' || ch >= 'A' || ch <= 'Z')
            {
                c_count++;
            }
        }
        System.out.println(s_count+" "+c_count);
    }
}


// This is the code snippet to count spaces and only letters (Ignore the digits if any)....

// for(int i = 0; i < str.length(); i++){
//    if(Character.isLetter(str.charAt(i))){
//       c_count++;
//      } else if (str.charAt(i) == ' '){
//       s_count++;
//      }