package pkg1;
//Superclass
class Animal {
 // Method to be overridden
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

//Subclass Dog
class Dog extends Animal {
 // Overriding the sound method
 @Override
 	public void sound() {
	 	System.out.println("Dog barks");
 	}
}

//Subclass Cat
class Cat extends Animal {
 // Overriding the sound method
 @Override
 	public void sound() {
	 	System.out.println("Cat meows");
 	}
}

public class B39 {
 public static void main(String[] args) {
     // Creating an object of Animal
     Animal myAnimal = new Animal();
     myAnimal.sound(); // Output: Animal makes a sound

     // Creating an object of Dog
     Animal myDog = new Dog();
     myDog.sound(); // Output: Dog barks

     // Creating an object of Cat
     Animal myCat = new Cat();
     myCat.sound(); // Output: Cat meows
 }
}