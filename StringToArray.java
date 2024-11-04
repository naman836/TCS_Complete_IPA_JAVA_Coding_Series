
// Input: My name is Naman kumar pandey
// Output: [M, y,  , n, a, m, e,  , i, s,  , N, a, m, a, n,  , k, u, m, a, r,  , p, a, n, d, e, y]

package TCS_IPA;
import java.util.Arrays;
import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for(int i = 0 ; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
