package isp.lab3.exercise4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPointTest {

    @Test
    public void testDistance() {
        MyPoint point1 = new MyPoint(2,4,6);
        MyPoint point2 = new MyPoint(4, 2, 6);
        assertEquals("The distance between point1 and point2 should be 2.8284271247461903", 2.8284271247461903, point1.distance(point2), 0);
    }
}
