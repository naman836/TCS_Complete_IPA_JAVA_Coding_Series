
// a2b3c1 = aabbbc

package TCS_IPA;
import java.util.Scanner;

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else if(Character.isDigit(str.charAt(i))){
                int x = Integer.parseInt(String.valueOf(str.charAt(i)));
                for(int j = 1; j < x; j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}
