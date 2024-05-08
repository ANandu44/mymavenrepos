package abstraction;

public class Sample2 extends Sample1 {
	public void done()
	{
		System.out.println("fruits");
	}
	public void display()
	{
		System.out.println("vegetables");
	}

	public static void main(String[] args) {
		Sample2 obj=new Sample2();
		obj.show();
		obj.display();
		obj.done();
		

	}

}
