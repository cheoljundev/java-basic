package one.static2.ex;

public class Car {
    private String name;
    private static int total;

    public Car(String name) {
        this.name = name;
        total++;
        System.out.println("차량 구입, 이름: " + this.name);
    }

    static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + total);
    }
}
