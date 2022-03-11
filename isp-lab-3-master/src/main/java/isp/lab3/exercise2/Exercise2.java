package isp.lab3.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,4);
        System.out.println("Length " + r1.getLength() + " and width " + r1.getWidth());
        System.out.println("Color: " + r1.getColor());
        System.out.println("Area: " + r1.getArea() + ", perimeter: " + r1.getPerimeter());

        System.out.println("--------");

        Rectangle rectangle = new Rectangle(10, 20 , "blue");
        System.out.println("The new rectangle has the properties:");
        System.out.println("Length " + rectangle.getLength() + " and width " + rectangle.getWidth());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.getArea() + ", perimeter: " + rectangle.getPerimeter());
    }
}
