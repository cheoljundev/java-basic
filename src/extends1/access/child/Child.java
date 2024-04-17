package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 2; // 상속관계 or 같은 패키지
//        defaultValue = 3; // 다른 패키지면 불가능
//        privateValue = 4; // 다른 클래스면 불가능

        publicMethod();
        protectedMethod();
//        defaultMethod(); // 다른 패키지면 불가능
//        privateMethod(); // 다른 클래스면 불가능

        printParent();
    }
}
