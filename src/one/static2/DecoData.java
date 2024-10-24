package one.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // instance 변수 접근, 컴파일 에러
//        instanceMethod(); // instance 메서드 접근, 컴파일 에러

        staticValue++; // static 변수 접근
        staticMethod(); // static 메서드 접근
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // instance 변수 접근
        instanceMethod(); // instance 메서드 접근

        staticValue++; // static 변수 접근
        staticMethod(); // static 메서드 접근
    }
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
