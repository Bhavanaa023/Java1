package pkg1;
class Animals {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
// Subclass (Mammal inherits from Animal)
class Mammal extends Animals {
    public void walk() {
        System.out.println("Mammal is walking.");
    }
}
// Subclass (Dog inherits from Mammal)
class Dog1 extends Mammal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

public class B40 {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog1 myDog = new Dog1();
        // Access methods from all levels of the hierarchy
        myDog.eat();   // Inherited from Animal
        myDog.walk();  // Inherited from Mammal
        myDog.bark();  // Defined in Dog
    }
}

