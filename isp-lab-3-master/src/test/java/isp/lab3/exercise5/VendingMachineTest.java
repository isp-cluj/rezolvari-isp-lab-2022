package isp.lab3.exercise5;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private VendingMachine vendingMachine;

    @Before
    public void prepareTests() {
        Product[] products = new Product[5];
        products[0] = new Product("Milka", 1);
        products[1] = new Product("Cola", 2);
        products[2] = new Product("Oreo", 3);
        products[3] = new Product("Biscuits", 4);
        products[4] = new Product("Water", 5);

        vendingMachine = new VendingMachine(products);
    }

    @Test
    public void testDisplayProducts() {
        String products = "[Product{name='Milka', id=1}, Product{name='Cola', id=2}, Product{name='Oreo', id=3}, Product{name='Biscuits', id=4}, Product{name='Water', id=5}]";
        assertEquals("The products should be " + products, products, Arrays.toString(vendingMachine.displayProducts()));
    }

    @Test
    public void testInsertCoin() {
        vendingMachine.insertCoin(150);
        assertEquals("The new credit should be 150", 150, vendingMachine.displayCredit());
    }

    @Test
    public void testSelectProduct() {
        assertEquals("The product with id=2 should be Cola", "Cola", vendingMachine.selectProduct(2));
        assertEquals("The should be no product for id=6", "No product found!", vendingMachine.selectProduct(6));
    }
}
