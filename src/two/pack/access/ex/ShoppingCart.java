package two.pack.access.ex;

public class ShoppingCart {
    int max = 10;
    private final Item[] cart = new Item[max];
    int count = 0;

    public void addItem(Item item) {
        if (!isMax()) {
            cart[count] = item;
            count++;
        } else {
            System.out.println("장바구니가 꽉 찼습니다.");
        }
    }

    public void displayItems() {
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : cart) {
            if (item != null) {
                int result = item.getResult();
                System.out.println("상품명 : " + item.name + " 합계 :" + result);
                sum += result;
            }
        }
        System.out.println("전체 가격 합 : " + sum);
    }

    private boolean isMax() {
        return count == max;
    }

}
