import java.util.*;

public class ECommerce {

    interface Taxable {
        double calculateTax();
    }

    static abstract class Product {
        protected int productId;
        protected String name;
        protected double price;

        Product(int productId, String name, double price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }

        abstract double calculateDiscount();

        double finalPrice() {
            return price - calculateDiscount();
        }
    }

    static class Electronics extends Product implements Taxable {

        Electronics(int productId, String name, double price) {
            super(productId, name, price);
        }

        double calculateDiscount() {
            return price * 0.10;
        }

        public double calculateTax() {
            return price * 0.18;
        }

        @Override
        double finalPrice() {
            return price + calculateTax() - calculateDiscount();
        }
    }

    static class Clothing extends Product {

        Clothing(int productId, String name, double price) {
            super(productId, name, price);
        }

        double calculateDiscount() {
            return price * 0.20;
        }
    }

    static class Groceries extends Product {

        Groceries(int productId, String name, double price) {
            super(productId, name, price);
        }

        double calculateDiscount() {
            return price * 0.05;
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "Shirt", 2000));
        products.add(new Groceries(3, "Rice", 1000));

        for (Product p : products) {
            System.out.println(p.finalPrice());
        }
    }
}
