
// Input: 5
//        2,5,1,3,0
// Output: 0

package TCS_IPA;
import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
