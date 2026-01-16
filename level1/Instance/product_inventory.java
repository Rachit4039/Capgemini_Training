package level1.Instance;
public class product_inventory {
    static class Product{
        private String productName;
        private int price;

        static int totalProducts=0;

        Product(String productName,int price){
            this.productName=productName;
            this.price=price;
            totalProducts++;
        }
        void displayProductDetails(){
            System.out.println(productName);
            System.out.println(price);
        }

        static void displayTotalProducts(){
            System.out.println(totalProducts);
            
        }
    }

    public static void main(String[] args) {
        Product p = new Product("bottle",3);
        p.displayProductDetails();
        Product.displayTotalProducts();
    }
}
