
// count the number of words in a sentence that start and end with the same letter.

// Input: Naman asked about the Ginseng recipe
// Output: 2
// Explanation : There are two words found : "Naman" & "Ginseng"

package TCS_IPA;
import java.util.Arrays;
import java.util.Scanner;

public class SameFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr)); // ---> [naman, asked, about, the, ginseng, recipe]
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].charAt(0) == arr[i].charAt(arr[i].length()-1)){
                count++;
            }
        }
        if(count > 0){
            System.out.println(count);
        } else{
            System.out.println("No word found");
        }
    }
}
