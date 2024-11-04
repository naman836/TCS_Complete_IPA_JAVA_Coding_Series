
// Given an INT number Print the number of even digits if it is greater than 3 other than print " IT IS NOT A VALID
// NUMBER"

//Input: 4536782
//Output: 4

//Input: 1365279
//Output: IT IS NOT A VALID NUMBER

package TCS_IPA;
import java.util.*;
public class CountEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem % 2 == 0){
                count++;
            }
            n = n / 10;
        }
        if(count > 3){
            System.out.println(count);
        } else{
            System.out.println("IT IS NOT A VALID NUMBER");
        }
    }
}
