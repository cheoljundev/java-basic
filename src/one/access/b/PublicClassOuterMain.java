package one.access.b;

import one.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass1 one.class1 = new DefaultClass1();
    }
}
