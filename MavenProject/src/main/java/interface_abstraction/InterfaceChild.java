package interface_abstraction;

public class InterfaceChild implements InterfaceParent  {
	public void show()
	{
		System.out.println("java");
	}

	public static void main(String[] args) {
		InterfaceChild obj=new InterfaceChild();
		obj.show();
		
		
		

	}

}
