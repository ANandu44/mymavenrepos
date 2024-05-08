package heirarchial;

public class Cat extends Animal {
	public void walk()
	{
		System.out.println("walking");
	}

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.run();
		obj.walk();
		Dog obj1=new Dog();
		obj1.bark();
		obj1.run();
		

	}

}
