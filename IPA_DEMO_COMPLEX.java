
// Create a Class Projector with below attributes:
// projectorId - int
// projectorName - String
// price - int (per unit)
// rating - int
// availableIn - String (Amazon,Flipkart,TataCliq)
// The above attributes should be private, write getter, setters and parameterized constructor.

// findMaximumPriceByRating method:
// This method will return the maximum priced Projector object from array of Projector objects whichever has
// rating greater than the given rating and which is available in TataCliq.
// If no Projector with the above conditions is present in the array of Projector objects, then return null.

// Note: No two projector will have the same price || All the searches should be case in-sensitive.

// The main method should print the projectorId from returned object if the returned value is not null else it
// should print "No such Projector".

// Input:
//        1001
//        Epson
//        30000
//        5
//        TataCliq
//        1002
//        BenQ
//        40000
//        4
//        Amazon
//        1003
//        Sony
//        80000
//        5
//        TataCliq
//        1004
//        Optomo
//        7000
//        3
//        Flipkart
//        3
// Output:
//        1003

package TCS_IPA;
import java.util.*;

class Projector{
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    public Projector(int projectorId, String projectorName, int price, int rating, String availableIn) {
        this.projectorId = projectorId;
        this.projectorName = projectorName;
        this.price = price;
        this.rating = rating;
        this.availableIn = availableIn;
    }

    public int getProjectorId() {
        return projectorId;
    }

    public String getProjectorName() {
        return projectorName;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getAvailableIn() {
        return availableIn;
    }
}

public class IPA_DEMO_COMPLEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Projector[] arr = new Projector[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Projector(a,b,c,d,e);
        }

        int rating = sc.nextInt();

        Projector result = findMaximumPriceByRating(arr,rating);
        if(result != null){
            System.out.println(result.getProjectorId());
        }else{
            System.out.println("No such Projector");
        }
    }

    public static Projector findMaximumPriceByRating(Projector[] arr, int rating){
        Projector temp = null;
        int maxPrice = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getRating() > rating && arr[i].getAvailableIn().equalsIgnoreCase("TataCliq")){
                if(arr[i].getPrice() > maxPrice){
                    maxPrice = arr[i].getPrice();
                    temp = arr[i];
                }
            }
        }
        return temp;
    }
}
