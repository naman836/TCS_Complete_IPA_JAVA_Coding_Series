
// noOfRoomsBookedInGivenMonth method:

// This method will take two input parameters - an array of Hotel objects and a String parameter.
// This method will return the total number of rooms booked from the array of hotel objects for given
// month (String parameter passed).
// If no rooms are booked for the given month in the array of Hotel objects then the method should return 0.

// searchHotelByWifiOption method:

// This method will take two input parameters - an array of Hotel objects and a String parameter.
// This method will return Hotel object with second highest totalbill, from the array of Hotel objects where
// wifiFacility attribute matches with the given wi-fi facility (String parameter passed).
// If no Hotel with the given wi-fi option is present in the array of Hotel objects, then the method should
// return null.

// Note:
// No two Hotel object would have the same hotelId.
// No two Hotel object would have the same totalbill.
// The Array either has at least two objects with specified wi-fi option OR no object with specified wi-fi option.
// All the searches should be case in-sensitive.
// dateOfBooking is stored in the format dd-mm-yyyy(e.g. 01-Jan-2022)

// for noOfRoomsBookedInGivenMonth method:
// The main method should print the total number of booked rooms as it is, if the returned value is greater
// than 0. else it should print "No rooms booked in the given month".

// for searchHotelByWifiOption method:
// The main method should print the hotelId from the returned Hotel object is the returned value is not null
// If the returned value is null then it should print "No such option available".
// Input:
//                101
//                Best Stay
//                01-jan-2022
//                10
//                Yes
//                20000
//                102
//                Apple Stay
//                12-Feb-2022
//                3
//                Yes
//                4000
//                103
//                Accord
//                11-May-2022
//                5
//                Yes
//                15000
//                104
//                Royal Park
//                22-Dec-2021
//                7
//                Yes
//                12000
//                May
//                Yes

// Output:        5
//                103


package TCS_IPA;
import java.util.*;

class Hotel{

    private int hId;
    private String hName;
    private String dBook;
    private int noRoom;
    private String wifi;
    private double tBill;
    public Hotel(int hId, String hName, String dBook, int noRoom, String wifi, double tBill){
        this.hId = hId;
        this.hName = hName;
        this.dBook = dBook;
        this.noRoom = noRoom;
        this.wifi = wifi;
        this.tBill = tBill;
    }
    public int gethId(){
        return hId;
    }
    public String gethName(){
        return hName;
    }
    public String getdBook(){
        return dBook;
    }
    public int getnoRoom(){
        return noRoom;
    }
    public String getwifi(){
        return wifi;
    }
    public double gettbill(){
        return tBill;
    }

}

public class HotelIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];
        for(int i = 0; i < hotels.length; i++){
            int hId = sc.nextInt();
            sc.nextLine();
            String hName = sc.nextLine();
            String dBook = sc.nextLine();
            int noRoom = sc.nextInt();
            sc.nextLine();
            String wifi = sc.nextLine();
            double tBill = sc.nextDouble();
            sc.nextLine();
            hotels[i] = new Hotel(hId, hName, dBook, noRoom, wifi, tBill);
        }
        String month = sc.next();
        String wifiOption = sc.next();

        int roomBook = noRoomBook(hotels, month);
        if(roomBook > 0){
            System.out.println(roomBook);
        } else{
            System.out.println("No rooms booked in the given month");
        }

        Hotel hotelSecond = searchWifi(hotels, wifiOption);

        if(hotelSecond != null){
            System.out.println(hotelSecond.gethId());
        } else{
            System.out.println("No such option available");
        }
        sc.close();
    }
    public static int noRoomBook(Hotel[] hotels, String month){
        int tRoomBook = 0;
        for(Hotel hotel: hotels){
            if(hotel.getdBook().toLowerCase().contains(month.toLowerCase())){
                tRoomBook += hotel.getnoRoom();
            }
        }
        return tRoomBook;
    }
    public static Hotel searchWifi(Hotel[] hotels, String wifiOption){
        Hotel hBill = null;
        Hotel secondhbill = null;
        for(int i = 0; i < hotels.length; i++){
            if(hotels[i].getwifi().equalsIgnoreCase(wifiOption)){
                if(hBill == null || hotels[i].gettbill() > hBill.gettbill()){
                    secondhbill = hBill;
                    hBill = hotels[i];
                } else if (secondhbill == null || hotels[i].gettbill() > secondhbill.gettbill()) {
                    secondhbill = hotels[i];
                }
            }
        }

        return secondhbill;
    }
}

//   for(Hotel hotel: hotels){
//           if(hotel.getwifi().equalsIgnoreCase(wifiOption)){
//           if(hBill == null || hotel.gettbill() > hBill.gettbill()){
//           secondhbill = hBill;
//           hBill = hotel;
//           } else if (secondhbill == null || hotel.gettbill() > secondhbill.gettbill()) {
//           secondhbill = hotel;
//           }
//           }
//           }