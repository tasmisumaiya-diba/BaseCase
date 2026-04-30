import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Diba's Shop---");
        System.out.print("Enter product name: ");
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();
        System.out.print("Enter unit price: ");
        Double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double subtotal = 0;
        final double discountRate = .15;
        double discount = 0;
        double total = 0;
        subtotal = unitPrice * quantity;
        discount = subtotal*discountRate;
        total = Math.floor(subtotal - discount);
        System.out.println("---Final Receipt ---");
        System.out.println("Item: " + product);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Total (Rounded Down): $" + (int)total);
    }
}
