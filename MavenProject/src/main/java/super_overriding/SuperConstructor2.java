package super_overriding;

public class SuperConstructor2 extends SuperConstructor1{
	SuperConstructor2()
	{
		super();
		System.out.println("vegetables");
		
	}

	public static void main(String[] args) {
		SuperConstructor2 obj=new SuperConstructor2();

	}

}
