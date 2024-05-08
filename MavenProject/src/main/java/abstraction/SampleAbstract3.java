package abstraction;

public class SampleAbstract3 extends SampleAbstract2 {
	public void done()
	{
		System.out.println("the end");
	}
	public void vegetables()
	{
		System.out.println("onion");
	}

	public static void main(String[] args) {
		SampleAbstract3 obj=new SampleAbstract3();
		obj.show();
		obj.display();
		obj.fruits();
		obj.vegetables();
		

	}

}
