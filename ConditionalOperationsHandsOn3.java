//Write a Program to check the distance of 2D points from the origin and the print the point with highest-distance.

//Create class Point with attributes as below
// double x
// double y

//In Solution class, define the main method to read the values for three points objects.
//Next,Create below method in Solution class which will take three point objects as input parameters and return the point
//with highest-distance from origin.
//public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3)

//Consider sample input as below to read values for six point objects.

//Input: 2 2 3 3 -4 -4
//Output: -4.0
//        -4.0

package TCS_IPA;
import java.util.*;

public class ConditionalOperationsHandsOn3 {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        double x1,y1,x2,y2,x3,y3;
        Scanner scn=new Scanner(System.in);
        x1=scn.nextDouble();
        y1=scn.nextDouble();
        x2=scn.nextDouble();
        y2=scn.nextDouble();
        x3=scn.nextDouble();
        y3=scn.nextDouble();
        Point1 p1=new Point1(x1, y1);
        Point1 p2=new Point1(x2, y2);
        Point1 p3=new Point1(x3, y3);
        Point1 highest=pointWithHighestOriginDistance(p1, p2, p3);
        System.out.format("%.1f \n",highest.x);
        System.out.format("%.1f",highest.y);
    }
    public static Point1 pointWithHighestOriginDistance(Point1 p1, Point1 p2, Point1 p3)
    {
        double d1=Math.sqrt(p1.x*p1.x+p1.y*p1.y);
        double d2=Math.sqrt(p2.x*p2.x+p2.y*p2.y);
        double d3=Math.sqrt(p3.x*p3.x+p3.y*p3.y);
        return d1>d2?(d1>d3?p1:p3):(d2>d3?p2:p3);
    }
}

class Point1
{
    double x,y;
    Point1(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
}