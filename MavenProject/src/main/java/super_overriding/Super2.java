package super_overriding;

public class Super2 extends Super1{
	String a="welcome";
	public void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		Super2 obj=new Super2();
		obj.show();
		

	}

}
