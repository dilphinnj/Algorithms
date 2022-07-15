package dilip.sample.oop;

/*Abstraction in a class refers to a briefing on the methods that has to be implemented when extending this class. Also implementing methods inside abstract class are also possible.
Interfaces have only the briefed methods. no implementation can be done inside the interface. they have to be implemented when implementing an interface.

 * Only the abstract methods are essential when extending abstarct class.
 * Implemented methods can be overriden or can be used with the existing
 * implementation.
*/

/*
 * Inheritance is inheriting parent's attributes. This is applied by extending and implementing the abstract class and interface.
 */

/*
 * Polyorphism is the ablity to take different forms. This is applied by overriding and overloading methods.
 * Ex:- Overriding => makeSound() method has different implementations for Dog and Cat.
 * Ex:- overloading => Monkey's jump() method name is the same but it has implementations for different number of arguments and different parameter types
 */

/*Encapsulation
 * 
Binding (or wrapping) code and data together into a single unit is known as encapsulation. 
Helps in creating an object and limiting the scope of variables.

This is done by creating object as a class. Then they have access modifiers such as public, default(no modifier mentioned), protected and private
*/


/// Abstract Class ///

public abstract class Animal {
	public abstract void makeSound();

	public void run() {
		System.out.println("animal running...");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
		dog.run();

		Cat cat = new Cat();
		cat.makeSound();
		cat.run();
		
		Monkey monkey = new Monkey();
		monkey.makeSound();
		monkey.run();
		monkey.jump();
		monkey.jump(100);
		monkey.jump(150, 40);
		monkey.jump("Tree");
	}
}

interface AnimalActions {
	void jump();
	void jump(int distance);
	void jump(int distance,int speed);
	void jump(String location);
}

// Creating Dog by Extending Animal
class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog:: Barkkkkkkkkkk");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat:: Purrrrrrr");
	}

	@Override
	public void run() {
		System.out.println("Cat is running......");
	}
}

//Creating Monkey by Extending Animal and Implementing AnimalActions Interface
class Monkey extends Animal implements AnimalActions {
	@Override
	public void makeSound() {
		System.out.println("Monkey:: Screechhhhhh - ing");
	}

	@Override
	public void run() {
		System.out.println("Monkey is running......");
	}

	@Override
	public void jump() {
		System.out.println("Monkey jumping !!!!");
	}

	@Override
	public void jump(int distance) {
		System.out.println("Monkey jumping a distance of :: "+distance);
	}

	@Override
	public void jump(int distance, int speed) {
		System.out.println("Monkey jumping a distance of :: "+distance+ " at a speed of ::"+speed);		
	}

	@Override
	public void jump(String location) {
		System.out.println("Monkey jumping from the :: "+location);			
	}
}
