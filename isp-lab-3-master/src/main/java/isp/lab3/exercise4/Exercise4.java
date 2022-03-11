package isp.lab3.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(2,4,6);
        MyPoint point2 = new MyPoint(10, 7, 1);

        System.out.println(point1);
        System.out.println(point2);

        System.out.println("------------");

        System.out.println(point1.distance(4,6,8));
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
    }
}
