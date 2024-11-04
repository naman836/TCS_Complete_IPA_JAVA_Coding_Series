
// String input: XpLore
// Character input: r
// Output: 4

// String input : Xplore
// Character input : z
// Output : NA

package TCS_IPA;
import java.util.Scanner;
public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int c = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(i);
                c++;
                break;
            }
        }
            if(c == 0){
                System.out.println("NA");
            }
    }
}
