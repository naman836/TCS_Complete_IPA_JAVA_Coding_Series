
// In the main method, write code to read a String value using Scanner and print Characters at Odd positions as single
// String(Not index but position).

// E.g. if the input value is "Matrix", then we have total 6 characters with "M" at 1st position and "x" at 6th position.
// Hence,the characters at odd positions will be 1st,3rd and 5th character which is "Mti".

// If the input value has space or any special characters then the same should be counted as usual.
// E.g. if the input value is "Hi There" then the output will be "H hr"
// Note: Output is printed in same line with all characters together.["Mti" and "H hr"]


package TCS_IPA;
import java.util.*;
public class FindCharacterAtOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i += 2){
            System.out.print(str.charAt(i));
        }
    }
}
