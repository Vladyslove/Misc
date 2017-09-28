package headFirsJava.chapter16_collections.testGenerics1WithArray;

/**
 * Created by User on 28.09.2017.
 */
public class TestGenerics {

    public static void main(String[] args) {
        new TestGenerics().go();
    }

    private void go() {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }

    private void takeAnimals(Animal[] animals) {
        for (Animal a: animals) {
            a.eat();
        }
    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {
    void bark() {}
}

class Cat extends Animal {
    void meow() {}
}