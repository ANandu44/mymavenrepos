package My_package;

public class InstanceEg {
	static int a=5;
	int b=5;
	public void show()
	{
		int c=a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		InstanceEg obj=new InstanceEg();
		obj.show();

	}

}
