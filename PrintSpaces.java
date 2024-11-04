
// Write a Program to print numbers of spaces in the particular string.

// Input: Hello what is your name
// Output: 4

// Condition: If the count is greater than or equal to 3 then print the count else print NA as it is.

package TCS_IPA;
import java.util.Scanner;
public class PrintSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ')
                count++;
        }

        if(count >= 3)
        {
            System.out.println(count);
        } else{
            System.out.println("NA");
        }
    }
}
