
// Write a java program that takes two user input integers m and n and prints the multiplication table from 1 to n
// for the number m. The program should use nested for loops to generate the table.

// Sample input:
// 3 5

// Sample Output:
// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15

package TCS_IPA;
import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(m+ " * "+i+ " = "+m*i);
        }
    }
}
