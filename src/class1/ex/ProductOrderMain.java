package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder milk = new ProductOrder();
        milk.productName = "우유";
        milk.price = 1000;
        milk.quantity = 1;

        ProductOrder apple = new ProductOrder();
        apple.productName = "사과";
        apple.price = 5000;
        apple.quantity = 5;

        ProductOrder banana = new ProductOrder();
        banana.productName = "바나나";
        banana.price = 7000;
        banana.quantity = 10;

        ProductOrder[] orders = {milk, apple, banana};
        int totalPrice = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
            totalPrice += order.price * order.quantity;
        }

        System.out.println("총 금액: " + totalPrice);

    }
}
