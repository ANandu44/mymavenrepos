package exceptionhandling;

public class MultipleCatchBlockProgramme {
	public void show()
	{
		try
		{
			int a=5/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("exception handled");
	}

	public static void main(String[] args) {
		MultipleCatchBlockProgramme obj=new MultipleCatchBlockProgramme();
		obj.show();

	}

}
