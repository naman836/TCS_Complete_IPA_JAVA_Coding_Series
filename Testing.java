package TCS_IPA;


import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int space = 0, character = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                character++;
            } else if (str.charAt(i) == ' '){
                space++;
            }
        }
        System.out.println(space+" "+character);
    }
}
