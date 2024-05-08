package polymorphism;

public class Overloading {
	public void show()
	{
		System.out.println("hello");
	}
	public void show(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.show();
		obj.show(5);

	}

}
