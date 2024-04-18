package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
       // 추상클래스 생성 불가
       // AbstractAnimal obj = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 사운드 시작");
        animal.sound();
        System.out.println("동물 사운드 종료");
    }
}
