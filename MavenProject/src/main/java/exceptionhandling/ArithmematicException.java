package exceptionhandling;

public class ArithmematicException {
	public void show()
	{
		try
		{
			int a=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("exception handled");
	}

}
