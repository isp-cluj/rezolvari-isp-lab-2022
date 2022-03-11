package isp.lab3.exercise6;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    private int credit;
    private final Product[] products;

    private static final VendingMachine VENDING_MACHINE = new VendingMachine();

    private VendingMachine() {
        products = new Product[5];
        products[0] = new Product("Milka", 1);
        products[1] = new Product("Cola", 2);
        products[2] = new Product("Oreo", 3);
        products[3] = new Product("Biscuits", 4);
        products[4] = new Product("Water", 5);
        this.credit = 0;
    }

    public static VendingMachine getVendingMachine() {
        return VENDING_MACHINE;
    }

    public Product[] displayProducts() {
        return products;
    }

    public void insertCoin(int value) {
        credit += value;
    }

    public String selectProduct(int id) {
        String message = "No product found!";

        for (Product product : products) {
            if (product.getId() == id) {
                message = product.getName();
                break;
            }
        }

        return message;
    }

    public int displayCredit() {
        return credit;
    }

    public void userMenu() {
        insertCoin(100);
        System.out.println("Welcome ! \nOperations available: ");
        System.out.println("1 - Display products 2 - Display credit 3 - Select a product 4 - Exit ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println(Arrays.toString(displayProducts()));
                    break;
                case 2:
                    System.out.println(displayCredit());
                    break;
                case 3:
                    System.out.println("Enter the product id");
                    System.out.println(selectProduct(scanner.nextInt()));
                    break;
                case 4:
                    return;
            }
        }
    }
}
