package one.ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = {
                createOrder("두부", 2000, 3),
                createOrder("김치", 1000, 5),
                createOrder("소주", 3000, 2)
        };

        printOrders(orders);

        System.out.println("총 결제 금액 : " + getTotalAmount(orders));


    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 : " +  order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum = order.price * order.quantity;
        }
        return sum;
    }
}
