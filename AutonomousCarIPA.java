package TCS_IPA;
import java.util.*;

class AutonomousCar{
    int carId;
    String brand;
    int noOfTestsConducted;
    int noOfTestsPassed;
    String environment;
    String grade;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment){
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }
    public int getCarId(){
        return carId;
    }
    public String getBrand(){
        return brand;
    }
    public int getNoOfTestsConducted(){
        return noOfTestsConducted;
    }
    public int getNoOfTestsPassed(){
        return noOfTestsPassed;
    }
    public String getEnvironment(){
        return environment;
    }
    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}


public class AutonomousCarIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] arr = new AutonomousCar[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new AutonomousCar(a,b,c,d,e);
        }
        String environment = sc.nextLine();
        String brand = sc.nextLine();

        int result1 = findTestPassedByEnv(arr,environment);
        if(result1 > 0){
            System.out.println(result1);
        } else{
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar result2 = updateCarGrade(arr,brand);
        if(result2 != null) {
            System.out.println(result2.getBrand() + "::" + result2.getGrade());
        } else{
            System.out.println("No Car is available with the specified brand");
        }
    }
    public static int findTestPassedByEnv(AutonomousCar[] arr, String environment){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getEnvironment().equalsIgnoreCase(environment)){
                sum += arr[i].getNoOfTestsPassed();
            }
        }
        return sum;
    }

    public static AutonomousCar updateCarGrade(AutonomousCar[] arr, String brand){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                int rating = (arr[i].getNoOfTestsPassed() * 100) / (arr[i].getNoOfTestsConducted());
                if(rating >= 80){
                    arr[i].setGrade("A1");
                }
                else{
                    arr[i].setGrade("B2");
                }
                return arr[i];
            }
        }
        return null;
    }
}
