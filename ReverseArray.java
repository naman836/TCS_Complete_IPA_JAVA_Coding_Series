package TCS_IPA;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
//          int[] result =  reverseArray(arr,0,n-1);
//          for(int i = 0; i < result.length; i++){
//              System.out.print(result[i] + " ");
//          }
//        }
//        public static int[] reverseArray(int[] arr, int start, int end){
//        if(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            reverseArray(arr,start+1,end-1);
//        }
//        return arr;
//        }
       }
    }



