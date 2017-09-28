package headFirsJava.chapter16_collections.testGenerics2WithCollections;

import java.util.ArrayList;

/**
 * Created by User on 28.09.2017.
 */
public class TestGenerics2 {

    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    private void go() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        takeAnimals(animals);
    }

    private void takeAnimals(ArrayList<Animal> animals) {
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