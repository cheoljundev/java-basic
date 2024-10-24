package one.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = input.nextInt();
        input.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번째 주문정보를 입력하세요.");
            System.out.print("상품명: ");
            String produnctName = input.nextLine();
            System.out.print("가격: ");
            int price = input.nextInt();
            System.out.print("수량: ");
            int quantity = input.nextInt();
            input.nextLine();
            orders[i] = createOrder(produnctName, price, quantity);
        }

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
