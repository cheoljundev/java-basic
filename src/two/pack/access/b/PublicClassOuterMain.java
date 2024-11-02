package two.pack.access.b;

import two.pack.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default class는 다른 패키지 접근 불가
        // DefaultClass1 class1 = new DefaultClass1();
    }
}
