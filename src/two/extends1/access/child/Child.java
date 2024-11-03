package two.extends1.access.child;

import two.extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 2; // 가능, 다른 패키지이지만 상속관계
        // defaultValue = 3; // 불가능. 다른 패키지
        // privateValue = 3; // private 접근 불가

        publicMethod();
        protectedMethod();
        // defaultMethod(); // 접근 불가
        // privateMethod(); // 접근 불가

        printParent(); // 가능.
    }
}
