class Animal{
	String color = "white";
	Animal(String color){
		this.color = color;
	}
	void eat(){
		System.out.println("eating");
	}
}

class Dog extends Animal{
	String color = "black";
	Dog(String animal, String dog){
		super(animal);// here order matters call super
		// should be first statement in constructor
		this.color = dog;
	}

	void printcolor(){
		System.out.println(color);
		System.out.println(super.color);
	}

	void eat(){
		System.out.println("eating dog");
	}
	void work(){
		super.eat();
	}
}

public class SuperClass{
	public static void main(String[] args) {
		Dog o = new Dog("red","justblack");
		o.printcolor();
		o.eat();
		o.work();
	}
}
