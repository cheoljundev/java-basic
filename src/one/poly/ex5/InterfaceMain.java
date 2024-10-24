package one.poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인스턴스 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 사운드 시작");
        animal.sound();
        System.out.println("동물 사운드 종료");
    }
}
