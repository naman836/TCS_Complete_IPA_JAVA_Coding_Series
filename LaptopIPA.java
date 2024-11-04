package TCS_IPA;
import java.util.*;
public class LaptopIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop[] arr = new Laptop[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            int e = sc.nextInt(); sc.nextLine();
            arr[i] = new Laptop (a,b,c,d,e);
        }

        String qbrand = sc.nextLine();
        String qos = sc.nextLine();

        int ans1 = countbybrand(arr, qbrand);
        if(ans1 > 0){
            System.out.println(ans1);
        } else{
            System.out.println("The given os is not available");
        }

        int[] ans2 = countbyos(arr, qos);
            Arrays.sort(ans2);
            if(check(ans2)){
                System.out.println("The given os is not available");
            } else{
                for(int i = ans2.length -1 ; i >= 0; i--){
                    if(ans2[i] != -1){
                        System.out.println(arr[ans2[i]].getid());
                        System.out.println(arr[ans2[i]].getrating());
                    }
                }
            }
        }
        static boolean check(int[] arr){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != -1){
                    return false;
                }
            }
            return true;
        }

        public static int countbybrand(Laptop[] arr, String qbrand){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i].getbrand().equalsIgnoreCase(qbrand) && arr[i].getrating() > 3){
                    count++;
                }
            }
            return count;
        }

        public static int[] countbyos(Laptop[] arr, String qos){
            int[] ans = {-1,-1,-1,-1};
            for(int i = 0; i < arr.length; i++){
                if(arr[i].getos().equalsIgnoreCase(qos)){
                    ans[i] = i;
                }
            }
            return ans;
        }
    }

    class Laptop{
        private int id;
        private String brand;
        private String os;
        private double price;
        private int rating;
        public Laptop(int id, String brand, String os, double price, int rating){
            this.id = id;
            this.brand = brand;
            this.os = os;
            this.price = price;
            this.rating = rating;
        }
        public int getid(){
            return id;
        }
        public int getrating(){
            return rating;
        }
        public String getos(){
            return os;
        }
        public String getbrand(){
            return brand;
        }
    }



