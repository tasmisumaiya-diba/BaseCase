import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        System.out.println("--- Welcome to BaseCase Shop---");
        System.out.println("how many item do you want to purchase?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        double subTotal = 0.0;
        int deliveryFee =0;
        int i = 0;
        double discount = 0.0;
        if (n > 0 && n <= 5) {
            String[] product = new String[n];
            double[] price = new double[n];
            int[] quantity = new int[n];
            double[] itemTotal = new double[n];
            for ( i = 0; i < n; i++) {
                System.out.print("Enter product name: ");
                product[i] = input.nextLine();
                System.out.print("Enter product price: ");
                price[i] = input.nextDouble();
                if (price[i] <= 0) {
                    System.out.println("Invalid price");
                }
                System.out.print("Enter quantity: ");
                quantity[i] = input.nextInt();
                input.nextLine();
                if (quantity[i] <= 0) {
                    System.out.println("Invalid quantity");
                }
                itemTotal[i] = price[i] * quantity[i];
                subTotal = itemTotal[i] + subTotal;
            }
            if (subTotal > 100) {
                discount = subTotal * .20;
            } else if (subTotal > 50) {
                discount = subTotal * .10;
            } else {
                discount = subTotal * .05;
                deliveryFee = 10;
            }
            double total = subTotal - discount + deliveryFee;
            System.out.println("-----final receipt-----");
            for( i = 0; i < n; i++)
                System.out.println("item " + (i+1) + ": " + product[i] + " - " + price[i] + " x " + quantity[i] + " = " + itemTotal[i] );
            System.out.println("\nsubtotal : " + subTotal);
            System.out.println("discount : " + discount);
            System.out.println("delivery fee : " + deliveryFee);
            System.out.println("\nfinal total : " + total);
            System.out.println("\n---------------");
        } else {
            System.out.println("5 items max");
        }
    }
}
