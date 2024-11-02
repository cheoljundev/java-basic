package two.pack.access.ex;

public class Item {
    String name;
    int price;
    int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getResult() {
        return price * quantity;
    }
}
