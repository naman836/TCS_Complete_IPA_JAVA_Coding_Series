// Find distance between 2D Coordinates

//Write a program to find the distance between two points, say, X1,Y1 and X2,Y2.
// Display the answer rounded to three digits after decimal.
// The input will be provided as four numbers separated by space.

// E.g. 4 4 7 8
// Here X1 will be 4, Y1 will be 4, X2 will be 7 and Y2 will be 8.
// Assume that the input numbers will not have any decimal values.
// The output with these values will be 5.000

package TCS_IPA;
import java.util.*;
public class ClassesAndObjectsHandsOn2 {
    public static void main(String[] args) throws Exception {
        int x1,y1,x2,y2;
        Scanner scn=new Scanner(System.in);
        x1=scn.nextInt();
        y1=scn.nextInt();
        x2=scn.nextInt();
        y2=scn.nextInt();
        Point p1=new Point(x1, y1);
        Point p2=new Point(x2, y2);
        double distance=findDistance(p1, p2);
        System.out.format("%.3f",distance);
    }
    public static double findDistance(Point p1, Point p2)
    {
        double distance=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
        return distance;
    }
}
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}