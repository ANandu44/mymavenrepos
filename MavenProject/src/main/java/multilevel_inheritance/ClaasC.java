package multilevel_inheritance;

public class ClaasC extends ClassB{
	public void add()
	{
		System.out.println("programme");
	}

	public static void main(String[] args) {
		ClaasC obj=new ClaasC();
		obj.show();
		obj.display();
		obj.add();
		

	}

	
}
