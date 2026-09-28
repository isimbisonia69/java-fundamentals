
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

      
        customerName = "Alex";
        coffeePrice = 4.50;
        quantity = 2;
        LoyaltyCard = true;

       
        baseTotal = coffeePrice * quantity;

      
        discount = 0.0;

        if (LoyaltyCard) {
            discount = 2.50;
        } else if (baseTotal > 15.00) {
            discount = baseTotal * 0.10;
        }

       
        discountedTotal = baseTotal - discount;

        taxAmount = discountedTotal * 0.08;

        finalTotal = discountedTotal + taxAmount;

        System.out.println("Brewing in:");

        for (int i = 3; i >= 1; i--) {
            System.out.print(i + "... ");
        }

        System.out.println("Coffee is ready!");

        System.out.println("\n--- CafePOS Receipt ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Coffee Price: $" + coffeePrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Base Total: $" + baseTotal);
        System.out.println("Discount: $" + discount);
        System.out.println("Discounted Total: $" + discountedTotal);
        System.out.println("Tax (8%): $" + taxAmount);
        System.out.println("Final Total: $" + finalTotal);
    }
}