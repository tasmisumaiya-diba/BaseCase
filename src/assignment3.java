import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----order test-----");
        System.out.println("enter product details: name, price,quantity");
        Order o1 = new Order(" ", 0.0, 0);
        Order o2 = new Order(" ", 0.0, 0);
            try {
                String name1 = input.nextLine();
                o1.name = name1;
                double price1 = input.nextDouble();
                    o1.setPrice(price1);
                    input.nextLine();
                int quantity1 = input.nextInt();
                    o1.setQuantity(quantity1);
                input.nextLine();
                String name2 = input.nextLine();
                o2.name = name2;
                double price2 = input.nextDouble();
                    o2.setPrice(price2);
                    input.nextLine();
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
