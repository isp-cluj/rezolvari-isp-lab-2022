package isp.lab3.exercise1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {

    @Test
    public void testGrow() {
        Tree tree = new Tree();
        tree.grow(10);
        assertEquals("Should set height to 25", 25, tree.getHeight());
    }

    @Test
    public void testToString() {
        Tree tree = new Tree();
        assertEquals("toString() method should display: Tree{height=15}","Tree{height=15}", tree.toString());
    }
}
