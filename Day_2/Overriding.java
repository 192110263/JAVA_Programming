package Day_2;
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Overriding{
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.print("Generic Animal sound: ");
        genericAnimal.makeSound();

        System.out.print("Dog sound: ");
        myDog.makeSound();

        System.out.print("Cat sound: ");
        myCat.makeSound();
    }
}



