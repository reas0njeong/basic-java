package access.ex;

public class ShoppingCarMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("바나나", 100, 1);
        Item item2 = new Item("사과", 500, 3);
        Item item3 = new Item("딸기", 300, 5);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayItems();
    }
}
