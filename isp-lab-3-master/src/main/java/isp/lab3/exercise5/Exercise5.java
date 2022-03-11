package isp.lab3.exercise5;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milka", 1);
        products[1] = new Product("Cola", 2);
        products[2] = new Product("Oreo", 3);
        products[3] = new Product("Biscuits", 4);
        products[4] = new Product("Water", 5);

        VendingMachine vendingMachine = new VendingMachine(products);

        System.out.println(Arrays.toString(vendingMachine.displayProducts()));
        System.out.println(vendingMachine.displayCredit());
        vendingMachine.insertCoin(100);
        System.out.println(vendingMachine.displayCredit());
        System.out.println(vendingMachine.selectProduct(1));
        System.out.println(vendingMachine.selectProduct(6));

        vendingMachine.userMenu();
    }
}
