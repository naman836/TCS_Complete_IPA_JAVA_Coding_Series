// Write main method in the Solution Class.

// In the main method, read a String value and print the count of lower case characters present in the input String
// value. If no lower case characters are present in the String value, then it should print "No lower case characters
// present".

//Sample input: XpLore
// Output: 4

package TCS_IPA;
import java.util.Scanner;
public class Solution1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int lower = 0;
        for(int i =0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }
        if(lower > 0){
            System.out.println(lower);
        }
        else{
            System.out.println("No lower case characters present");
        }
    }
}
