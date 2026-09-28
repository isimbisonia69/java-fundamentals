package java_objects;

import java.util.Scanner;

public class ShoppingCart {


    private int totalItems;
    private double totalPrice;

   
    public void addItem(double price) {
        totalItems++;
        totalPrice += price;
        System.out.println(getCartSummary("added"));
    }

    public void removeItem(double price) {
        if (totalItems > 0) {
            totalItems--;
            totalPrice -= price;
        }
        System.out.println(getCartSummary("removed"));
    }

    public void emptyCart() {
        totalItems = 0;
        totalPrice = 0;
        System.out.println("Cart emptied.");
    }

    private String getCartSummary(String action) {
        return String.format("Cart has %d items %s. Total: $%.2f", totalItems, action, totalPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("How many items do you want to add? ");
        int numItems = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numItems; i++) {
            System.out.print("Item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            System.out.print("Price per item: ");
            double price = Double.parseDouble(scanner.nextLine());

            for (int q = 0; q < quantity; q++) {
                cart.addItem(price);
            }
            System.out.println("Added " + quantity + " x " + itemName);
        }

        System.out.print("\nDo you want to remove an item? Enter price to remove, or 0 to skip: ");
        double removePrice = Double.parseDouble(scanner.nextLine());
        if (removePrice > 0) {
            cart.removeItem(removePrice);
        }

        System.out.println("\nFinal total items in cart: " + cart.totalItems);

        scanner.close();
    }
}
    
}
