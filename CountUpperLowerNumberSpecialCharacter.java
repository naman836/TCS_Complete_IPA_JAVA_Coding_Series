package TCS_IPA;
import java.util.Scanner;

public class CountUpperLowerNumberSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper = 0,lower = 0,number = 0,s_char = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                number++;
            } else{
                s_char++;
            }
        }
        System.out.println("Upper Letter : " +upper);
        System.out.println("Lower Letter : " +lower);
        System.out.println("Number : " +number);
        System.out.println("Special Character : " +s_char);
    }
}
