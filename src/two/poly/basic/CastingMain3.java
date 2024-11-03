package two.poly.basic;

// upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        // 업캐스팅
        Child child = new Child();
        Parent parent1 = (Parent) child; // 원래는 이렇게 들어간다. 생략됨.
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
