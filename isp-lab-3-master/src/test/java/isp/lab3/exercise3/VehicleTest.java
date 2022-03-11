package isp.lab3.exercise3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle("Lambo", "Huracan", 160, 'B');
        assertEquals("toString() method should display: Lambo (Huracan) speed 160 fuel type B","Lambo (Huracan) speed 160 fuel type B", vehicle.toString());
    }
}
