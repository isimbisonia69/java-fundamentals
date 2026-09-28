package java_methods;

public class CafePOS {

    private static String customerName;
    private static double coffeePrice;
    private static int quantity;
    private static boolean LoyaltyCard;

    private static double baseTotal;
    private static double discount;
    private static double discountedTotal;
    private static double taxAmount;
    private static double finalTotal;

    public static void main(String[] args) {
        
        customerName = "Sonia";
        coffeePrice = 4.50;
        quantity = 2;
        LoyaltyCard = true;

        
        baseTotal = coffeePrice + quantity;

        discount = 0.0;

        if (LoyaltyCard) {
            discount = 2.50;
        } else if (baseTotal > 15.00) {
            discount = baseTotal * 0.10;
        }

        discountedTotal = baseTotal - discount;

        taxAmount = discountedTotal * 0.08;

        finalTotal = calculateTax(discountedTotal, 0.08);

        System.out.println("Brewing in:");

        for (int i = 3; i >= 1; i--) {
            System.out.print(i + "... ");
        }

        System.out.println("Coffee is ready!");

        // Task 4: print the receipt using the custom method
        generateReceipt(customerName, finalTotal);
    }

    // Task 4: returns the total price including tax
    public static double calculateTax(double amount, double taxRate) {
        double tax = amount * taxRate;
        return amount + tax;
    }

    // Task 4: prints a formatted receipt
    public static void generateReceipt(String name, double finalAmount) {
        System.out.println("\n--- CafePOS Receipt ---");
        System.out.println("Customer Name: " + name);
        System.out.printf("Final Total: $%.2f%n", finalAmount);
        System.out.println("-----------------------");
        System.out.println("Thank you! Come again please.");
    }
}