import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display() {
        System.out.println("Item Code " + itemCode);
        System.out.println("Item Name " + itemName);
        System.out.println("Price " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Item_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        double price = sc.nextDouble();

        int quantity = sc.nextInt();

        Item item = new Item(code, name, price);

        item.display();

        System.out.println("Total Cost " + item.calculateTotalCost(quantity));

        sc.close();
    }
}
