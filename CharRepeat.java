
// aabbbcc = a2b3c2
// abbccc = a1b2c3

package TCS_IPA;
import java.util.Scanner;

public class CharRepeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        char ch = s.charAt(0);
        for(int k = 0; k < s.length(); k++)
        {
            if(ch==s.charAt(k)){
                count++;
            } else{
                System.out.print(ch+""+count);
                ch = s.charAt(k);
                count=0;
                k--;
            }
            if(ch == s.charAt(s.length()-1) && k == s.length()-1){
                System.out.println(ch+""+count);
            }
        }
    }
}
