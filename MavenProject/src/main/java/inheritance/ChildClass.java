package inheritance;

public class ChildClass extends ParentClass {
	public void see()
	{
		System.out.println("hey");
	}

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.show();
		obj.display();
		obj.see();

	}

}
