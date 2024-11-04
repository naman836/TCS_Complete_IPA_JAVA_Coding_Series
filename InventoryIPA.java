package TCS_IPA;
import java.util.Arrays;
import java.util.Scanner;

class Inventory{
    int inventoryID;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(int inventoryID, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryID = inventoryID;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}

public class InventoryIPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Inventory[] arr = new Inventory[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Inventory(a,b,c,d);
        }
        int limit = sc.nextInt();

        Inventory[] result = replenish(arr,limit);
        for(int i = 0; i < result.length; i++){
            if(result[i].getThreshold() > 75)
            {
                System.out.println(result[i].getInventoryID()+ " Critical Filling");
            } else if (result[i].getThreshold() >= 50 && result[i].getThreshold() <= 75) {
                System.out.println(result[i].getInventoryID()+ " Moderate Filling");
            }
            else {
                System.out.println(result[i].getInventoryID()+ " Non-Critical Filling");
            }
        }
    }
    public static Inventory[] replenish(Inventory[] arr, int limit){
        Inventory[] arr2 = new Inventory[0];
        for(int i = 0; i < arr.length; i++){
            if(limit >= arr[i].getThreshold()){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;
    }
}
