
// findAvgOfQuizByAdmin method:

// This method will take an array of Course objects and a String value as parameters.
// This method will find out Average(as int) of Quiz questions for given Course Admin(String parameter passed)
// This method will return Average if found it. if there is no course that matches then return null.

// sortCourseByHandsOn method:

// This method will take an Array of Course objects and int value as parameters.
// This method should return an Array of Course objects in an ascending order of their handson which are less
// than the given handson(int parameter passed) value. If there is no such course then the method should
// return null.

// for findAvgOfQuizByAdmin method:
// The main method should print the average if the returned value is not 0. If the returned value is 0 then
// it should print "No Course found."

// for sortCourseByHandsOn method:
// The main method should print the name of the Course from the returned Course object Array if the returned
// value is not null. If null, then it should print "No Course found with mentioned attribute".

// Input:
//        111
//        kubernetes
//        Nisha
//        40
//        10
//        321
//        cassandra
//        Roshini
//        30
//        15
//        457
//        Apache Spark
//        Nisha
//        30
//        12
//        987
//        site core
//        Tirth
//        50
//        20
//        Nisha
//        17

// Output:
//        35
//        kubernetes
//        Apache Spark
//        cassandra

package TCS_IPA;
import java.util.*;

class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}
public class CourseIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] arr = new Course[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Course(a,b,c,d,e);
        }
        String admin = sc.nextLine();
        int handson = sc.nextInt();

        int result1 = findAvgOfQuizByAdmin(arr,admin);
        if(result1 != 0){
            System.out.println(result1);
        }else{
            System.out.println("No course found");
        }

        Course[] result2 = sortCourseByHandsOn(arr,handson);
        if(result2 != null){
            for(int i = 0; i < result2.length; i++){
                System.out.println(result2[i].getCourseName());
            }
        }
        else{
            System.out.println("No Course found with mentioned attribute");
        }
    }

    public static int findAvgOfQuizByAdmin(Course[] arr, String admin){
        int sum = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getCourseAdmin().equalsIgnoreCase(admin)){
                sum += arr[i].getQuiz();
                count++;
            }
        }
        if(count > 0){
            int avg = sum/count;
            return avg;
        }
        else{
            return 0;
        }
    }

    public static Course[] sortCourseByHandsOn(Course[] arr, int handson){
        Course[] arr2 = new Course[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getHandson() < handson){
                arr2 = Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        // sorting in ascending order based on their handson
        Course val;
        for(int i = 0; i < arr2.length; i++){
            for(int j = i + 1; j < arr2.length; j++){
                if(arr2[i].getHandson() > arr2[j].getHandson()){
                    val = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = val;
                }
            }
        }
        if(arr2.length > 0){
            return arr2;
        }
        else{
            return null;
        }
    }
}
