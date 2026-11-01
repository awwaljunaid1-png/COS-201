
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        double totalCost = quantity * price;

        System.out.println("\nItem Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + price);
        System.out.println("Total Cost: " + totalCost);

        input.close();
    }
}
