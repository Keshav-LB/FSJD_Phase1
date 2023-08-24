package Day7_LiveSession;


//Parent class
class Animal {
 protected String name;
 public Animal(String name) {
     this.name = name;
 }
 public void eat() {
     System.out.println(name + " is eating.");
 }
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }
}



//Child class 1
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 } 
 @Override
 public void sleep() {
     System.out.println(name + " is sleeping like a Real_dog.");
 } 
 public void bark() {
     System.out.println(name + " is barking.");
 }
}



//Child class 2
class Cat extends Animal {
 public Cat(String name) {
     super(name);
 }
 public void meow() {
     System.out.println(name + " is meowing.");
 }
}



//Child class 3
class Lion extends Animal {
 public Lion(String name) {
     super(name);
 }
 
 public void roar() {
     System.out.println(name + " is roaring.");
 }
}


public class inheritance2 {

	public static void main(String[] args) {
		  	Dog dog = new Dog("Buddy");
		  	dog.eat();      // Inherited method from Animal
	        dog.bark();     // Specialized method in Dog class
	        dog.sleep();
	        
		  	System.out.println("**************************************");
	        Cat cat = new Cat("Whiskey");
	        cat.sleep();    // Inherited method from Animal (not overridden)
	        cat.meow();     // Specialized method in Cat class
	        
		  	System.out.println("**************************************");

	        Lion lion = new Lion("Simba"); 
	        lion.sleep();   // Overridden method in Lion class
	        lion.roar();    // Specialized method in Lion class

	}

}
