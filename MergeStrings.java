
// Merge two strings using comma

// Input:
// Naman,Pandey
// Pop:Mom

// Output:
// Naman, Pandey, Pop:Mom

package TCS_IPA;
import java.awt.*;
import java.util.*;
public class MergeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.nextLine();
        String[] s1 = p1.split(",");
        String p2 = sc.nextLine();
        String[] s2 = p2.split(",");
        for(int i = 0 ; i < s2.length; i++){
            s1 = Arrays.copyOf(s1,s1.length+1);
            s1[s1.length-1] = s2[i];
        }
        String n = Arrays.toString(s1);
        String k = n.substring(1,n.length()-1);
        System.out.println(k);
    }
}
