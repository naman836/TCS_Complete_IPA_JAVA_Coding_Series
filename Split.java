
// Sample input:

// Enter ISBN: 978-0-13-110362-8

// Sample output:

// GSI Prefix: 978
// Group Identifier: 0
// Publisher Code: 13
// Item Number: 110362
// Check Digit: 8

package TCS_IPA;
import java.util.*;
public class Split {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ISBN: ");
        String n = sc.nextLine();
        String[] data = ExtractElement(n);
        if(data != null){
            int i = 0;
            System.out.println("GSI Prefix: "+data[i++]);
            System.out.println("Group Identifier: "+data[i++]);
            System.out.println("Publisher Code: "+data[i++]);
            System.out.println("Item Number: "+data[i++]);
            System.out.println("Check Digit: "+data[i++]);
        }
    }

    public static String[] ExtractElement(String data){
        String[] num = data.split("-");
        if(num.length==5){
            return num;
        }
        return null;
    }
}
