package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 1번 할당 가능
//        data1 = 20; // 컴파일 오류
    }

    static void method(final int parameter) {
//        parameter = 10; // 컴파일 오류
    }
}
