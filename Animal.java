// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  // Output: Animal makes a sound

        Dog d = new Dog();
        d.sound();  // Output: Dog barks

        // Dog inherits from Animal, so it can also use Animal's methods if not overridden
    }
}
