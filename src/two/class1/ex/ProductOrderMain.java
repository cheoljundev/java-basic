package two.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력

        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 3;
        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 3;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 3;

        productOrders[0] = order1;
        productOrders[1] = order2;
        productOrders[2] = order3;

        int total = 0;

        for (int i = 0; i < productOrders.length; i++) {
            ProductOrder order = productOrders[i];
            System.out.println("상품명: " + order.productName +  ", 가격: " + order.price + ", 수량: " + order.quantity);
            int result = order.price * order.quantity;
            total += result;
        }

        System.out.println("총 결제 금액 : " + total);




    }
}
