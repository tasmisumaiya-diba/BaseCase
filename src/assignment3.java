import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----order test-----");
        System.out.println("enter product details: name, price,quantity");
            try {
                Order o1 = new Order(" ", 1.0, 1);
                Order o2 = new Order(" ", 1.0, 1);
                System.out.print("name1: ");
                String name1 = input.nextLine();
                System.out.print("price1: ");
                double price1 = input.nextDouble();
                    o1.setPrice(price1);
                    input.nextLine();
                System.out.print("quantity1: ");
                int quantity1 = input.nextInt();
                    o1.setQuantity(quantity1);
                input.nextLine();
                System.out.print("name2: ");
                String name2 = input.nextLine();
                o2.name = name2;
                System.out.print("price2: ");
                double price2 = input.nextDouble();
                    o2.setPrice(price2);
                    input.nextLine();
                System.out.print("quantity2: ");
                int quantity2 = input.nextInt();
                    o2.setQuantity(quantity2);
                System.out.println(o1);
                System.out.println(o2);
            }
        catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
        finally
        {
            System.out.println("happy shopping");
        }
        input.close();
    }
}
