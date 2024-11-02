package two.final1;

public class FinalRefMain {
    public static void main(String[] args) {
         final Data data = new Data();
         // data = new Data(); // 오류. 이미 할당함.

        // 참조 대상의 값은 변경이 가능하다.
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
