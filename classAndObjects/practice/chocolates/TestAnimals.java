package classAndObjects.practice.chocolates;

public class TestAnimals {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println(d.bark());
        System.out.println(c.bark());
        System.out.println(c.name());
        System.out.println(d.name());
    }

}
