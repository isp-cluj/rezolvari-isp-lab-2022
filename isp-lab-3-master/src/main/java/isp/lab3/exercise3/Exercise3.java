package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Lambo", "Huracan", 160, 'B');
        Vehicle v2 = new Vehicle("Porsche", "Carrera", 140, 'D');

        System.out.println("Printing details for the first car");
        System.out.println(v1.getModel());
        System.out.println(v1.getType());
        System.out.println(v1.getSpeed());
        System.out.println(v1.getType());
        System.out.println(v1);

        System.out.println("---------------");

        System.out.println("Printing details for the second car");
        System.out.println(v2.getModel());
        System.out.println(v2.getType());
        System.out.println(v2.getSpeed());
        System.out.println(v2.getType());
        System.out.println(v2);

        System.out.println("--------");
        System.out.println("Result of testing the equality based on equals() method: " + v1.equals(v2));
        System.out.println("Number of objects created: " + Vehicle.getNumberOfObjectCreated());
    }
}
