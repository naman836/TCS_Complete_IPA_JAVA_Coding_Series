
// write a java program to reverse the last three digits of a string if it contains the first three digits and
// print it, else print "Nothing".

// Input: CHNKSC

// Output: CSK


package TCS_IPA;
import java.util.*;
public class ReverseLastThreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "CHN";
        if (str.contains(s)) {
            for (int i = str.length() - 1; i >= 3; i--) {
                System.out.print(str.charAt(i));
            }
        }
        else{
            System.out.println("Nothing");
        }
    }
}
