package one.poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animalArr = {dog, cat, cow};

        // 변하지 않는 부분

        for (Animal animal : animalArr) {
            System.out.println("동물 사운드 시작");
            animal.sound();
            System.out.println("동물 사운드 종료");
        }

    }

}
