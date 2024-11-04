// Write a main method in Class, read a String(which may have alphabets along with numeric digits) and print the
// number of vowels and consonants present in the given String.

// Input: Welcome123

// Output:
// Number of Vowels:3
// Number of Consonants:4

package TCS_IPA;
import java.util.*;
public class PrintVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int v = 0, c = 0;
        String n = num.toLowerCase();
        for(int i = 0 ; i < n.length(); i++){
            if(Character.isLetter(n.charAt(i))){
                if(n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o'
                || n.charAt(i) == 'u'){
                    v++;
                } else{
                    c++;
                }
            }
        }
        if(v > 0 || c > 0){
            System.out.println("Number of Vowels:"+v);
            System.out.println("Number of Consonants:"+c);
        } else{
            System.out.println("NA");
        }
    }
}
