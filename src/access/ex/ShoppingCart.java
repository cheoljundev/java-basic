package access.ex;

public class ShoppingCart {
    private Item[] cart = new Item[10];
    private int count;
    private int totalSum;
    public void addItem(Item item) {
        if (count >= cart.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        cart[count] = item;
        count++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명 : " + cart[i].getName() + " 합계 : " + cart[i].getSum());
            totalSum += cart[i].getSum();
        }
        System.out.println("전체 가격 합 : " + totalSum);
    }
}
