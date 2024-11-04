
// Write a Java Program that takes a user input integer n and prints the Fibonacci series upto n.
// The first two numbers in fibonacci series are 0 and 1. For example the first 10 numbers in the series are:
// 0 1 1 2 3 5 8 13 21 34.
// The program should use for loop to generate the series.

// Sample input : 20
// Output: 0 1 1 2 3 5 8 13


package TCS_IPA;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" ");
        while (second < n){
            System.out.print(second+" ");
            int temp = second;
            second = second + first;
            first = temp;
        }
    }
}
