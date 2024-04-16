package access.ex;

public class Item {
    private  String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantitiy) {
        this.name = name;
        this.price = price;
        this.quantity = quantitiy;
    }

    public String getName(){
        return name;
    }
    public int getSum(){
        return price * quantity;
    }
}
