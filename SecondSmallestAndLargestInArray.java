package TCS_IPA;
import java.util.Scanner;

public class SecondSmallestAndLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sS = secondSmallest(arr,n);
        System.out.println(sS);
        int sL = secondLargest(arr,n);
        System.out.println(sL);
    }
    public static int secondSmallest(int[] arr,int n){
        if(n < 2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < small){
                ss = small;
                small = arr[i];
            } else if (arr[i] < ss && arr[i] != small) {
                ss = arr[i];
            }
        }
        return ss;
    }

    public static int secondLargest(int[] arr, int n){
        if(n < 2){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > large){
                sl = large;
                large = arr[i];
            } else if (arr[i] > sl && arr[i] != large) {
                sl = arr[i];
            }
        }
        return sl;
    }
}
