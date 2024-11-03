package two.poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        // AbstractAnimal abstractAnimal = new AbstractAnimal(); 추상 클래스 생성 불가
         Dog dog = new Dog();
         Cat cat = new Cat();

         soundAnimal(dog);
         soundAnimal(cat);

         dog.move();
         cat.move();
    }


    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }
}
