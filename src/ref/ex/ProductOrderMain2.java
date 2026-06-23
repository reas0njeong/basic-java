package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder milk = createOrder("milk", 1000, 2);
        ProductOrder apple = createOrder("apple", 500, 3);
        ProductOrder banana = createOrder("Banana", 700, 5);

        ProductOrder[] orders = {milk, apple, banana};

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 합계: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder createOrder = new ProductOrder();
        createOrder.productName = productName;
        createOrder.price = price;
        createOrder.quantity = quantity;
        return createOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("제품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
