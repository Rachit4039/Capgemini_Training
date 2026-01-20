public class OnlineRetailOrderManagement {
    static class Order{
        int orderId;
        int orderDate;

        void getOrderStatus() {
             System.out.println("Order Placed");
        }
    }
    static class ShippedOrder extends Order{
        int trackingNumber;

        void getOrderStatus() {
            System.out.println("Order Shipped");

        }
    }
    static class DeliveredOrder extends ShippedOrder{
        int deliveryDate;

        void getOrderStatus() {
             System.out.println("Order Delivered");
            
        }
    }

    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new ShippedOrder();
        Order o3 = new DeliveredOrder();
        o1.getOrderStatus();
    }
}
