
// Count the number of UPPER-of-UPPER Case in a String It is greater than 5 Print VALID STRING Other than Print
// NOT A VALID STRING

// Input: hFJKAfSRjSDI
// Output: VALID STRING

// Input: jhffeFurdfhk
// Output: NOT A VALID STRING


package TCS_IPA;
import java.util.Scanner;

public class CountUpperCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if (count > 5) {
            System.out.println("VALID STRING");
        } else{
            System.out.println("NOT A VALID STRING");
        }
    }
}
