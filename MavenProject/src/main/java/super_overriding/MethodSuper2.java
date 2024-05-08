package super_overriding;

public class MethodSuper2 extends MethodSuper1{
	public void show()
	{
		System.out.println("mango");
		super.show();
	}

	public static void main(String[] args) {
		MethodSuper2 obj=new MethodSuper2();
		obj.show();

	}

}
