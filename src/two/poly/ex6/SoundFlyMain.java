package two.poly.ex6;

import two.poly.ex5.InterfaceAnimal;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chiken chiken = new Chiken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chiken);

        moveAnimal(dog);
        moveAnimal(bird);
        moveAnimal(chiken);

        flyAnimal(bird);
        flyAnimal(chiken);
    }


    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("동물 날기 시작");
        fly.fly();
        System.out.println("동물 날기 종료");
    }

}
