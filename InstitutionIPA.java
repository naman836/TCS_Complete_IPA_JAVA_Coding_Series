package TCS_IPA;
import java.util.*;

class Institution{
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class InstitutionIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution[] arr = new Institution[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            arr[i] = new Institution(a,b,c,d,e);
        }
        String location = sc.nextLine();
        String institutionName = sc.nextLine();

        int res1 = findNumClearanceByLoc(arr, location);
        if(res1 > 0){
            System.out.println(res1);
        } else{
            System.out.println("There are no cleared students in this particular location");
        }

        Institution res2 = updateInstitutionGrade(arr, institutionName);
            if(res2 == null){
                System.out.println("No Institute is available with the specified name");
            } else{
                System.out.println(res2.getInstitutionName()+"::"+res2.getGrade());
            }
        }

    public static int findNumClearanceByLoc(Institution[] arr, String location){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getLocation().equals(location)){
                sum = sum + arr[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution updateInstitutionGrade(Institution[] arr, String institutionName){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getInstitutionName().equals(institutionName)){
                int rating = (arr[i].getNoOfStudentsPlaced() * 100)/(arr[i].getNoOfStudentsCleared());
                if(rating >= 80){
                    arr[i].setGrade("A");
                } else{
                    arr[i].setGrade("B");
                }
                return arr[i];
            }
        }
        return null;
    }
}
